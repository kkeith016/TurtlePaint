import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(Turtle t, double borderWidth, Color color, Point location, double radius) {
        super(t, borderWidth, color, location);
        this.radius = radius;
    }
    public void paint(){
        turtle.setColor(color);
        turtle.setPenWidth(borderWidth);
        turtle.goTo(location.x, location.y);
        turtle.penDown();

        int steps = 360;
        double stepLength = 2 * Math.PI * radius / steps;

        for (int i = 0; i < steps; i++) {
            turtle.forward(stepLength);
            turtle.turnRight(1); // or 360.0 / steps if steps != 360
        }
        turtle.penUp();
    }
}

