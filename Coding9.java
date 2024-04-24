import java.util.Scanner;

public class Coding9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VALUE OF R");
        int r = sc.nextInt();
        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();
        int sum = 0;
        if(r>0){
        while (n != 0) {
            int rem=n%10;
            n=n/10;
            sum=rem+sum;
        }
        sum=sum*r;
        int res=0;
            while (sum != 0) {
                int rem=sum%10;
                sum=sum/10;
                res=res+rem;
            }
            System.out.println(res);
    }
        else {
            System.out.println(0);
        }
    }
}
