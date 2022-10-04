import java.util.*;

public class Vowels {

    private String[] vow = new String[10];
    Scanner jonny = new Scanner(System.in);
    int num = 0;
    String stuff = "";
    public void entWords()
    {
        for(int i = 1;i<vow.length+1;i++)
        {
            System.out.print("Word " + i +"--> ");
            vow[i-1] =  jonny.nextLine();

        }
    }

    public String countWords()
    {

        for(int i = 0;i<vow.length;i++)
        {
            for(int k = 1 ;k<vow[i].length()+1;k++)
            {
                if(vow[i].substring(k-1,k).equals("a") || vow[i].substring(k-1,k).equals("e")
                        || vow[i].substring(k-1,k).equals("i")
                        || vow[i].substring(k-1,k).equals("o") || vow[i].substring(k-1,k).equals("u")  )
                {
                    num++;
                }

            }
            stuff += vow[i] + " - " + num + "\n";
            num = 0;
        }
        System.out.println(stuff);
        return stuff;
    }



  public static void main(String[] args)
  {
      Vowels k = new Vowels();
      System.out.println("Enter 10 Words: ");
      k.entWords();
      System.out.println();
      k.countWords();

  }
}
