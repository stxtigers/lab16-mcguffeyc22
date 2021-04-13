public class Sloth implements Animal{
  private static final int numberOfLimbs = 4;
  private static int slothCount = 0;
  
  protected int slothNumber;
  protected int position; 
  

  private int distance = 0;
  private int weight = 1;

  public Sloth(){
    //number++;
    slothNumber = slothCount;
    slothNumber++;
  }

  public void move(int numberOfSeconds){
    distance += numberOfSeconds * weight;
  }

  public String sound(){
    return "AHHHHHHHHHHHHHH";
  }

  public String toString(){
    return "Sloth " + slothNumber + ", location " + position;
  }
}