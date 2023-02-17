import java.util.Scanner;
public class mat {
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int [10][10];
        int c1,r1,c2,r2,i,j;
        System.out.println("enter the no.of rows and colums of matrix 1:");
        c1=A.nextInt();
        r1=A.nextInt();
        System.out.println("enter the elements:");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                a[i][j]=A.nextInt();

            }
        }
        System.out.println("the matrix elements are:");
        for(i=0;i<r1;i++){

            for(j=0;j<c1;j++){
            
        
        System.out.print(a[i][j]+" ");
            }
        System.out.println("");
            }
        
        
        System.out.println("enter the no.of rows and colums of matrix 2:");
        c2=A.nextInt();
        r2=A.nextInt();
        System.out.println("enter the elements:");
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                b[i][j]=A.nextInt();
            }
        }
        for(i=0;i<r2;i++){

            for(j=0;j<c2;j++){

            
        
        System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
        if(r1==c2){
            System.out.println("the multiplication is possible");
            for(i=0;i<r1;i++){
                int k;
                   
                for(j=0;j<c2;j++){
                    c[i][j]=0;

                    
                    for(k=0;k<c1;k++){

                      
            c[i][j]=c[i][j]+a[k][j]*b[i][k];
        }
    }
}
System.out.println("the resultant matrix is:");
for(i=0;i<r1;i++){
    for(j=0;j<c1;j++){
        System.out.print(c[i][j]+" ");
    }
    System.out.println("");
}
}
        
        else{
            System.out.println("not possible");
        }
    

A.close();        

}
    
    }
