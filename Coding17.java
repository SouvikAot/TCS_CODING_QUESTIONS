/*Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

Display the most fit trainee (or trainees) and the highest average oxygen level.

Note:

The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
Average Oxygen Values should be rounded.
Example 1:
INPUT VALUES
95
92
95
92
90
92
90
92
90

OUTPUT VALUES
Trainee Number : 1
Trainee Number : 3

Note:
Input should be 9 integer values representing oxygen levels entered in order as

Round 1

Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Round 2

Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Round 3

Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Output must be in given format as in above example. For any wrong input final output should display “INVALID INPUT”import java.util.Scanner;
*/
import java.util.Arrays;
import java.util.Scanner;
public class Coding17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round=3;
        int candidate=3;
        int[] arr=new int[round*candidate];
        System.out.println("OXYGEN LENEL");
        for(int i=0;i<round*candidate;i++){
            int x=sc.nextInt();
            if(x>=1&&x<=100){
                arr[i]=x;
            }
            else{
                System.out.println("The oxygen value entered should not be accepted");
            }
        }
        float c1=0,c2=0,c3=0;

       float[] average=new float[round];
       for(int i=0;i<round;i++){
           float sum=(arr[i]+arr[i+3]+arr[i+6]);
           average[i]=sum/3;
       }
       for(int i=0;i<round;i++){
           System.out.println(average[i]);
       }
       float max=0;
       for(int i=0;i<candidate;i++){
          if(average[i]>max){
              max=average[i];
              c1=i;
           }
           if(average[i]>70.0){
               c3=1;
           }
       }
       for (int i=0; i<round; i++) {
           if(max==average[i] && c1!=i){
               System.out.println("MAXIMUM OXYGEN VALUE PRESEMT TRAINEE  "+(i+1));
           }
       }
        System.out.println("MAXIMUM OXYGEN VALUE PRESENT TRAINEE : "+(c1+1));
        if(c3==0){
            System.out.println("All trainees are unfit.");
        }

    }
}
