import java.util.*;
public class check_palindrome {
    static boolean checkpalin(String s,int start,int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return checkpalin(s,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
        if(checkpalin(s,0,s.length()-1)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}