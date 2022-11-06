import java.util.Objects;

public class Employee {
    private final String name;
    private int salary;
    private int departament;
    private static int counter = 0;
    public int id;

    public Employee(String name, int salary,int departament) {
        this.name = name;
        this.salary = salary;
        this.departament = departament;
        this.id = counter++;

    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartament() {
        return this.departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "; Ф.И.О. сотрудника: " + name +
                "; зарплата: " + salary +
                "; отдел: " + departament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && departament == employee.departament && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, departament, id);
    }
}
