package application;

public class Employee {
  private String firstname;
  private String lastname;
  private int id;
  private Department dept;

  public Employee(String firstname, String lastname, int id, Department dept) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.id = id;
    this.dept = dept;
  }
  public Employee(){
  };

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public int getId() {
    return id;
  }

  public void print() {
    System.out.println("Der Mitarbeiter "+id+" "+firstname+" "+lastname+" arbeitet in der Abeitlung "+dept.getName()+" in "+dept.getCity()+".");
  }

  public boolean isEquals(Employee other) {

    return this.id==other.id;
    }
}

