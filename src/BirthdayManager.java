import java.util.*;

public class BirthdayManager {
     private Birthday[] birthdays;
     int num;

     public BirthdayManager()
     {
         birthdays = new Birthday[50];
         num = 0;
     }

     public void addBirthdays()
     {
         Scanner keyboard = new Scanner(System.in);
         String answer = "y";

         System.out.println("************************");
         System.out.println("*     addBirthdays     *");
         System.out.println("************************");
         while(answer.equals("y"))
         {
             System.out.print("Enter name --> ");
            String name =  keyboard.nextLine();
             System.out.print("Enter bday --> ");
             String bday = keyboard.nextLine();
             birthdays[num] = new Birthday(name,bday);

             num++;
             System.out.print("Enter another bday[y/n] --> ");
             answer = keyboard.nextLine();




         }
     }

     public void printBirthdays()
     {
         System.out.println("************************");
         System.out.println("*    printBirthdays    *");
         System.out.println("************************");
         for(int i = 0; i<num;i++)
         {
             System.out.println(birthdays[i]);
         }
     }

     public static void main(String[] args)
     {
         BirthdayManager jon = new BirthdayManager();
         jon.addBirthdays();
         jon.printBirthdays();
     }
}
