/**
 * Created by USER on 12/02/2021.
 */
public class Arrays {
    int []a={1,2,3,4,5,6};
    public void reverse()
    {
        for (int i = 0; i <a.length ; i++) {
            if(i==a.length-1)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+",");
        }
        System.out.println("         ");
        for (int i = a.length-1; i >=0 ; i--) {
            if(i==a.length)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+",");
        }
    }
    public static void main(String[] args) {
       Arrays ar=new Arrays();
        ar.reverse();
    }
}