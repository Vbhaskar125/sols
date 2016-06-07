import java.util.Scanner;

/**
 * Created by root on 7/6/16.
 */
public class cf515C {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String[] rep={"0","1","2","3","22","5","23","7","2222","33"};
    String num=""+sc.nextInt();

    char[] ndigits=new char[num.length()];
    for (int i = 0; i <num.length() ; i++) {
        ndigits[i]=num.charAt(i); System.out.println(ndigits[i]);
    }

    
    for (int i = 0; i < ndigits.length -1; i++) {
        for (int j = i+1; j <ndigits.length; j++) {
            if(ndigits[i]<ndigits[j]){

            }
        }
    }
    String op="";
    for (int i = 0; i <ndigits.length ; i++) {
        op+=ndigits[i]+"";
    }

System.out.println(op);

}
}
