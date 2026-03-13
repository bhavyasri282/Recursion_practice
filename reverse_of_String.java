public class reverse_of_String {
    static void reverse(String s){
       if(s.length()==0){
           return;
       }
       reverse(s.substring(1));
       System.out.println(s.charAt(0));
    }
    public static void main(String[] args){
        String s="hello";
        reverse(s);
    }
}
