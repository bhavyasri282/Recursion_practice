public class practice_p2 {
    static boolean sortedOrNot(int arr[],int index){
        if(index==arr.length-1)
            return true;
        if(arr[index]>arr[index+1])
            return false;
        return sortedOrNot(arr,index+1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println(sortedOrNot(arr,0));
    }
}
