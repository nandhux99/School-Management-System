package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Mainclass {
    public static void main(String[] args) {
         Teacher walter  = new Teacher(1, "Walter", 8000);
         Teacher pinkman = new Teacher(2, "Pinkman", 6000);
         Teacher JohnDurai = new Teacher(3, "John Durai", 12000);

         List<Teacher> teacherlist= new ArrayList<>();
         teacherlist.add(walter);
         teacherlist.add(pinkman);
         teacherlist.add(JohnDurai);

         Student Loki = new Student(1, "Loki", 4);
         Student Vinoth = new Student(2, "Vinoth", 11);
         Student Kumar = new Student(3, "Kumar", 12);

         List<Student> studentlist= new ArrayList<>();
         studentlist.add(Loki);
         studentlist.add(Vinoth);
         studentlist.add(Kumar);


         School highSchool= new School(teacherlist, studentlist);

         Loki.payFees(15000);
         Kumar.payFees(10000);
         Vinoth.payFees(8000);
         System.out.println(highSchool.getTotalMoneyEarned());
         walter.receiveSalary(walter.getSalary());
         pinkman.receiveSalary(pinkman.getSalary());
         JohnDurai.receiveSalary(JohnDurai.getSalary());
         System.out.println("HighSchool has paid salary for "+walter.getName()+" "+ walter.getSalary());
         System.out.println("HighSchool has paid salary for "+pinkman.getName()+" "+ pinkman.getSalary());
         System.out.println("HighSchool has paid salary for "+JohnDurai.getName()+" "+ JohnDurai.getSalary());
         System.out.println("and now has "+highSchool.getTotalMoneyEarned());












    }
}
