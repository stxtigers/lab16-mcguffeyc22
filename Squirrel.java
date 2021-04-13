public class Squirrel implements Animal {
  private static final int numberOfLimbs = 4;
  private static int squirrelCount = 0;
  
  protected int squirrelNumber;
  protected int position; 
  
  protected double length = 0;
  protected double weight = 4;

  public Squirrel(double l, double w){
    //number++;
    length = l;
    weight = w; 
    position = 0;
    squirrelNumber = squirrelCount;
    squirrelCount++;
  }

  public void move(int numberOfSeconds){
    position += numberOfSeconds * 4;
  }

  public String sound(){
    return "Squeak";
  }

  public String toString(){
    return "Squirrel " + squirrelNumber + ", location " + position;
  }
  
  public int getPosition(){
    return position;
  }
  
  public void setPosition(int p){
    position = p;
  }

}