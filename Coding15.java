import java.util.Arrays;
import java.util.Scanner;

public class Coding15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VALUE OF N");
        int N = sc.nextInt();
        char[] color=new char[N];
        System.out.println("ENTER COLOR ");
        for (int i = 0; i < N; i++) {
            color[i] = sc.next().charAt(0);
        }
        Arrays.sort(color);

        int max=0;
        char maxcolor='\0';
       int  x=0;
        for (int i = 0; i < N; i+=x) {
            char ch=color[i];
            int count=0;
            x=0;
            for(int j=i; j<N; j++){
                if(color[j]==ch){
                    count++;
                    x++;
                }
            }
            if(count%2!=0){
                maxcolor=ch;
                break;
            }

        }
        System.out.println(maxcolor+"  colour balloon is present odd number of times in the bunch.");
      
    }
}
