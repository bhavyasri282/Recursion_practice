import java.util.*;
public class printing_chars {
    static void printchars(String s,int index){
        if(index==s.length()){
            return;
        }
        System.out.println(s.charAt(index));
        printchars(s,index+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        printchars(s,0);
    }
}