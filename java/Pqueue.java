import java.util.*;
public class Pqueue {
    public static void main(String[] args){
        PriorityQueue<String>q=new PriorityQueue<>();{
            Scanner sc=new Scanner(System.in);
            String el;
            int ch;
            do{
                System.out.print("----------------------------\n1: Add\n2: Remove\n3: Display\n4: Head\n0: exit\n----------------------------\nEnter your choice :");
                ch=sc.nextInt();
                switch(ch){
                    case 1:
                        System.out.print("Enter element to insert : ");
                        el=sc.next();
                        q.add(el);
                        break;
                    case 2:
                        q.remove();
                        break;
                    case 3:
                        System.out.println("Priority Queue : : "+q);
                        break;
                    case 4:
                        System.out.println("Head of the queue : : "+q.peek());
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Invalid choice aan ketto ithokke !!!!-ak");
                }
            }while(ch!=0);
        }
    }   
}
