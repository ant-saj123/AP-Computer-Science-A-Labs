public class Bus1{
    private int numStop;
    private int[] array;
    private int currentStop;
    public String direction;

    public Bus1()
    {

    }

    public Bus1(int n)
    {
        numStop =n;
        currentStop = 1;
        direction = "forward";
    }

    public void move()
    {


        if(direction.equals("forward"))
        {
            currentStop+=1;
        }

        if(direction.equals("backwards"))
        {
            currentStop--;
        }

        if(currentStop==1)
        {
            direction ="forward";
        }

        if(currentStop==numStop) {
            direction = "backwards";
        }










    }

    public int getCurrentStop()
    {
        return currentStop;

    }
}