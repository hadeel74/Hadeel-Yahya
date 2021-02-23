/**
 * Created by USER on 12/02/2021.
 */
public class Copy {
    int []x={10,20,30,40,50,60};
    int []y=new int[x.length];
    public void copy()
    {
        for (int i = 0; i <x.length ; i++) {
            y[i] = x[i];
        }
    }
    public void print()
    {
        for (int i = 0; i <x.length ; i++) {
            System.out.print(x[i]+"    ");
            System.out.println(y[i]+"  ");
        }
    }
    public static void main(String[] args) {
Copy c=new Copy();
        c.copy();
        c.print();

    }
}
