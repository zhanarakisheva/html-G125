public class StudentHouse {
    private String name;
    private Student[] students= new Student[1000];
    private int size = 0;

    public StudentHouse(String name) {
        this.name = name;
    }

    public StudentHouse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printStudents() {
        for (int i = 0; i < size; i++) {
            Student student = students[i];
            if (student != null) {
                System.out.println("Student{id=" + student.getId() + ", name='" + student.getName() + "', surname='" + student.getSurname() + "', gpa=" + student.getGpa() + "}");
            }
        }
    }

    void addStudent(Student student) {
        students[size] = student;
        size++;
    }
    void deleteStudent(int i) {
        students[i] = null;
    }
    Student theBestStudent() {
        Student bestStudent = null;
        double gpaMax = -1;

        for (int i = 0; i < size; i++) {
            Student student = students[i];
            if(student.getGpa() > gpaMax) {
                gpaMax = student.getGpa();
                bestStudent = student;
            }
        }

        return bestStudent;
    }
}
