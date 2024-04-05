import java.util.HashMap;

class Problem6 {

    /**
     * TODO.
     * @param s The input string possibly containing punctuation and mixed case letters.
     * @return A HashMap where keys are words (in lower case) and values are the counts of those words.
     */
    public static HashMap<String, Integer> wordCount(String s) {
        // Remove punctuation and convert to lower case
        String cleanedString = s.replaceAll("[.,!?:;#&*()\\-]", "").toLowerCase();

        // Tokenize the string
        String[] words = cleanedString.split("\\s+");

        // Count words
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            // Handle numbers and words uniformly
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }
}
