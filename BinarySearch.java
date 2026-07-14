import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=5;
        Scanner sc=new Scanner(System.in);
        target=sc.nextInt();
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("Element found at index: "+mid);
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                System.out.println("Element not found");
            }
        }
    }
    
}

