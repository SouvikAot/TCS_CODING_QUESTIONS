/*A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Input :

8  – Value of N

[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

Output:

4 5 1 9 5 0 0 0*/
public class Coding1 {
    void Chocolate(int[] arr, int n){
        int k=0,count=0;
        int[] newarr=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                newarr[k++]=arr[i];
            }
            else {
                count++;
            }
        }
        for(int i=0;i<count;i++){
            newarr[k++]=0;
        }

        System.out.println("FINAL RES:");
        for(int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
