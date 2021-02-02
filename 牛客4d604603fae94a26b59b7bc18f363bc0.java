import java.util.Scanner;

public class 牛客4d604603fae94a26b59b7bc18f363bc0 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int weight = sca.nextInt();
            int height = sca.nextInt();
            double BMI = weight / (height/100.0*height/100.0);
            if(BMI < 18.5){
                System.out.println("Underweight");
            }else if(BMI >=18.5 && BMI <= 23.9){
                System.out.println("Normal");
            }else if(BMI > 23.9 && BMI <= 27.9){
                System.out.println("Overweight");
            }else{
                System.out.println("Obese");
            }
        }
    }
}
