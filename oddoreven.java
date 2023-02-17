import java.util.Scanner;
public class oddoreve {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int n;
        System.out.println("eneter the number:");
        n=a.nextInt();
        
        if (n%2==0){
            System.out.println(n+"is an even number");

        }
        else{
            System.out.println(n+"is an odd number");
        }
        }

    }
    

