package in.vamsoft.exercise.domain;

public class Manager extends Employee {
  private String deptName;

  public Manager(int empId, String name, String ssn, double salary, String deptName) {
    super(empId, name, ssn, salary);
    
  }

  public String getDeptName() {
    return deptName;
  }

}
