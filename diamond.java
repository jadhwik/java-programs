import java.util.*;
public class diamond {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int n,i,j;
        char x;
        System.out.println("Enter the character  to be printed:");
        x=a.next().charAt(0);

        System.out.println("Enter the number of rows needed:");
        n=a.nextInt();
      //To print the upper portion of the diamond.
        for (i=0;i<n;i++){
            for(j=n-i;j>1;j--)
            {
                System.out.print(" ");          

            }
            for(j=0;j<=i;j++){
                System.out.print(" "+x);
            }
            System.out.println();
           }

// To print the lower portion of the diamond.
        for(i=0;i<n;i++){
        for(j=0;j<=i;j++){
            System.out.print(" ");

        }
        for(j=0;j<n-1-i;j++){       // Here only j<n-1-i not <= .
            System.out.print(" "+x);

        }
        System.out.println();
    }
}
}
