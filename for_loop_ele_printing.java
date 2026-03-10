
public class for_loop_ele_printing {
    static void printing(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printing(i+1,n);
    }
    public static void main(String[] args){
        printing(0,5);
    }
}
