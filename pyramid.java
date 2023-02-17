import java.util.*;
public class Pyramid{
  public static void main(String args[]){
    Scanner a=new Scanner(System.in);
    char s;
    int n,i,j;
    System.out.println("Enter the symbol to print:");
    s=a.next().charAt(0);
    System.out.println("Enter the no.of rows needed:");
    n=a.nextInt();
    
    //outer loop for rows.
    for(i=0;i<n;i++){
      // prints spaces between two chars.
      for(j=n-i;j>1;j--){
        System.out.print(" ");
      }
      //prints the input char.
      for(j=0;j<i;j++){
        System.out.print(" "+s);
      }
      System.out.println();
    }
  }
}
