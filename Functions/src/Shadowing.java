public class Shadowing {
    static int x = 90;   //this will be shadowed at line no 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x = 20; //bascially this variable override the upper variable
        System.out.println(x);//20
        fun();
    }
    static void fun(){
        System.out.println(x); //90
    }
}