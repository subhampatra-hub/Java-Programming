import java.util.*;

public class LargeNumArr {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int pos=0;
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the array elements in an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
                pos=i;

            }
        }
        System.out.println("The largest elements in an array is "+large+" in the "+ pos+" position.");
    }
    
}
