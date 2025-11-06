import java.awt.*;

public class Square extends Shape {
    private double size;


    public Square(Turtle t, double borderWidth, Color color, Point location,double size) {
        super(t, borderWidth, color, location);
        this.size = size;
    }

    @Override
    public void paint() {
        turtle.setColor(color);
        turtle.setPenWidth(borderWidth);
        turtle.goTo(location.x, location.y);
        turtle.penDown();

        for( int i = 0; i < 4; i++ ) {
           turtle.turnRight(90);
            turtle.forward(size);
        }
        turtle.penUp();
    }
}
