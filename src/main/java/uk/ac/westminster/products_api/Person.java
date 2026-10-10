package uk.ac.westminster.products_api;

public class Person {
    // 1. Private fields (data hiding / encapsulation)
    private String name;
    private String email;

    // 2. Default No-Arg Constructor (required by frameworks)
    public Person() {}

    // 3. Full Constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // 4. Getter & Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 5. Getter & Setter for Email (JavaBean standard)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
