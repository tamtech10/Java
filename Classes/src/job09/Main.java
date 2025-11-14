package job09;

public class Main {

    static void main(String[] args) {

        double[] notes = {10.2, 14.5, 8.2, 17.5};
        Etudiant e1 = new Etudiant("Bob", notes, 19);
        System.out.println(e1.getAge());
        e1.setAge(20);
        System.out.println(e1.getAge());


    }
}
