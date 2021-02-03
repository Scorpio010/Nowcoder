import java.util.Scanner;

public class 牛客13aeae34f8ed4697960f7cfc80f9f7f6 {

    public static int getmonthday(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {return 29;}
                else  return 28;
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) return true;
            else {
                return false;
            }
        }
        else{
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int year = sca.nextInt();
            int month = sca.nextInt();
            System.out.println(getmonthday(month,year));
        }
    }

}