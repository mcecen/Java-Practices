package Kalıtım2;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called for: " + this.name);
    }

    void introduce() {
        System.out.println("I'm " + name + ", age: " + age);
    }
}

class Employee extends Person {
    String department;

    Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
        System.out.println("Employee constructor called for: " + this.name);
    }

    void work() {
        System.out.println(name + " works in " + department + " department.");
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, int age, String department, String language) {
        super(name, age, department);
        this.language = language;
        System.out.println("Developer constructor called for: " + this.name);
    }

    void code() {
        System.out.println(name + " codes in " + language);
    }
}

class Tester extends Employee {
    String tool;

    Tester(String name, int age, String department, String tool) {
        super(name, age, department);
        this.tool = tool;
        System.out.println("Tester constructor called for: " + this.name);
    }

    void test() {
        System.out.println(name + " tests using " + tool);
    }
}

