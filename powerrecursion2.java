public class powerrecursion2 {
    public static int printPower(int x,int n)
    {
      if(n==0)//base case1
      {
        return 1;
      }
      if(x==0)//base case2
      {
        return 0;
      }
      //if n is even
      if(n%2==0)
      {
        return printPower(x, n/2)*printPower(x, n/2);
      }
      //if n is odd
      else{
        return printPower(x, n/2)*printPower(x, n/2)*x;
      }
    }
    public static void main(String args[])
    {
        int x=2, n=5;
        int ans=printPower(x, n);
        System.out.println(ans);

    }
    
}
