import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong_Numbers: ");
       for(int i=100; i<999; i++){
           if(isArmstrong(i)){
               System.out.print(i + " ");
           }
       }
    }

    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n /= 10;
        }
        if(sum == temp){
            return true;
        }
        return false;
    }
}
