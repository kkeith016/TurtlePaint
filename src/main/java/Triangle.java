import java.awt.*;

public class Triangle extends Shape {
    private double size;


    public Triangle(Turtle t, double borderWidth, Color color, Point location, double size) {
        super(t, borderWidth, color, location);
        this.size = size;
    }

    public void paint(){
        turtle.setColor(color);
        turtle.setPenWidth(borderWidth);
        turtle.goTo(location.x, location.y);
        turtle.penDown();

        for( int i = 0; i < 3; i++ ) {
            turtle.turnRight(60);
            turtle.forward(size);

        }
        turtle.penUp();
    }
}
