import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        changeVal(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeVal(int [] nums){
        nums[0] = 9;//Here if you make the change in this object via this ref variable is it going to change in the same object
    }
}
