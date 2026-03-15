import java.util.*;
public class removing_char_withsb {
    static void removeChar(String s,int index,StringBuilder sb){
        if(index==s.length()){
            System.out.println(sb);
            return;
        }
        char ch=s.charAt(index);
        if(ch!='a'){
            sb.append(s.charAt(index));
        }
        removeChar(s,index+1,sb);
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String: ");
       String s=sc.nextLine();
       StringBuilder sb=new StringBuilder();
       removeChar(s,0,sb);
    }
}
