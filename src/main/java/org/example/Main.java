package org.example;

public class Main {
    public static void main(String[] args) {
        Company apple = new Company("Apple");
        Department security = new Department("Security", apple);
        Department economy = new Department("Economy", apple);
        Department develop = new Department("Develop", new Company("IBM"));
        Employee john = new Employee("John", security);

        apple.setCompanyName("Apple inc.");

        System.out.println(john.getDepartment().getCompany().getCompanyName());

    }
}