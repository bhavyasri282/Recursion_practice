import java.util.*;
public class reverse_ofAString_withoutsb {
    static void Reverse(String s,int index){
        if(index<0){
            return;
        }
        System.out.print(s.charAt(index));
        Reverse(s,index-1);
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.next();
        
        Reverse(s,s.length()-1);
    }
}
