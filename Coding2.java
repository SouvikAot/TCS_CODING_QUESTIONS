import java.util.Scanner;

/*Problem Statement –

Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

Constrains-

1<=N<=100

Example 1:

Input :

10  -> Integer

Output :

5    -> result- Integer */
public class Coding2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A DECIMAL NUMBER");
        int x= sc.nextInt();
       String str=(Integer.toBinaryString(x));
        System.out.println(str);
        String newstr=new String();
        for (int i=0 ; i<str.length() ; i++) {
            char ch=str.charAt(i);
            if (ch=='1'){
                newstr= newstr+"0";
            }
            else {
                newstr=newstr+"1";
            }
        }
        int decimal=Integer.parseInt(newstr,2);
        System.out.println(decimal);

    }

}
