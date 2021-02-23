import java.util.Scanner;

/**
 * Created by USER on 12/02/2021.
 */
public class Ops {
    int []a=new int[5];
    int num=0;
    public void add(int newE){
        if(num<a.length)
        {
            a[num]=newE;
            num++;
        }
        else
            System.out.println("array is full");
    }
    public void reverse()
    {
        int n=a.length-1;
        for (int i = 0; i <a.length/2 ; i++) {
            int t=a[i];
            a[i]=a[n];
            a[n]=t;
            n--;
        }
    }
    public void ShiftLeft()
    {
        int i;
        for ( i = 0; i <a.length-1 ; i++) {
            a[i]=a[i+1];
        }
        a[i]=0;
    }
    public void print ()
    {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+",");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Ops o=new Ops();
        o.print();
        Scanner s=new Scanner(System.in);
        while (true)
        {
            o.add(s.nextInt());
            o.print();
        }
    }
}
