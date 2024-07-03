package OOP;

import interfase.animalTask.Cat;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("vilson","shehu",20,'M');
        employee1.setMosha(15);
        System.out.println(employee1.getEmri());
        employee1.setEmri("Gojart");
        System.out.println(employee1);
    }

}
