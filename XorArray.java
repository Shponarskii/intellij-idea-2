public class XorArray implements Array
{

    @Override
    public void Slog(int[] a, int[] b, int n)
    {
        int []c=new int[n];
        for (int i=0;i<n;i++)
            c[i]=a[i]^b[i];
        for (int i=0;i<n;i++)
            System.out.print(c[i]+" ");
    }

    @Override
    public void ELem(int[] a, int n)
    {
        for (int i=0;i<n;i++)
            System.out.print(Math.sqrt(a[i])+" ");
    }
}
