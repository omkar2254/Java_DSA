import java.util.Scanner;

public class Fruit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "mango" -> System.out.println("Fruit is mango");
            case "apple" -> System.out.println("Fruit is apple");
            case "cherry" -> System.out.println("Fruit is cherry");
            default -> System.out.println("I am fruit");
        }
    }
}
