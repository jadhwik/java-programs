import java.util.Scanner;
public class frequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s;
        int count=0;
        System.out.println("enter the string:");
        s=sc.nextLine();
        char b;
        System.out.println("enter the letter to find frequency:");
         b=sc.next().charAt(0);
        int i;
        for(i=0;i<s.length();i++){
            if(b==s.charAt(i)){
                count++;
            }
            
        }
        System.out.println("the frequency of the letter:"+b+count);
        sc.close();

    }
    
}
