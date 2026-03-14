public class maxElement_in_an_array {
    static int printMax(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int maxRest=printMax(arr,index+1);
        return Math.max(arr[index],maxRest);
    }
    public static void main(String[] args){
        int arr[]={1,4,2,5,6};
        System.out.println("The maximum element is: ");
        System.out.println(printMax(arr,0));
    }
}
