import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class 连续最长数字串 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNextLine()){
            String str = sca.nextLine();
            System.out.println(Substr(str));

        }
    }
    public static String Substr(String str){
        int max=0;int end=0;int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                count++;
            }
            if (count>max){
                max=count; end=i;
            }else count=0;
        }
        return  str.substring(end-max+1,end+1);
    }
}
