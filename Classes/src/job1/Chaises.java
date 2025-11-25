package job1;

public class Chaises {

    double weight;
    String colour;
    double size;


    public Chaises(double weight, String colour, double size) {
        this.weight = weight;
        this.colour = colour;
        this.size = size;

    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public static class InnerClass { //klasa u klasi

        int innerNumber = 8;

        public void innerMethod(){ //obicna metoda

        }

    }

}
