package interfaces;

public class Circle implements Drawable, Printable {
    @Override
    public void draw () {
        System.out.println("Drawing circle...");
    }
    @Override
    public void print() {
        System.out.println("Printing Circle...");
    }
}
