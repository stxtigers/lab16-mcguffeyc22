public class TechEmployee extends Employee{
  private String qual; 
  
  public TechEmployee(){
    
  }
  
  public void setQual(String ql){
    qual = ql;
  }
  
  public String getQual(){
    return qual;
  }
  
  public String toString(){
    return "LastName: " + this.getLastName() + ", PayRate: " + this.getPayRate();
  }
  
  public void setPayRate(double pr){
    super.setPayRate(pr * 2);
  }
}