public class StringBuilder_printing {
    static void built(String s,int index,StringBuilder sb){
        if(index==s.length()){
            System.out.println(sb);
            return;
        }
        sb.append(s.charAt(index));
        built(s,index+1,sb);
    }
    public static void main(String[] args){
        String s="abc";
        StringBuilder sb=new StringBuilder();
        built(s,0,sb);
    }
}