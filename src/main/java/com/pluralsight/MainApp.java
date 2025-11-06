package com.pluralsight;

import com.pluralsight.tools.Utility;

import java.awt.*;

public class MainApp
{
    static Utility util = new Utility();


    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(400, 400);

        while(true) {
            mainMenu(world);
        }


    }

    public static void mainMenu(World world){
        System.out.println("Main Menu");
        util.menuOption("Draw",1);
        util.menuOption("Save",2);
        util.menuOption("Exit",0);


        switch (util.userIntInput("Input your choice here")){
            case 1 -> drawMenu(world);
            case 2 -> System.out.println("Functionality not working");
            case 0 -> util.exitApp();
            default -> System.out.println("Input not recognized, try again.");
        }

    }

    public static void drawMenu(World world){
        System.out.println("Draw Menu\nWhat shape do you want Donatello the Turtle to draw?");
        util.menuOption("Square",1);
        util.menuOption("Triangle",2);
        util.menuOption("Circle",3);
        util.menuOption("Hexagon",4);
        util.menuOption("Exit",0);

        switch (util.userIntInput("Input your choice here")){
            case 1 -> drawSquare(world);//square
            case 2 -> drawTriangle(world);//triangle
            case 3 -> drawCircle(world);//circle
            case 4 -> drawHexagon(world);//hexagon
            case 0 -> util.exitApp();
        }

    }

    public static void drawSquare(World world){
        Turtle t = new Turtle(world,-100, -100);
        Point location = new Point (util.userIntInput("Starting x coordinate"), util.userIntInput("Starting y coordinate"));
        int b = util.userIntInput("Border Width (1-4)");
        Color color = userColor();
        double size = util.userIntInput("Size");

        Square square = new Square(t, b, color, location, size);
        square.paint();

    }

    public static void drawTriangle(World world){
        Turtle t = new Turtle(world,-100, -100);
        Point location = new Point (util.userIntInput("Starting x coordinate"), util.userIntInput("Starting y coordinate"));
        int b = util.userIntInput("Border Width (1-4)");
        Color color = userColor();
        double size = util.userIntInput("Size");

        Triangle triangle = new Triangle(t,b,color,location,size);
        triangle.paint();

    }

    public static void drawCircle(World world){
        Turtle t = new Turtle(world,-100, -100);
        Point location = new Point (util.userIntInput("Starting x coordinate"), util.userIntInput("Starting y coordinate"));
        int b = util.userIntInput("Border Width (1-4)");
        Color color = userColor();
        double radius = util.userIntInput("Radius");

        Circle circle = new Circle(t,b,color,location,radius);
        circle.paint();

    }
    public static void drawHexagon(World world){
        Turtle t = new Turtle(world,-100, -100);
        Point location = new Point (util.userIntInput("Starting x coordinate"), util.userIntInput("Starting y coordinate"));
        int b = util.userIntInput("Border Width (1-4)");
        Color color = userColor();
        double size = util.userIntInput("Size");

        Hexagon hexagon = new Hexagon(t,b,color,location,size);
        hexagon.paint();

    }


    public static Color userColor(){
        String color =util.userStringInput("Color (Black, Red, Blue, Magenta, Cyan)");
        Color c = Color.GREEN;
        switch (color){
            case "black","Black"-> c = Color.BLACK;
            case "red","Red","r"-> c = Color.RED;
            case "Blue","blue"-> c = Color.BLUE;
            case "Magenta","magenta" -> c = Color.MAGENTA;
            case "Cyan","cyan"-> c = Color.CYAN;
        }
        return c;
    }
}
