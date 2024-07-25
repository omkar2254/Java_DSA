public class Conditions {
    public static void main(String[] args) {
        int salary = 20000;
        if(salary > 10000){
            salary += 5000;
        }else if(salary > 20000){
            salary += 2000;
        }else{
            salary += 3000;
        }
        System.out.println("Current salary: "+salary);
    }
}
