public class Main {
    private static Employee[] employees = new Employee[10];
    public static void printEmployees () {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee:employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee!=null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee!=null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float)employees.length;
    }
    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
    public static void main(String[] args) {
        System.out.println("Курсовая работа");
        System.out.println("Базовый уровень");
        System.out.println();
        employees = new Employee[]{
                new Employee("Иванов Иван Иванович", 80000, 1),
                new Employee("Петров Сергей Петрович", 90000, 2),
                new Employee("Иванов Андрей Сергеевич", 100000, 1),
                new Employee("Краснова Анна Ивановна", 115000, 3),
                new Employee("Горбунова Евгения Петровна", 120000, 3),
                new Employee("Морозов Антон Николаевич", 70000, 4),
                new Employee("Прокопович Александр Алексеевич", 85000, 5),
                new Employee("Алексеева Дарья Николаевна", 95000, 2),
                new Employee("Николаев Анатолий Андреевич", 80000, 4),
                new Employee("Аксёнов Михаил Анатольевич", 110000, 5)
        };
        printFullNames();
        printEmployees();
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());

    }
    }