
public class IntArrayDemo
{
  public static void main(String[] args)
  {   
    // one way to initialize an array
    int[] array1 = {1, 3, 5, 7};
    
    // another way to initilize an array
    int[] array2 = new int[3];
    
    // yet another way to initialize an array
    int size = 20;
    int[] array3 = new int[size];
    
    
    // accessing array elements one at a time.
    System.out.println(array1[0]);
    System.out.println(array1[1]);
    System.out.println(array1[2]);
    System.out.println(array1[3]);
    //System.out.println(array1[4])  //gives an error. Why?
    
    System.out.println();
    
    // reassigning values in an array
    array2[0] = 1;
    array2[1] = 2;
    array2[2] = 0;
    array2[2]++;
    array2[2] *= 3;
    
    // using a for loop to access array
    for(int i = 0; i < 3; i++)
      System.out.print(array2[i] + " ");
    
    System.out.println();
    System.out.println();
    
    // initialize the values in an array
    // using a for loop
    for(int i = 0; i < array3.length; i++)
      array3[i] = (int)(Math.random()*20 + 1);
    
    // using a for-each loop to access the items
    // in the array
    // NOTE:
    // for-each loops CANNOT be used to assign values
    for (int n : array3)
      System.out.print(n + " ");
    
    System.out.println();
    System.out.println();
    
    // let's see what happens
    int[] array4 = array3;
    
    System.out.print("Array3 Before: ");
    for(int i = 0; i < array3.length; i++)
      System.out.print(array3[i] + " ");
    System.out.println();
    System.out.print("Array4 Before: ");
    for(int i = 0; i < array4.length; i++)
      System.out.print(array4[i] + " ");
    System.out.println();
    
    
    // set all of the values in array4 to 0
    for(int i = 0; i < array4.length; i++)
      array4[i] = 0;
    System.out.println();
    
    System.out.print("Array3 After: ");
    for(int i = 0; i < array3.length; i++)
      System.out.print(array3[i] + " ");
    System.out.println();
    System.out.print("Array4 After: ");
    for(int i = 0; i < array4.length; i++)
      System.out.print(array4[i] + " ");
    System.out.println();
    
    
    // when you assign one array to another,
    // they are both pointing to the exact
    // same place in memory and are called
    // "aliases."
    
    // in order to actually "copy" an array
    // you have to duplicate each element
    // one at a time (using a loop)
    // this is left for you to do in the
    // assignment!
    
  }
}