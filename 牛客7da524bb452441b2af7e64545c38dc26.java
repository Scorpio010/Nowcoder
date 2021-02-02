import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class 牛客7da524bb452441b2af7e64545c38dc26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            if(a == 0) {
                System.out.println("Not quadratic equation");
                continue;
            }
            double d = b*b - 4*a*c;
            double shi = -b/(2*a);
            if(d == 0){
                System.out.printf("x1=x2=%.2f\n", shi);
            }
            if(d > 0){
                double xu = Math.sqrt(d)/(2*a);
                System.out.printf("x1=%.2f;x2=%.2f\n", shi - xu, shi + xu);
            }
            if(d < 0){
                double xu = Math.sqrt(-d)/(2*a);
                System.out.printf("x1=%.2f-%.2fi;x2=%.2f+%.2fi\n", shi, xu, shi, xu);
            }
        }
    }
}