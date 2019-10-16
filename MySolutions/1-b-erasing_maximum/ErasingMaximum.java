import java.io.PrintWriter;
import java.util.Scanner;

public class ErasingMaximum {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = in.nextInt();

        int[] result = new int[n - 1];
        int max_ele,count,index,flag;
        // your code
        //compute
        max_ele = -1;
        for(i=0;i<n;i++){
            if(result[i]>max_ele){
                max_ele = result[i];
                count = 1;
                index = i;
            }
            else if(result[i] == max_ele){
                count++;
                if(count==3){
                    index = i;
                }
            }
        }
        //output
        flag=0;
        if(index!=0){
            cout<<out.print(result[0]);
            flag=1;
        }
        for(i=1;i<n;i++){ 
            if(i!=index){
                if(!flag) flag=1;
                else cout<<" ";
                out.print(result[i]);
            }
        }


        out.println();

        in.close();
        out.close();
    }
}