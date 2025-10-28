public class job03 {
    public static void main(String[] args) {

        for (int i=0; i<=100; i++) {

            if (i >= 0 && i <= 20) {
                System.out.println("_" + i + "_");

            } else if(i ==42) {
                System.out.println("La Plateforme");

            }else if(i >=25 && i <=50) {
                System.out.println("__" +i+ "__");

            } else {
                System.out.println(i);
            }
        }
    }
}
