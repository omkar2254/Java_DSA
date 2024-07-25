import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
//        sum();
        int add = sum2();
        System.out.println("Addition is: "+add);
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = num1 + num2;
        return ans;
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
    }

    /*
    return_type functionName(){
      //body
      return value
    }
    */
}

