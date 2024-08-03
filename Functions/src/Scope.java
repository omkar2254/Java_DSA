public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            //int a = 10; already initialized you can't reintialized it

            //you are using same reference variable here
            a = 30; //You can update it - original value will be updated - coz u pass reference
            int c = 283;
        }
        //System.out.println(c); you can't access outside the scope
        System.out.println(a); //output - 30
    }
}
