import java.util.*;      // needed for ArrayList

public class ArrayListPractice {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Method 1");
        System.out.println("--------");
        System.out.println();
        Method1();
        System.out.println();
        System.out.println("Method 2");
        System.out.println("--------");
        System.out.println();
        Method2();

    }

    public static void Method1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i <= 100; i += 10) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for(Object o: list)
        {
            System.out.println(o);
        }




    }

    public static void Method2()
    {
        ArrayList<String> list = new ArrayList<String>();
        String ans = "";
        while(!ans.equals("exit"))
        {
            System.out.print("Enter a word --> ");
            ans = keyboard.nextLine();
            if(!ans.equals("exit")) {
                list.add(ans);
            } 
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for(Object o: list)
        {
            System.out.println(o);
        }
    }
}
