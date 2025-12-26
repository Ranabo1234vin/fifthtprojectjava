package assegenment;

class Addres {
    String city;
    String state;

    Addres(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Employe {
    int id;
    String name;
    Addres address;

    // Constructor
    Employe(int id, String name, Addres address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Shallow Copy Constructor
    Employe(Employe emp) {
        this.id = emp.id;
        this.name = emp.name;
        this.address = emp.address; // same reference
    }

    void display() {
        System.out.println(id + " " + name + " " +
                address.city + " " + address.state);
    }
}

public class ShallowCopyDemo {
    public static void main(String[] args) {
        Addres addr = new Addres("Hyderabad", "Telangana");
        Employe e1 = new Employe(101, "Vinay", addr);

        Employe e2 = new Employe(e1); // Shallow copy

        e2.address.city = "Warangal"; // modifying copy

        e1.display();
        e2.display();
    }
}
