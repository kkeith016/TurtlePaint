import java.awt.*;

/*

Shape: abstract
--------------------
turtle: the turtle that is used to paint the shape
location: Point -- the x,y coordinate where the shape
should be drawn
color: the color used for the border
border: the width of the shape border
paint() - the method that paints the shape
You should create at least 3 different classes that extend shape. These could be:
Square
Triangle
Circle
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
