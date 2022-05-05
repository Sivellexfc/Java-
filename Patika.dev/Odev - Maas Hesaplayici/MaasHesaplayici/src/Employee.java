public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    private double bonus;
    private double tax;
    private double increase;

    private final int currentYear = 2022;

    public Employee(String name , double salary ,double workHours ,int hireYear) {

        this.name = name;

        if(salary < 0) {
            this.salary = 0;
        }
        else{this.salary = salary;}
        
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Employee(String name , int salary ,int workHours ,int hireYear) {

        this.name = name;

        if(salary < 0) {
            this.salary = 0;
        }
        else{this.salary = salary;}
        
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    public int getHireYear() {
        return hireYear;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if(salary < 0) {
            this.salary = 0;
        }
        else{this.salary = salary;}
    }
    public double getSalary() {
        return salary;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }  
    public double getWorkHours() {
        return workHours;
    }

    
    public double tax(double salary) {

        if(salary > 1000) {
            tax = (salary / 100 ) * 3;
            return tax;
        }
        else {
            tax = 0;
            return tax;
        }
        
    }

    public double bonus(double workHours){

        if(workHours>40){
           bonus = (workHours - 40) * 30;  
           return bonus;
        }
        else {
            bonus = 0;
            return bonus;
        }

    }

    public double raiseSalary(double hireYear){

        if((currentYear - hireYear) < 10){
            increase = (salary/100) * 5;
                return increase;
        }
        if((currentYear - hireYear) > 9 && (currentYear - hireYear) < 20){
            increase = (salary/100) * 10;
            return increase;
        }
        
        else {
            increase = (salary/100)*15;
            return increase;
        }

    }

    public void print(){

        tax(salary);
        raiseSalary(hireYear);
        bonus(workHours);

        System.out.println("_____________________________________________________________________________________");
        System.out.println("Name : " + this.name);
        System.out.println("Salary  : " + this.salary);
        System.out.println("Weekly working hour : " + this.workHours);
        System.out.println("Year of employment   : " + this.hireYear);

        System.out.println("Bonus : " + this.bonus);
        System.out.println("Salary increases  : " + this.increase);
        System.out.println("Tax   : " + this.tax);
        System.out.println("Total salary   : " + (salary-tax+increase+bonus));
        System.out.println("_____________________________________________________________________________________");

    }


    
}
