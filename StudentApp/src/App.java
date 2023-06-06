import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Сергей", "Иванов", 25, (long) 101);
        Student s2 = new Student("Андрей", "Сидоров", 23, (long) 111);
        Student s3 = new Student("Иван", "Петров", 23, (long) 301);
        Student s4 = new Student("Даша", "Цветкова", 24, (long) 121);
        Student s5 = new Student("Лена", "Незабудкина", 25, (long) 231);

        List<Student> lisStud = new ArrayList<Student>();
        lisStud.add(s1);
        lisStud.add(s2);
        lisStud.add(s3);
        lisStud.add(s4);
        lisStud.add(s5);

        StudentGroup group = new StudentGroup(lisStud);

        for (Student stud : group) {
            System.out.println(stud);
        }

        System.out.println("=========== после сорт ============");

        Collections.sort(group.getStudents());
        for (Student stud : group) {
            System.out.println(stud);
        }
    }
}
