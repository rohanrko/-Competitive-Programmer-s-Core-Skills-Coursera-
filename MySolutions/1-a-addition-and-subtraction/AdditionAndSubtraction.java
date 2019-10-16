import java.io.PrintWriter;
import java.util.Scanner;

public class AdditionAndSubtraction {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x, y, z;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        int result = -1;

        // your code
        if(z==0) {
            System.out.print("0\n");
            continue;
        }
        if((x-y)==0){
            if(z==x) System.out.print("1\n");
            else System.out.print("-1\n");
            continue;
        }
        if(z%(x-y)==0){
            n1 = z/(x-y) + 1;
            n1 = 2*(n1-1);
        }
        else
            n1 = 100000000;
        if((z-x)%(x-y)==0){
            n2 = (z-x)/(x-y) + 1;
            n2 = 2*n2-1;
        }
        else 
            n2 = 100000000;
        if(n1<0) n1=100000000;
        if(n2<0) n2=100000000;
        if(n1<n2) System.out.print(n1);
        else if(n2<n1) System.out.print(n2);
        else System.out.print("-1");
        System.out.print("\n");

        out.println(result);

        in.close();
        out.close();
    }
}