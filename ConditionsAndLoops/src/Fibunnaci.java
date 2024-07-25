import java.util.Scanner;

public class Fibunnaci {
    public static void main(String[] args) {
        //Q : fibunnaci no
        // 0,1,1,2,3,5,8..
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a serieal no for fibunnaci: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 2;
        while(i <= num){
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }
        System.out.println("fibunnaci no at serial no "+ num + " is "+b);
    }
}
