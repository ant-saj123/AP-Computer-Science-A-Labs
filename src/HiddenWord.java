 public class HiddenWord {
    private String word;
    public HiddenWord(String word)
    {
        this.word = word;
    }


    public String getHint(String guess)
    {
        String stuff = "";
        for(int i = 0; i<guess.length();i++)
        {
            if(guess.substring(i,i+1).equals(word.substring(i,i+1)))
            {
                stuff+=guess.substring(i,i+1);
            }
            else if(word.indexOf(guess.substring(i,i+1)) != -1)
            {
                stuff+= "+";
            }
            else
            {
                stuff += "*";
            }
        }

        return stuff;
    }
}

class HiddenWordTester{
    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");

        System.out.println(puzzle.getHint("AAAAA")); //should print +A+++
        System.out.println(puzzle.getHint("HELLO")); //should print H****
        System.out.println(puzzle.getHint("HEART")); //should print H*++*
        System.out.println(puzzle.getHint("HARMS")); //should print HAR*S
        System.out.println(puzzle.getHint("HARPS")); //should print HARPS
    }
}

