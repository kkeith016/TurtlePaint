import java.awt.*;

public class Hexagon extends Shape {
    private double sideLength;

    public Hexagon(Turtle t, double borderWidth, Color color, Point location, double sideLength) {
        super(t, borderWidth, color, location);
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {
        turtle.setColor(color);
        turtle.setPenWidth(borderWidth);
        turtle.goTo(location.x, location.y);
        turtle.penDown();

        for (int i = 0; i < 6; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(60);
        }

        turtle.penUp();
    }
}
