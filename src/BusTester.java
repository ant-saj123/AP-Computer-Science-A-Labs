public class BusTester {
    public static void main(String[] args) {
        Bus1 bus1 = new Bus1(3);
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
    }
}

