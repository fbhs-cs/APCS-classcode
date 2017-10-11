public class Euclid
{
  public static int gcd(int p, int q)
  {
    if(q==0)
    {
     return p; 
    }
    else 
    {
     int recurse = gcd(q, p%q);
     return recurse;
    }
  }
  
  public static void main(String[] args)
  {
    int p = 100;
    int q = 86;
    int out = gcd(p, q);
   System.out.printf("GCD(%d,%d)=%d",p,q,out);
  }
}