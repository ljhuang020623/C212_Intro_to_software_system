import java.util.ArrayList;
import java.util.List;

public class BhmDatabase {

  /**
   * Parses and executes a query against the provided database.
   *
   * @param db The database represented as a 2D array of strings.
   * @param query The SELECT query to execute.
   * @return A list of strings representing the query results.
   */
  static List<String> query(String[][] db, String query) {
    // Assuming query format is strictly followed
    String[] parts = query.split("WHERE");
    String predicate = parts[1].trim();
    return handleSelectQuery(db, predicate);
  }

  /**
   * Handles the SELECT query based on the predicate.
   *
   * @param db The database to query.
   * @param predicate The predicate of the query.
   * @return The result of the query.
   */
  private static List<String> handleSelectQuery(String[][] db, String predicate) {
    List<String> results = new ArrayList<>();
    String[] predicateParts = predicate.split(" ");
    String header = predicateParts[0];
    String comparator = predicateParts[1];
    String value = predicateParts[2].replaceAll("'", ""); // Remove quotes

    int columnIndex = getColumnIndex(db[0], header);
    if (columnIndex == -1) {
      return results; // Column not found
    }

    for (int i = 1; i < db.length; i++) {
      String cellValue = db[i][columnIndex];
      if (matches(cellValue, comparator, value)) {
        results.add(db[i][1]); // Assuming name is always in the second column
      }
    }

    return results;
  }

  /**
   * Finds the index of a column based on its header.
   *
   * @param headers Array of headers.
   * @param header The header to find.
   * @return The index of the header, or -1 if not found.
   */
  private static int getColumnIndex(String[] headers, String header) {
    for (int i = 0; i < headers.length; i++) {
      if (headers[i].equalsIgnoreCase(header)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Evaluates if a database cell matches the given predicate.
   *
   * @param cellValue The value of the database cell.
   * @param comparator The comparator used in the predicate.
   * @param value The value to compare against.
   * @return true if the cell matches the predicate; false otherwise.
   */
  private static boolean matches(String cellValue, String comparator, String value) {
    switch (comparator) {
      case "=":
        return cellValue.equals(value);
      case "LIKE":
        return likeMatch(cellValue, value);
      // Additional comparators (e.g., ">", "<") to be implemented
    }
    return false;
  }

  /**
   * Handles LIKE comparisons.
   *
   * @param cellValue The database cell value.
   * @param pattern The LIKE pattern.
   * @return true if the cellValue matches the pattern; false otherwise.
   */
  private static boolean likeMatch(String cellValue, String pattern) {
    if (pattern.startsWith("%") && pattern.endsWith("%")) {
      return cellValue.contains(pattern.substring(1, pattern.length() - 1));
    } else if (pattern.startsWith("%")) {
      return cellValue.endsWith(pattern.substring(1));
    } else if (pattern.endsWith("%")) {
      return cellValue.startsWith(pattern.substring(0, pattern.length() - 1));
    } else {
      return cellValue.equals(pattern);
    }
  }
}
