public class CopyingArrays {
  
  
  public static void main(String[] args) 
  { 
    int[] a = new int[10];
    for(int i = 0; i < a.length;i ++)
      a[i] = (int)(Math.random()*100 + 1); 
    int[] b = new int[a.length];
    for(int i = 0; i < b.length;i++)
      b[i] = a[i];
    a[a.length-1] = -7;
    
    System.out.print("Array 1: ");
    for(int i = 0;i<a.length;i++)
      System.out.print(a[i] + " ");
    System.out.print("\nArray 2: ");
    for(int i = 0;i<a.length;i++)
      System.out.print(b[i] + " ");
    System.out.println();
  }
  
}
