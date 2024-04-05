public class Problem2 {
    public static double computeGpa(String grade){
        double gpa = 0;
        if (grade.charAt(0) == 'A'){
            gpa += 4.0;
        } else if (grade.charAt(0) == 'B'){
            gpa += 3.0;
        } else if (grade.charAt(0) == 'C'){
            gpa += 2.0;
        } else if (grade.charAt(0) == 'D'){
            gpa += 2.0;
        } else if (grade.charAt(0) == 'F'){
            gpa = 0;
        }
        if (grade.length() == 2){
            if (grade.charAt(1) == '+' && grade.charAt(0) != 'A'){
                gpa += 0.3;
            } else if (grade.charAt(1) == '-'){
                gpa -= 0.3;
            }
        }
        return gpa;
    }
}
