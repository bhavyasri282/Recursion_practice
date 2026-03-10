public class print1ton {
    static void print1ton(int n){
        if(n==0)
            return;
        print1ton(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        print1ton(10);
    }
}
public class printnto1 {
    static void printnto1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printnto1(n-1);
    }
    public static void main(String[] args){
        printnto1(10);
    }
}
