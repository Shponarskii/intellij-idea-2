public class SortArray implements Array
{
    @Override
    public void Slog(int[]a,int[]b,int n)
    {
        int k=0;
        int []c=new int[2*n];
        for (int i=0;i<n;i++)
            c[i]=a[i];
        for (int i=0;i<n;i++) {
            boolean flag=true;
            for (int j = 0; j < n; j++)
                if (c[j] == b[i]) {
                    flag = false;
                    break;
                }
            if (flag)
            {
                c[n+k]=b[i];
                k++;
            }
        }
        for (int i=0;i<n+k;i++)
            System.out.print(c[i]+" ");
    }

    @Override
    public void ELem(int[]a,int n)
    {
        int temp;
        for (int i=n-1;i>0;i--) {
            for (int j = 0; j < i; j++)
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
