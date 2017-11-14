public class BasicArray2 {
  
  
  public static void main(String[] args) 
  { 
    int[] a = new int[10];
    for(int i = 0; i < a.length;i ++)
      a[i] = (int)(Math.random()*100 + 1);
    int count = 0;
    for(int num : a)
    {
      System.out.printf("Slot %d contains a %d\n",count, num);
      count++;
    }
  }
  
  
  
}
