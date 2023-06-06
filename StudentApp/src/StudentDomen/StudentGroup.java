package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Анонимный итератор
     */

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int cnt;

            @Override
            public boolean hasNext() {
                return cnt < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(cnt++);
            }
        };

        // return new SGIterator(students);
    }

}
