import java.awt.*;

    public class Hexagon extends Shape {
        private double size;


        public Hexagon(Turtle t, double borderWidth, Color color, Point location, double size) {
            super(t, borderWidth, color, location);
            this.size = size;
        }

        @Override
        public void paint() {
            turtle.setColor(color);
            turtle.setPenWidth(borderWidth);
            turtle.goTo(location.x, location.y);
            turtle.penDown();

            for( int i = 0; i < 6; i++ ) {
                turtle.turnRight(120);
                turtle.forward(size);
            }
            turtle.penUp();
        }
    }
