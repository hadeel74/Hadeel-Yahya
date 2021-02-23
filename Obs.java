import java.util.Scanner;

/**
 * Created by USER on 12/02/2021.
 */
public class Obs {
    int []x={10,15,18,19,25,11,8,177};
    int position;
    int i;
    public void remove()
    {
        for ( i =position+1 ; i <x.length ; i++) {
            x[i-1]=x[i];
        }
        i--;
    }
    public void print ()
    {
            System.out.println(x[position]);
            System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int position =e.nextInt();
       Obs s=new Obs();
        s.remove();
        s.print();
    }
}
