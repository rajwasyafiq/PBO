import java.util.Scanner;
public class NomorDua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("berat badan (kg) = ");
        double bb = sc.nextDouble();
        System.out.println("tinggi badan (cm) = ");
        double tb = sc.nextDouble();
        System.out.println("jenis kelamin (l/p) = ");
        String jk = sc.next();
        tb /= 100;
        double bmi = bb/(tb*tb);

        double ob = 27;
        double gem = 23;
        double norm = 17;

        if(jk.equals("P")) {
            gem = 25;
            norm = 18;
        }
        System.out.println("bmi = " + bmi);
        if(bmi>ob){
            System.out.println("Obesitas");           
        } else if(bmi>gem) {
            System.out.println("overweight");
        } else if(bmi>norm) {
            System.out.println("ideal");
        } else {
            System.out.println("underweight");
        }
    }


}
