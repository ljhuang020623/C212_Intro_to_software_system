public class Problem2 {
    void printTriangle(int n){
        int num = 1;
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        return;
    }
}