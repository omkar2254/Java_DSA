import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        int start = 2;
        while(start < n){
            if(n % start == 0){
                return false;
            }
            start++;
        }
        return true;
    }
}
