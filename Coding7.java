import java.util.Scanner;

/*
A furnishing company is manufacturing a new collection of curtains. The curtains are of two colors aqua(a) and black (b). The curtains color is represented as a string(str) consisting of a’s and b’s of length N. Then, they are packed (substring) into L number of curtains in each box. The box with the maximum number of ‘aqua’ (a) color curtains is labeled. The task here is to find the number of ‘aqua’ color curtains in the labeled box.

Note :

If ‘L’ is not a multiple of N, the remaining number of curtains should be considered as a substring too. In simple words, after dividing the curtains in sets of ‘L’, any curtains left will be another set(refer example 1)

Example 1:

Input :

bbbaaababa -> Value of str

3    -> Value of L

Output:

3   -> Maximum number of a’s
*/
public class Coding7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("ENTER INPUT STRING WITH ONLY a and b");
        str = sc.nextLine();
        System.out.println("ENTER SEGMENT LENGTH");
        int seg = sc.nextInt();
        int max = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % seg == 0) {
                max = Math.max(max, count);
                count = 0;
            }
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
}
