import java.util.*;

public class PalindromeApp
{
    public static void main(String[] args)
    {
        PalindromeTester p = new PalindromeTester();
        Scanner keyboard = new Scanner(System.in);
        String ans;

        do
        {
            System.out.print("Enter a word --> ");
            String str = keyboard.nextLine();

            if(p.palindrome(str, str.length()-1) == true)
                System.out.println("This is a palindrome");
            else
                System.out.println("This is not a palindrome");

            System.out.println();
            System.out.print("Continue[Y/N]? ");
            ans = keyboard.nextLine();
            System.out.println();
        }
        while(ans.equalsIgnoreCase("y"));
    }
}

class PalindromeTester
{
    /**
     * @param str the string to test
     * @param strLength the length of str
     * @return true if str is a palindrome; false otherwise
     */
    public boolean palindrome(String str, int strLength)
    {
        if(str.length() == 1)
        {
            return true;
        }

        if(str.substring(0,1).equals(str.substring(str.length()-1,str.length())))
        {
            return palindrome(str.substring(1,str.length()-1),strLength-2);
        }

        return false;
    }
}

/*

 racecar
 base cases: "a" --> true, "" --> true

      abba

      Check if first and last letters are the same
      racecar -> aceca -> cec -> e -> true
      racebar -> aceba -> ceb -> false

 */
