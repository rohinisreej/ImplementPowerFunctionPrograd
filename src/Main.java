import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static int powMod(int a,int n,int m){
        if(n==0)
        {
            return 1;
        }
        int p=powMod(a,n/2,m);
        if(n%2==0)
        {
            return (p*p)%m;
        }
        else
        {
            return (p*p*a)%m;
        }

    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        out.println("Enter A");
        int A=scanner.nextInt();
        out.println("Enter B");
        int B=scanner.nextInt();
        out.println("Enter C");
        int C=scanner.nextInt();
        out.println(powMod(A,B,C));
    }
}