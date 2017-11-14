import java.util.Scanner;
public class NestedLoopsTesting {

 public static void main(String[] args) {
  int score = 0;
  Scanner in = new Scanner(System.in);
  System.out.println("Testing box(8,6)");  //2
  NestedLoops.box(8,6);
  System.out.print("How many points? (out of 2) ");
  score += in.nextInt();
  System.out.println();
  System.out.println("Testing triangle(7)"); //2
  NestedLoops.triangle(7);
  System.out.print("How many points? (out of 2) ");
  score += in.nextInt();
  System.out.println();
  System.out.println("Testing reverseTri(7)"); //2
  NestedLoops.reverseTri(7);
  System.out.println();
  System.out.print("How many points? (out of 2) ");
  score += in.nextInt();
  System.out.println("Testing pyramid(7)");  //2
  NestedLoops.pyramid(7);
  System.out.println();
  System.out.print("How many points? (out of 2) ");
  score += in.nextInt();
  System.out.println("Testing invertedPyramid(7)"); //2
  NestedLoops.invertedPyramid(7);
  System.out.print("How many points? (out of 2) ");
  score += in.nextInt();
  System.out.println();
  System.out.println("Testing hollowBox(8,6)"); //2
  NestedLoops.hollowBox(8,6);
  System.out.print("How many points? (out of 2) ");
  score += in.nextInt();
  System.out.println();
  System.out.println("Testing checkers(8,6)");
  NestedLoops.checkers(8,6);
  System.out.println();
  System.out.print("How many points? (out of 2) ");
  score += in.nextInt();
  System.out.println("Testing reflectedPyramid(7)");
  NestedLoops.reflectedPyramid(7);
  System.out.println();
  System.out.print("How many points? (out of 5) ");
  score += in.nextInt();
  System.out.println("Testing hourGlass(7)");
  NestedLoops.hourGlass(7);
  System.out.println();
  System.out.print("How many points? (out of 5) ");
  score += in.nextInt();
  System.out.println("Testing diamond(7)");
  NestedLoops.diamond(7);
  System.out.println();
  System.out.print("How many points? (out of 5) ");
  score += in.nextInt();
  System.out.println("Testing doubleBorderBox(8,6)");
  NestedLoops.doubleBorderBox(8,6);
  System.out.println();
  System.out.print("How many points? (out of 5) ");
  score += in.nextInt();
  System.out.println("Testing hollowDiamond(7)");
  NestedLoops.hollowDiamond(7);
  System.out.println();
  System.out.print("How many points? (out of 5) ");
  score += in.nextInt();
  System.out.printf("Score: %d out of 39\n", score);
 }

}