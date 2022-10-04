import java.util.Scanner;

public class UILCompSci {
    private String name;
    private int correct;
    private int inCorrect;
    private int skips;
    private int scores;

    //Scanner jonny = new Scanner(System.in);


    private UILCompSci(){

        this.name = name;
        this.correct = correct;
        this.inCorrect = inCorrect;
        this.skips = skips;


    }

    public void Name(){
        name = Utility.readString("Enter contestant's name--> ");

    }

    public void Correct(){
        correct = Utility.readInt("Number correct--> ");

    }

    public void  inCorrect(){
         inCorrect = Utility.readInt("Number incorrect--> ");

    }

    public void skips()
    {
       skips = 40 - (inCorrect + correct);

    }

    public void scores(){

        scores = (correct * 6) - (inCorrect * 2);
    }

    public String toString()
    {
        return "Contestant's Name : " + name + "\n" +

                "Correct : " + correct + "\n" +

                "Incorrect : " + inCorrect + "\n" +

                "Skips : " + skips + "\n" +

                "-------------------------------------\n" +

                "Score : " + scores;
    }

    public static void main(String[] args){

        UILCompSci jonny = new UILCompSci();
       jonny.Name();
        jonny.Correct();
        jonny.inCorrect();
        jonny.skips();
        jonny.scores();
        System.out.println(jonny);

        //str = Utility.readString("Enter contestant's name--> ");
    }
}