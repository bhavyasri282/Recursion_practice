import java.util.*;
public class palin_check_withsb {
    static void pal_check(String s,int index,StringBuilder sb){
        if(index<0){
            return;
        }
        sb.append(s.charAt(index));
        pal_check(s,index-1,sb);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        pal_check(s,s.length()-1,sb);
        if(s.equals(sb.toString())){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}