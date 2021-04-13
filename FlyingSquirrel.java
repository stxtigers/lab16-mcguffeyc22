public class FlyingSquirrel extends Squirrel{
  public FlyingSquirrel(int l, int w){
    super(l, w);
  }
  
  public void move(int numberOfSeconds){
    int p = this.getPosition() + numberOfSeconds*6;
    this.setPosition(p);
  }
}