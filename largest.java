import java.util.*;
public class largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
System.out.println("enter the numbers");   
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

        
        if(a>b){
            System.out.println(a + "is the greatest among three");
        }
        else if(b>c){
            System.out.println(b + "is the greatest among three");

              }

            else{
                System.out.println(c + "is the greatest");
            }
        sc.close();
        
    }

}


