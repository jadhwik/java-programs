import java.util.Scanner;
public class doubly {
    class node{
        int data;
        node previous;
        node next;

        public node(int data){
            this.data=data;
        }

        }
        node head,tail=null;
//adding nodes to the list        
        public void newnode(int data){
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                head.previous=null;
                tail.next=null;
            }
            else{
                tail.next=newnode;
                newnode.previous=tail;
                tail=newnode;
                newnode.next=null;
            }
            

        }
        
        //adding node at begginning
        public void nodeatb(int data){
            node newnode=new node(data);
            if ( head!=null){
                head.previous=newnode;
                newnode.previous=null;
                newnode.next=head;
                head=newnode;

             }
            }
//Adding node at end.
        public void nodeatend(int data){
            node newnode=new node(data);
            if(tail!=null){
                tail.next=newnode;
                newnode.previous=tail;
                newnode.next=null;
                tail=newnode;
            
            }
         }
 //Adding node at specific location.        
         public void specific(int data,int pos){
        
            node newnode=new node(data);
            node temp=null;
            node current =head;
            for(int i=1;i<pos-1;i++){
                current=current.next;
                
            
            }
            temp=current.next;
            temp.previous=current;
            current.next=newnode;
            newnode.next=temp;
            newnode.previous=current;
            temp.previous=newnode;
           
        }
// Displaying the list.
        public void display(){
            node current=head;

            if(head==null){
                System.out.println("the list is empty");
                return;
            }
            System.out.println("The doubly linked list is:");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }

            }
// Main program.
            public static void main(String args[]){
                doubly dlist=new doubly();
                Scanner sc=new Scanner(System.in);
                int n;
                System.out.println("enter the no of nodes:");
                 n=sc.nextInt();
                 int a;
                 for(int i=0;i<n;i++){
                    System.out.println("enter the node values:");
                    
                    
                    a=sc.nextInt();
                 
                    dlist.newnode(a);
                 }  
        
                 dlist.display();
                 int pos;

            int choice=0;
            System.out.println("enter the choice:1.at begginning 2. at end  3. at specific:");
            choice=sc.nextInt();
            while(choice!=4){
                switch(choice){
                

            case 1:
                
                 System.out.println("enter the node to insert into the beginning:");
                 a=sc.nextInt();
                 dlist.nodeatb(a);
                 dlist.display();
                return;
            case 2:
                 System.out.println("enter the node to insert at end:");
                 a=sc.nextInt();
                 dlist.nodeatend(a);
                 dlist.display();
                 return;
            case 3:
                 System.out.println("enter the position:");
                 pos=sc.nextInt();
                 System.out.println("enter the value:");
                 a=sc.nextInt();
                 dlist.specific(a,pos);
                 dlist.display();
                 return;
            default:
                System.out.println("enter 4 to exit:");
                
                 }              


                       
            }
        }
    }               
            

        
        

    
    

