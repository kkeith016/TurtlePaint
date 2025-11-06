import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        // Create the drawing world (the canvas)
        World world = new World(400, 400);
        Turtle turtle = new Turtle(world, 0, 0);

        // Example shapes to draw
        Shape Triangle = new Triangle(turtle, 2, Color.MAGENTA, new Point(0, 0), 60);

        // Draw all shapes one by one
        Triangle.paint();

        // Optional: add a pause or message
        System.out.println("All shapes drawn!");
    }
}
