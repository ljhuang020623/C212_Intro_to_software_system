import java.util.List;

class Problem9 {

    /**
     * TODO.
     * @param l of generic type {@code T} to be converted into a string. This list can contain any type of objects, and it's assumed that each object type has a meaningful {@code toString} implementation.
     * @return A string representation of the list where each element is separated by a comma. If the list is empty, returns an empty string. If the list is {@code null}, the behavior is
     * implementation-dependent but could return an empty string as a safe default.
     */
    public static <T> String stringifyList(List<T> l) {
        if (l == null || l.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l.size(); i++) {
            T item = l.get(i);
            sb.append(item.toString());
            if (i < l.size() - 1) {
                sb.append(",");
            }
        }

        return sb.toString();
    }
}
