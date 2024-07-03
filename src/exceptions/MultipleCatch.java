package exceptions;

import inheritance.scrum_team_task.Employee;

public class MultipleCatch {
    public static void main(String[] args) {
        Employee employee=null;

        try {
            System.out.println(employee.name);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage()+e);
        }catch (NullPointerException a){
            System.out.println(a.getMessage()+a);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
