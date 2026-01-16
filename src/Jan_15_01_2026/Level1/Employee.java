package Jan_15_01_2026.Level1;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Rubez";
        e.id = 101;
        e.salary = 45000;

        e.displayDetails();
    }
}
