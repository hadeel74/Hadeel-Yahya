/**
 * Created by USER on 12/02/2021.
 */
public class Operations {
    int []a={1,2,3,4,5};
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
    public void print ()
    {
        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {
         if(i==a.length-1)
             System.out.print(a[i]);
             else
             System.out.print(a[i]+",");


        } System.out.println("]");
    }
    public static void main(String[] args) {
        Operations s=new Operations()  ;
        s.print();
        s.reverse();
        s.print();
    }
}
