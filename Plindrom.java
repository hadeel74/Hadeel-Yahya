import java.util.Scanner;

/**
 * Created by USER on 12/02/2021.
 */
public class Plindrom {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.next();
        String x ="";
        for (int i =s.length()-1 ; i >=0 ; i--) {
         x+=s.charAt(i);

        }
        System.out.println("the reverse is :"+x);
        if(s.equals(x))
            System.out.println("its plindrom");
        else
            System.out.println("its not plindrom");

    }

}
