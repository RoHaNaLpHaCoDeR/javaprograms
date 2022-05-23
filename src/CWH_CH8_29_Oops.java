class Employee{
    int id;
    int Salary;
    String name;
    public void printDetails(){
        System.out.println("My ID is " + id);
        System.out.println("My name is "+ name);
        System.out.println("My salary is "+Salary);
    }

    public int getSalary() {
        return Salary;
    }
}

//A file can have only onr public class
public class CWH_CH8_29_Oops {
    public static void main(String[] args) {
        System.out.println("This is my custom class");
        Employee rohan = new Employee();
        Employee Aman = new Employee();
        // Setting Attributes
        rohan.id = 29;
        rohan.name = "Rohan Arora";
        rohan.Salary = 5000000;
        Aman.id = 30;
        Aman.name = "Aman Jain";
        Aman.Salary = 2000000;
        //Printing the details using the function created
        rohan.printDetails();
        Aman.printDetails();
        // Printing here
        System.out.println("My id is "+ rohan.id);
        System.out.println("My name is "+ Aman.name);
        int S = Aman.getSalary();
        System.out.println(S);
    }
}
