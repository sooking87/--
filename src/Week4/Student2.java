package Week4;

public class Student2 extends Human {
    int studentID;

    public Student2() {
    }

    public Student2(String name, int age, int height, int studentID) {
        this(name, age, height, "Student", 2116313);
    }

    public Student2(String name, int age, int height, String career, int studentID) {
        super(name, age, height, career);
        this.studentID = studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public void showInfo() {
        System.out.println(name + "님의 나이는 " + age + "이고, 키는 " + height + "cm 입니다. 직업은 " + career + "이며, 학번은 "
                + studentID + "입니다.");
        System.out.println();
    }
}
