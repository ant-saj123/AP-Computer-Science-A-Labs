import java.util.*;

public class ReverseStringApp
{
    public static void main(String[] args)
    {
        ReverseStringTester cd = new ReverseStringTester();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string --> ");
        String s = keyboard.nextLine();

        System.out.println(cd.reverseString(s));
    }
}

class ReverseStringTester
{
    /**
     * @param s the string to be reversed

     * @return String s in reverse order
     */
    public String reverseString(String s)
    {
        if(s.length() == 1)
        {
            return s;
        }
        return s.substring(s.length()-1,s.length()) + reverseString(s.substring(0,s.length()-1));
    }
}
/* cars --> srac
simple strings to reverse: "" and "a"

return "s" + reverseString("car");
return "r" + reverseString("ca")
return "a" + reverseString("c")
return "c"
 */

