import java.util.*;
public class printName {
    static void printName(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Bhavya Sri");
        printName(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        System.out.println("Enter i value: ");
        int i=sc.nextInt();
        printName(i,n);
    }
}