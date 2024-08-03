import java.util.Arrays;

public class VarArgs {
    public static void main(String [] args){
        fun(1, 2, 3, 4, 5);
        multiple(2, 2, "Om", "the", "developer");
    }

    //Order of argument need to same while passing args like this
    static void multiple(int a, int b, String ...v){
        System.out.println();
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
