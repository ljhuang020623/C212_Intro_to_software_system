public class Problem1 {
    void breakNumber(int n){
        if (n < 10){
            System.out.print(n);
            return;
        }
        breakNumber(n / 10);
        System.out.print(n % 10);
    }
}
