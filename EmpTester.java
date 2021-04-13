public class EmpTester {
  public static void main(String[] args){
    Employee e1 = new Employee();
    e1.setLastName("Ahoy");
    e1.setPayRate(2.35);
    System.out.println(e1);

    Employee e2 = new TechEmployee();
    e2.setLastName("Emmet");
    e2.setPayRate(2.35);
    System.out.println(e2);
  }
}