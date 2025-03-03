import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
     Rectangle rectangle = new Rectangle(10, 20, 10, 15);
     for (int i = 0; i < 1000000; i++)
     {
        rectangles.add(new Rectangle());
     }
        System.out.println("Percent: " +rectangle.percentageCollide(rectangles, rectangle));

    }

}