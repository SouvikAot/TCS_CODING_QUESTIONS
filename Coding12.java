import java.util.Scanner;

/*Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal*/
public class Coding12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING S WITH * AND #");
        String s = sc.nextLine();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                count++;
            }
        }
        int c=s.length()-count;
        if(c<count){
            System.out.println("POSITIVE INTEGER");
        } else if (c==count) {
            System.out.println(0);
        }
        else {
            System.out.println("NEGATIVE INTEGER");
        }
    }
}
