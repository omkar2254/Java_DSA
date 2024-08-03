public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Value before swap: "+ a + b);
        swap(a, b);
        System.out.println("Value after swap: "+ a + b);

        String name = "Omkar Patil";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name){
        name = "Kunal Kushwaha";
    }
    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
