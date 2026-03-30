import java.util.*;
public class Arraylist1{
    public static void main(String[] args){
        ArrayList <String> list = new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String el;
        int ch;
        do{
            System.out.print("---------------------------\n1: Add\n2: Size\n3: Search by Index\n4: find index\n5: Contains\n6: Remove\n7: Remove by Index\n8: Display\n9: Clear search\n0: Exit\n---------------------------\nEnter your choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter element to insert : ");
                    el=sc.next();
                    list.add(el);
                    break;
                case 2:
                    System.out.println("Size of the arraylist :"+list.size());
                    break;
                case 3:
                    System.out.print("Enter index of element to search :");
                    int index=sc.nextInt();
                    System.out.print("Element at index "+ index+" is "+list.get(index)+"\n");
                    break;
                case 4:
                    System.out.print("Enter an element to find index: ");
                    el=sc.next();
                    index=list.indexOf(el);
                    System.out.print("index of "+ el +" is "+index+"\n");
                    break;
                case 5:
                    System.out.print("Enter a element : ");
                    el=sc.next();
                    boolean contains=list.contains(el);
                    System.out.print(el+"is in the list : "+contains+"\n");
                    break;
                case 6:
                    System.out.print("Enter the element to be removed :");
                    el=sc.next();
                    boolean removed =list.remove(el);
                    System.out.print("After removing "+el+"Arraylist : "+list+"\n");
                    break;
                case 7:
                    System.out.print("Enter the index to remove the element: ");
                    index=sc.nextInt();
                    list.remove(index);
                    System.out.print("After removing the element,arraylist:"+list+"\n");
                    break;
                case 8:
                    System.out.print("Arraylist"+list+"\n");
                    break;
                case 9:
                    list.clear();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Angane Oru choice ivide illallo!!!!-ak"+"\n");
            }
        }while(ch!=0);
    }                   
}