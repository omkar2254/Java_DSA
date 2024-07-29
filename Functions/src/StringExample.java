public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
        int ans = sum(4, 5);
        System.out.println(ans);
        String myMessage = myGreet("Omkar");
        System.out.println(myMessage);
    }

    static String myGreet(String name){
        return "Hello " + name;
    }
    static String greet(){
        String greeting = "HEllo_WorlD";
        return greeting;
    }
    static int sum(int a, int b){
        return a + b;
    }
}
