/*Particulate matters are the biggest contributors to Delhi pollution. The main reason behind the increase in the concentration of PMs include vehicle emission by applying Odd Even concept for all types of vehicles. The vehicles with the odd last digit in the registration number will be allowed on roads on odd dates and those with even last digit will on even dates.

Given an integer array a[], contains the last digit of the registration number of N vehicles traveling on date D(a positive integer). The task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.

Note : For violating the rule, vehicles would be fined as X Rs.

Example 1:

Input :

4 -> Value of N

{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line

12 -> Value of D, i.e. date

200 -> Value of x i.e. fine

Output :

600  -> total fine collected

*/
import java.util.Scanner;

public class Coding10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMBER ON VEHICAL");
        int number = sc.nextInt();
        int[] vehical=new int[number];
        System.out.println("ENTER REGISTRATION NUMBER LAST DIGIT");
        for(int i=0;i<number;i++)
        {
            vehical[i]=sc.nextInt();
        }
        System.out.println("ENTER FINE AMOUNT");
        int fine=sc.nextInt();
        System.out.println("ENTER DATE");
        int date = sc.nextInt();
        int count=0;
            if(date%2==0){
                for(int j=0; j<number;j++){
                    if(vehical[j]%2!=0){
                        count++;
                    }
                }
                System.out.println("TOTAL COLLECTED FINE"+(fine*count));
            }
            else{
                for(int j=0; j<number;j++){
                    if(vehical[j]%2==0){
                        count++;
                    }
                }
                System.out.println("TOTAL COLLECTED FINE="+(fine*count));
            }
        }
    }

