import java.util.*;
public class count_ofVowels {
    static int count_vowels(String s,int index){
        if(index==s.length()){
            return 0;
        }
        char c=s.charAt(index);
        int count=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')?1:0;
        return count+count_vowels(s,index+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        System.out.println(count_vowels(s,0));
    }
}
