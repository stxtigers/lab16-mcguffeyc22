public class Tester{
  public static void main(String[] args){
    Animal Sqr = new Squirrel(2, 2);
    Squirrel GSqr = new GraySquirrel(3, 3);
    Squirrel FSqr = new FlyingSquirrel(1, 1);
    Sqr.move(1);
    GSqr.move(2);
    FSqr.move(6);
    System.out.println(Sqr);
    System.out.println(GSqr);
    System.out.println(FSqr);
  }
}