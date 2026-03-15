import java.util.*;
public class remove_char_withoutsb {
    static String removeChar(String s,int index){
        if(index==s.length()){
            return "";
        }
        char ch=s.charAt(index);
        if(ch=='a'){
            return removeChar(s,index+1);
        }
        return ch+removeChar(s,index+1);
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String: ");
       String s=sc.nextLine();
       System.out.println(removeChar(s,0));
    }
}
