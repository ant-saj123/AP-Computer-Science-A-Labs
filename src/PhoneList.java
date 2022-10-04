import java.util.*;

public class PhoneList
{
    private ArrayList<Contact> phoneList = new ArrayList<Contact>();
    Scanner keyboard = new Scanner(System.in);

    public void getContactInfo()
    { //get user values to initialize phoneList with Contact objects.
        String ans = "y";
        while(ans.equals("y"))
        {
            System.out.print("Enter name --> ");
            String name = keyboard.nextLine();
            System.out.print("Enter phone number --> ");
            String phone = keyboard.nextLine();
            phoneList.add(new Contact(name,phone));

            System.out.print("Continue [Y or N]? ");
            ans = keyboard.nextLine();
        }

    }

    public void printContactInfo()
    { //print values from phoneList

        for(int i = 0; i < phoneList.size(); i++)
        {
            System.out.println(phoneList.get(i).getName() + "     " + phoneList.get(i).getPhone());
        }

    }

    public static void main(String[] args)
    {
        PhoneList app = new PhoneList();
        app.getContactInfo();
        System.out.println("       Contact List");
        System.out.println(" ----------------------------- ");
        app.printContactInfo();
    }
}