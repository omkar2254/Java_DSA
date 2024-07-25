import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        //syntax
        for(intialization; condition; increment/decrement){
            //further code or body
        }
        */

        //Q : print numbers from 1 to 5
        for(int i = 1; i < 6; i++){
            System.out.println(i);
        }

        //Q : print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        /*
        While loop :
        while(condition){
           //body
        }
        */

        //Q :  print numbers from 1 to num
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i = 1;
        while(i < num){
            System.out.println(i);
            i++;
        }

        /*
        do-while loop
        do{
           //body
        }while(condition)
        */

        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k < 5);

        //Below code run at least once
        int number = 36;
        do{
            System.out.println("Hello Jimmy");
        }while(number != 36);
    }
}
