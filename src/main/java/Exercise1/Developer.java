package Exercise1;

public class Developer extends Person {


    private String department;

    public Developer(String name, String surname, String department) {
        super(name, surname);
        this.department = department;
    }

  public void drinkCoffee () {
      System.out.println("coffee with milk ");
  }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "department='" + department + '\'' +
                '}';
    }
}
