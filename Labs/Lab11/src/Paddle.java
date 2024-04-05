import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

class Paddle extends GameObject implements ICollidable{
  private double velX = 0;
  private double velY = 0;
  private KeyAdapter input;

  Paddle(double velX, double velY, double x , double y, double width ,double height ) {
    super(x,y,width,height);
    this.input = new PaddleKeyAdapter(this);
  }

  @Override
  void update() {
    this.setX(this.getX() + this.getVelX());
    this.setY(this.getY() + this.getVelY());
  }

  @Override
  void render(Graphics2D g2d) {
    g2d.setColor(Color.YELLOW);
    Shape p = new Rectangle2D.Double(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    g2d.fill(p);
  }
  public double getVelX(){return velX;}
  public double getVelY(){return velY;}
  public void setVelX(double velX){this.velX = velX;}
  public void setVelY(double velY){this.velY = velY;}

  KeyAdapter getInput() {
    return this.input;
  }
  public boolean isPaddle(){return false;}
  public boolean isBall(){return true;}
  public boolean isBrick(){return false;}


  // ========================= DO NOT MODIFY THE CODE BELOW ========================= //
  private static class PaddleKeyAdapter extends KeyAdapter {

    private Paddle p;

    PaddleKeyAdapter(Paddle p) {
      this.p = p;
    }

    @Override
    public void keyPressed(KeyEvent e) {
      super.keyPressed(e);
      switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
          this.p.setVelX(-5);
          break;
        case KeyEvent.VK_RIGHT:
          this.p.setVelX(+5);
          break;
      }
    }

    public void keyReleased(KeyEvent e) {
      super.keyPressed(e);
      switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
        case KeyEvent.VK_RIGHT:
          this.p.setVelX(0);
      }
    }
  }
}
