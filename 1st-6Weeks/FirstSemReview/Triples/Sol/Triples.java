public class Triples
{
   private int number;

 public Triples()
 {
  this.number = 0;
 }

 public Triples(int num)
 {
   this.number = num;
 }

 public void setNum(int num)
 {
   this.number = num;
 }
 
 private int greatestCommonFactor(int a, int b, int c)
 {
  int max = 0;
  int min = Math.min(Math.min(a,b),c);
  for(int i = 1; i < min; i++)
  {
    if(a % i == 0 && b % i == 0 && c % i == 0)
      max = i;
  }
  return max;
 }

 public String toString()
 {
  String output="";
  for(int a = 1; a < this.number; a++)
  {
    for(int b = a; b< this.number; b ++)
    {
      for(int c = b; c< this.number; c++)
      {
        if(c%2 == 0)
          continue;
        else if(a*a + b*b == c*c)  
        {
          if((a%2==0 && b%2==1) || (a%2==1 && b%2==0))
          {
            if (greatestCommonFactor(a,b,c)==1)
            {
              output += String.format("%d %d %d\n",a,b,c);
            }
          }
        }
      }
    }
  }
  return output+"\n";
 }
}