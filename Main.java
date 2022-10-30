import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input kol-vo: ");
        int k=sc.nextInt();
        Array []f=new Array[k];
        for (int i=0;i<k;i++)
        {
            int p=sc.nextInt();
            System.out.println("Input 2 arrays: ");
            int n=sc.nextInt();
            int[]a=new int[n];
            for (int j=0;j<n;j++)
                a[j]=sc.nextInt();
            int[]b=new int[n];
            for (int j=0;j<n;j++)
                b[j]=sc.nextInt();
            if (p==1)
                f[i]=new XorArray();
            if (p==2)
                f[i]=new SortArray();
            f[i].Slog(a,b,n);
            System.out.println();
            f[i].ELem(a,n);
            System.out.println();
            f[i].ELem(b,n);
        }
    }
}