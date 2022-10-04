public class BusDesign {

    public static void main(String[] args) {
        Bus bus = new Bus(3);
        System.out.println(bus.getCurrentStop()); //1
        bus.move();
        System.out.println(bus.getCurrentStop()); //2
        bus.move();
        System.out.println(bus.getCurrentStop()); //3
        bus.move();
        System.out.println(bus.getCurrentStop()); //2
        bus.move(); //1
        bus.move(); //2
        System.out.println(bus.getCurrentStop()); //2
        System.out.println(bus.getCurrentStop()); //2

        Bus bus1 = new Bus(5);
        System.out.println(bus.getCurrentStop()); //2
        System.out.println(bus.getCurrentStop()); //1
        bus.move(); //2
        System.out.println(bus.getCurrentStop()); //2



    }
}

class Bus{
    //implement the bus class here.

    int stops;
    int point;
    String way;

    public Bus(int n)
    {
      stops = n;
      point = 1;
      way = "pos";
    }


    public void move()
    {
        if(way.equals("pos"))
        {
            point++;
        }
        if(way.equals("neg"))
        {
            point--;
        }
        if(point == 1)
        {
            way = "pos";
        }
        if(point == stops)
        {
            way = "neg";
        }

    }

    public int getCurrentStop()
    {
        return point;
    }

}

