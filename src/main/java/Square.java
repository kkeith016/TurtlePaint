import java.awt.*;

public class Square extends Shape {
    private double sideLength;

    public Square(Turtle t, double borderWidth, Color color, Point location, double sideLength) {
        super(t, borderWidth, color, location);
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {
        turtle.setColor(color);
        turtle.setPenWidth(borderWidth);
        turtle.goTo(location.x, location.y);
        turtle.penDown();

        for (int i = 0; i < 4; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(90);
        }

        turtle.penUp();
    }
}