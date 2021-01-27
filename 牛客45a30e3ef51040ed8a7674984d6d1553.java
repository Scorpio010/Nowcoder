import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class 牛客45a30e3ef51040ed8a7674984d6d1553 {
    public static void main(String[] args) throws Exception{
        Scanner sca = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int ch;
        while((ch=System.in.read())!='0'){
            if ((char)ch=='A') a++;
            if ((char)ch=='B') b++;
        }
        System.in.read();
        System.out.println(a==b?'E':a>b?'A':"B");
    }
}
