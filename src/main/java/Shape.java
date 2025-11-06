import java.awt.*;

/*

circle
Hexagon
Save screenshots of your diagrams to your repo.

 */

public abstract class Shape {
    protected Turtle turtle; //Turtle
    protected Point location; // X, Y Coordinates
    protected Color color; //Border Color
    protected double borderWidth; //Width of Border

    public Shape(Turtle t, double borderWidth, Color color, Point location) {
        this.turtle = t;
        this.borderWidth = borderWidth;
        this.color = color;
        this.location = location;
    }

    public abstract void paint();
}
