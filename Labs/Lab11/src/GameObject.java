import java.awt.*;

abstract class GameObject implements ICollidable{
    // Instance variables
    private double x;
    private double y;
    private double width;
    private double height;

    // Constructor
    public GameObject(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    // Accessors( get in front of the name)
    public double getX(){return x;}
    public double getY(){return y;}
    public double getWidth(){return width;}
    public double getHeight(){return height;}

    // Mutators( set in front of the name)
    public void setX(double x ){this.x = x;}
    public void setY(double y){this.y = y;}
    public void setWidth(double width){this.width = width;}
    public void setHeight(double height){this.height = height;}

    abstract void update();
    abstract void render(Graphics2D g2d);
}
