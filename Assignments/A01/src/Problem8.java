public class Problem8 {
    public static boolean not(boolean P){
        return !P;
    }
    public static boolean and(boolean P, boolean Q){
        return P && Q;
    }
    public static boolean or(boolean P, boolean Q){
        return P || Q;
    }
    public static boolean cond(boolean P, boolean Q){
        return !P || Q;
    }
    public static boolean bicond(boolean P, boolean Q){
        return P == Q;
    }
}
