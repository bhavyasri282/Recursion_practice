import java.util.*;
public class sum_of_Array_elements {
    static int sum(int arr[],int i,int n){
        if(i>=n){
            return 0;
        }
        return arr[i]+sum(arr,i+1,n);
        
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
        System.out.println("The sum of Array elements is:");
        System.out.println(sum(arr,0,arr.length));
    }
}
