public class Employee {
  private String lastName;
  private double payRate;
  
  private static int EmployeeCount = 0;
  protected int EmployeeNumber;

  public Employee(){
    EmployeeNumber = EmployeeCount;
    EmployeeCount++;
  }
  
  public void setLastName(String name){
    lastName = name;  
  }
  
  public String getLastName(){
    return lastName;
  }
  
  public void setPayRate(double pr){
    payRate = pr;
  }
  
  public double getPayRate(){
    return payRate;
  }

  public static int getCount(){
    return EmployeeCount;
  }
  
  public String toString(){
   return "LastName: " + lastName + ", PayRate: " + payRate;
  }

}