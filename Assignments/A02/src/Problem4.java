public class Problem4 {
    public static int atoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        s = s.trim();
        if (s.isEmpty()) return 0;

        long result = 0;
        int index = 0;
        boolean isNegative = false;

        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            isNegative = s.charAt(index) == '-';
            index++;
        }

        while (index < s.length()) {
            char c = s.charAt(index);
            if (!Character.isDigit(c)) break;

            result = result * 10 + (c - '0');
            if (!isNegative && result > Integer.MAX_VALUE) return 0;
            if (isNegative && -result < Integer.MIN_VALUE) return 0;

            index++;
        }

        result = isNegative ? -result : result;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
