import java.util.Arrays;
public class Overloading {
    public static void main(String[] args) {
        fun(90);
        fun("Omkar");

        sum(90, 32);
        sum(3, 3, 3);

        demo("Kunal", "Omkar");
        demo(1, 2, 3, 4, 5);
        //demo() - you can't run like this it creates an error this is ambiguity
        //program is unable to decide which file to run
    }
    static int sum(int a,int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String s){
        System.out.println(s);
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
