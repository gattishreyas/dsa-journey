import java.util.Scanner;
public class blockswap{
    static void rotate(int[] arr,int k){
        k=k%arr.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }


        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }

        for(int i=0;i<k;i++){
            arr[arr.length-k+i]=temp[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

}
