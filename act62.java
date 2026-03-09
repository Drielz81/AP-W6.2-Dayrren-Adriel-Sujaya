class Employee{
    protected String name;
    protected double baseSalary;

    protected Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }
    protected String getRole(){
        return "Employee";
    }

    public void printInfo(){
        System.out.println("name : " + name );
        System.out.println("type : " + getRole() );
        System.out.println("total salary : " + calculateSalary() + "\n");
    }
}
class Manager extends Employee{
    
    public Manager(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    public String getRole(){
        return "Manager";
    }
    @Override
    public double calculateSalary(){
        return baseSalary + 2000000;
    }
}
class Programmer extends Employee{

    protected Programmer(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    public String getRole(){
        return "Programmer";
    }
    @Override
    public double calculateSalary(){
        return baseSalary + 1000000;
    }
}
class Intern extends Employee{

    protected Intern(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    public String getRole(){
        return "Intern";
    }
    @Override
    public double calculateSalary(){
        return baseSalary + 300000;
    }

}

public class act62 {
    public static void main(String[] args) {
        double total_gaji = 0;
        Employee[] aray = {
            new Manager("Alya", 5000000),
            new Programmer("Budi", 4000000),
            new Programmer("Citra", 4500000),
            new Intern("Dina", 2000000)
        };

        for (Employee i : aray){
            i.printInfo();
            total_gaji += i.calculateSalary();
        }
        System.out.printf("%.1f",total_gaji);
    }
}
git 