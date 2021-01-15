import java.util.Scanner;

public class 牛客58b6a69b4bf943b49d2cd3c15770b9fd {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String[] a = sca.nextLine().split("[;,]");
        int id = Integer.parseInt(a[0]);
        double s1 = Double.parseDouble(a[1]);
        double s2 = Double.parseDouble(a[2]);
        double s3 = Double.parseDouble(a[3]);
        System.out.println("The each subject score of  No. "+id+" is "+String.format("%.2f", s1) + ", " + String.format("%.2f", s2) + ", " + String.format("%.2f", s3) + ".");
    }

    }

