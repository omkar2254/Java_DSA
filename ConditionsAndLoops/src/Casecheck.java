import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Q : checking firstletter is uppercase or not
        System.out.println("Enter string or character");
        char ch = sc.next().trim().charAt(0);
//        System.out.println(ch);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}
