import static java.lang.System.*;

public class Social
{
    private String socialNum;
    private int sum;

    public Social()
    {


    }

    public Social(String soc)
    {

       socialNum = soc;
    }


    public void setWord(String w)
    {

        socialNum = w;
    }

    public void chopAndAdd()
    {
        String sub = socialNum;
      int spot =  sub.indexOf("-");
      int got = sub.lastIndexOf("-");
      String k = sub.substring(0,spot);
      String b = sub.substring(spot + 1,got);
      String a = sub.substring(got+1,socialNum.length());

     sum = Integer.parseInt(k) + Integer.parseInt(b) + Integer.parseInt(a);



           }












    public String toString()
    {
        return "SS# " + socialNum + " has a total of " + sum + "\n";
    }

        }

