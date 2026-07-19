package repo1;

import java.util.*;

public class studentmanagement {
    private static ArrayList<student> students = new ArrayList<>();

static class student{
   private String id;
   private String name;
   private int age;

   public student(String id, String name, int age){
    this.id=id;
    this.name=name;
    this.age=age;
    
   }

   @Override
 public String toString(){
    return "id:"+id+". name:"+name+" .age:"+age;

}


   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch=0;
        while (ch!=3){
            disme();
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    adds(sc);
                    break;
                    case 2:
                        vis();
                        break;
                        case 3:
                            System.out.println("exit");
                            default:  
                            System.out.println("invalid choice");
                        
            }


        }}
    public static void disme(){
        System.out.println("welcome to student management system");
        System.out.println("1.add student");
        System.out.println("2.view student");
        System.out.println("3.exit");
    }
    private static void adds(Scanner sc){
    System.out.println("ENTER STUDENT ID:");
    String id=sc.next();
    System.out.println("ENTER STUDENT NAME");
    String name=sc.next();
    System.out.println("ENTER AGE");
    int age=sc.nextInt();

    student s=new student(id,name,age);
    students.add(s);
    System.out.println("student added successfully...!");
}
private static void vis(){
    System.out.println("\n all students:");
    for (student a:students){
        System.out.println(a);
    }

}
}
