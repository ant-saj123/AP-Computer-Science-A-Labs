import java.util.Locale;

public class Stringercise {

    public static void main(String[] args)
    {
        String word = "Antony";
        System.out.println("1. " + word);
        word = "Antony" + " Augustine";
        System.out.println("2. " + word);
        word = "Antony" + " Augustine" + " Sajesh";
        System.out.println("3. " + word);
        word = word.toLowerCase();
        System.out.println("4. " + word);
        word = word.toUpperCase();
        System.out.println("5. " + word);
        System.out.println("6. " + word.length());
        System.out.println("7. " + word.substring(0,6));
        System.out.println(word.substring(7,16));
        System.out.println(word.substring(17,23));
        System.out.println("8. " + word.charAt(0) + word.charAt(7) + word.charAt(17));
        System.out.println("9. " + word.indexOf("AUGUSTINE"));
        System.out.println("10. " + word.replaceAll("A","X"));
         int num1 = 5;
         int num2 = 15;
         int num3 = 21;
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        String str3 = Integer.toString(num3);
        Integer.toString(num3);
         System.out.println("11. " + num1 + ", " + num2 + ", " + num3);
         System.out.println("12. " + str1.compareTo("17") + ", " + str2.compareTo("17") + ", " + str3.compareTo("17") );
         num1 = Integer.parseInt(str1);
         num2 = Integer.parseInt(str2);
        num3 = Integer.parseInt(str3);
         System.out.println("13. " + (num1+num2+num3) );

    }
}
