
public class BasicArray3 {
  
  
  public static void main(String[] args) 
  { 
    int[] a = new int[1000];
    for(int i =0; i < a.length;i++)
      a[i] = (int)(Math.random()*90) + 10;
    for(int i = 0;i < a.length;i++)
    {
     if(i > 0 && i % 20 == 0)
       System.out.println();
     System.out.print(a[i] + "  "); 
    }
  }
  
  
  
}
