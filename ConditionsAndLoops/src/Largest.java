import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number 1");
        int n1 = sc.nextInt();
        System.out.println("Enter a number 2");
        int n2 = sc.nextInt();
        System.out.println("Enter a number 3");
        int n3 = sc.nextInt();


        //Q : find the largest number
//        int big = n1;
//       if(big > n2 && big > n3){
//           System.out.println("n1 is bigger");
//       }else if(n2 > n3){
//           System.out.println("n2 is bigger");
//       }else{
//           System.out.println("n3 is bigger");
//       }

       //simple logic
        /*
        int max = n1;
         if(n2 > max){
             max = n2;
         }
         if(n3 > max){
             max = n3;
         }
         */

        //Using inbuilt function
        int max = Math.max(n3, Math.max(n1, n2));
        System.out.println("Max value: "+max);
    }
}
