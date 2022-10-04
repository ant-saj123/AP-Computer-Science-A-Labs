import static java.lang.System.*;

public class DigitCounter
{
    public static void main(String args[])
    {
        System.out.println(countOddDigits(45321113));

        //add more test cases
    }

    public static int countOddDigits(int num)
    {

        if(num == 0)
        {
             return 0;
        }

        if(num%2 == 1)
        {
            return 1 + countOddDigits(num/10);
        }

        if(num%2 == 0) {
            return 0 + countOddDigits(num / 10);
        }

        return 0;
    }

}
