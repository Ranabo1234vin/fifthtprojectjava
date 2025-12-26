package assegenment;
class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Copy constructor
    Address(Address a) {
        this.city = a.city;
        this.state = a.state;
    }
}

class EmployeeDeep {
    int id;
    String name;
    Address address;

    EmployeeDeep(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Deep Copy Constructor
    EmployeeDeep(EmployeeDeep emp) {
        this.id = emp.id;
        this.name = emp.name;
        this.address = new Address(emp.address); // new object
    }

    void display() {
        System.out.println(id+ " " + name + " " +
                address.city + " " + address.state);
    }
}

public class DeepCopyDemo {
    public static void main(String[] args) {
    	System.out.println("Deep copy!!");
        Address addr = new Address("Hyderabad", "Telangana");
        EmployeeDeep e1 = new EmployeeDeep(101, "Vinay", addr);

        EmployeeDeep e2 = new EmployeeDeep(e1); // Deep copy

        e2.address.city = "Warangal";

        e1.display();
        e2.display();
    }
}
