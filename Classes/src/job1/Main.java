package job1;

public class Main {

    static void main(String[] args) {

        Chaises c1 = new Chaises(5, "rouge", 11);

        Chaises.InnerClass innerClass = new Chaises.InnerClass();
        innerClass.innerMethod();

        /*double d = 3.0;

        double x = d += 1;   // d postaje 4.0, x dobija 4.0
        double y = d++;      // d postaje 5.0, y dobija staru vrednost 4.0

        System.out.println("d = " + d);
        System.out.println("x = " + x);
        System.out.println("y = " + y);*/


        int i = 5;
        int j = ++i;
        int k = j++;
        int h = k--;
        boolean flag = ((i != j) && ( (j <= k ) || (i <= h)) );

    }
    }


