public class Concurrences {
    public static void main(String[] args) {
        int num = 3237837;
        int count = 0;
        while(num != 0){
            int rem = num % 10;
            if(rem == 3){
                count++;
            }
            num = num / 10;
        }
        System.out.println("3 occure in number: "+count+" times");
    }
}
