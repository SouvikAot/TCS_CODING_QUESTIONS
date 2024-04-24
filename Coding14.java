import java.util.Scanner;

/*A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

Example 1:
Input :

5    -> Value of T
[7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line
[1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
Output :
8     -> Maximum number of guests on cruise at an instance.
 */
public class Coding14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VALUE OF HOURS");
        int hours = sc.nextInt();
        int[] enter=new int[hours];
        int[] exit=new int[hours];
        System.out.println("ENTRY PERSON");
        for (int i = 0; i < hours; i++) {
            enter[i]=sc.nextInt();
        }
        System.out.println("EXIT PERSON");
        for (int i = 0; i < hours; i++) {
            exit[i]=sc.nextInt();
        }
        int max=0;
        int person=0,count=0;
        for (int i = 0; i < hours; i++) {
            person=enter[i]-exit[i];
            max=person+max;
            if(count<max){
                count=max;
            }
        }
        System.out.println("MAXIMUM PERSON IS "+count);
    }
}
