import java.util.Scanner;
public class area {
    static void area1(int l,int b){
        int  a=l*b;
        System.out.println(a);
    }
    static void area1(int r){
        double pi=3.14;
        double a= pi*r*r;
        System.out.println(a);


    }
    static void area1(int a,int b,int c){
        double s=(a+b+c)/2;
        double ar=Math.sqrt((s-a)+(s-b)+(s-c)/3);
        System.out.println(ar);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c,r,l;
        System.out.println("enter the values for a,b,c,r,l:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r=sc.nextInt();
        l=sc.nextInt();

    int choice=0;
    System.out.println("enter the choices:\n1.rectangle \n 2. circle \n3.triangle");
    choice=sc.nextInt();
    while(choice!=4){
        switch(choice){
            case 1:
                area1(l,b);
                return;
            case 2:
                area1(r);
                return;
            case 3:
                area1(a,b,c);
                return;
            default:
                return;
        }
    }
}
}



        
   
