import java.util.*;
public class withSB_reverseOfString {
    static void reverse_withSB(String s,int index,StringBuilder sb){
        if(index<0){
            System.out.print(sb);
            return;
        }
        sb.append(s.charAt(index));
        reverse_withSB(s,index-1,sb);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        reverse_withSB(s,s.length()-1,sb);
    }
}
