import java.util.*;
public class printing_array_elements {
    static void printArrayele(int arr[],int i,int n){
        if(i>=n){
            return;
        }
        System.out.print(arr[i]+" ");
        printArrayele(arr,i+1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        printArrayele(arr,0,arr.length);
    }
}