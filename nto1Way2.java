import java.util.*;
public class nto1Way2 {
    static void print1toN(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        print1toN(i-1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        System.out.println("Enter the i value: ");
        int i=sc.nextInt();
        print1toN(i,n);
    }
}
