public class to_checkArray_isSortedOrNot {
    static boolean isSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }
    public static void main(String[] args){
        int arr[]={1,2,4,3};
        System.out.println(isSorted(arr,0));
        if(isSorted(arr,0)){
            System.out.println("sorted");
        }else{
            System.out.println("note sorted");
        }
    }
}