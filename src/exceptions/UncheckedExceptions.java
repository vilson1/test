package exceptions;

import inheritance.scrum_team_task.Employee;

public class UncheckedExceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        //System.out.println(a/b);   //10/0

        char[] charArr={'A','B','C'};
       // System.out.println(charArr[100]);

        Employee employee=null;
        //System.out.println(employee.name);

        String str="vilson";
        str=null;
        System.out.println(str.toLowerCase());
    }
}
