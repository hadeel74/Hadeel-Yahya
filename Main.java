/**
 * Created by USER on 12/02/2021.
 */
public class Main {
    public static void main(String[] args) {
        int []arr ={1,1,2,0,2,3,3,4,4,0,2,3,1,1,2,5};
        int [] newArr;
        int numberOfElementOfNewArray=0;
        boolean isContainZero=false;
        int index;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0)
            {
                numberOfElementOfNewArray++;
                isContainZero=true;
                break;
            }
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }
            }
        }
        System.out.println("arr:   ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n newArr: ");
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0)
            {
                numberOfElementOfNewArray++;
            }
        }
        newArr =new int[numberOfElementOfNewArray];
        index = (isContainZero) ? 1 :0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0)
            {
                newArr[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(newArr[i]+"  ");
        }
    }
}
