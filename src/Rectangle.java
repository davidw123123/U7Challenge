import java.util.ArrayList;

public class Rectangle {
    private int width;
    private int length;
    private int topLeftXCoordinate;
    private int topLeftYCoordinate;

    public Rectangle(int width, int length, int topLeftXCoordinate, int topLeftYCoordinate)
    {
        this.width = width;
        this.length = length;
        this.topLeftXCoordinate = topLeftXCoordinate;
        this.topLeftYCoordinate = topLeftYCoordinate;
    }
    public Rectangle()
    {
        width = (int)(Math.random()*4+6);
        length = (int)(Math.random()*39+11);
        topLeftYCoordinate = (int)(Math.random()*49+1);
                topLeftXCoordinate = (int)(Math.random()*49+1);
        Rectangle rectangle  = new Rectangle(width, length, topLeftXCoordinate, topLeftYCoordinate);
    }

    public double percentageCollide(ArrayList<Rectangle> rectangles, Rectangle original)
    {
        int collision = 0;
        for (Rectangle rec : rectangles)
        {
            if ((rec.topLeftXCoordinate + length >=  original.topLeftXCoordinate) && (rec.topLeftYCoordinate <= original.topLeftYCoordinate && rec.topLeftYCoordinate >= original.topLeftYCoordinate - width))
            {
                collision++;
            }
        }
        double percent  = (double) collision/rectangles.size();
        return percent * 100;
    }
    public void  check(ArrayList<Rectangle> rectangles, Rectangle original)
    {
        for (Rectangle rec: rectangles)
        {
            System.out.println((topLeftXCoordinate + length >=  original.topLeftXCoordinate));
        }
    }
    public String toString()
    {
        return "Width: " + width + "\n" + "Length: " + length + "\n"+ "Top Left X Coordinate: " + topLeftXCoordinate + "\n" + "Top left Y Coordinate: " + topLeftYCoordinate + "\n";
    }
}
