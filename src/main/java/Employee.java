public class Employee {

    public  int id;
    public  String name;
    public  double salary;
    public int workTime;
    public int SPH;

    public Employee( int id,String name, double salary, int workTime, int SPH) {
        this.id = id;
        this.name = name;

        this.salary = salary;
        this.workTime = workTime;
        this.SPH = SPH;
    }

    public double computeYearlySalary(){
        return salary*12;
    }

    public double increaseSalByPercent(int percent){
        return ((percent*salary)/100)+salary;
    }

    public double payCheck(){
        return (workTime*14)+(overTime()*2);
    }

    public int overTime(){
        int weekTime= workTime*7;
        int overTime= weekTime-40;
        return Math.max(overTime, 0);
    }

    public static void main(String[] args) {
        Employee employee= new Employee(1,"Nazrin",5000,9,2);
        System.out.println("Hi "+ employee.name);
        System.out.println("Yearly salary: "+ employee.computeYearlySalary());
        System.out.println("Increased: "+employee.increaseSalByPercent(4));
        System.out.println("Over Time for week: "+ employee.overTime()+" hours");
        System.out.println("Salary for two weeks (overtime included) : "+ employee.payCheck());
    }
}
