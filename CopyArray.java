/**
 * Created by USER on 12/02/2021.
 */
public class CopyArray {
    public static void main(String[] args) {
        int []x={10,20,30,40,50,60};
        int []y=new int[x.length];
        for (int i = 0; i <x.length ; i++) {
            y[i]=x[i];
            System.out.print(x[i]+"    ");
            System.out.println(y[i]+"  ");}

    }

}
