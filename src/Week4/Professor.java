package Week4;

public class Professor extends Human {
    int classCount;

    public Professor() {
    }

    public Professor(String name, int age, int height, int classCount) {
        this(name, age, height, "Professor", classCount);
    }

    public Professor(String name, int age, int height, String career, int classCount) {
        super(name, age, height, career);
        this.classCount = classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public int getClassCount() {
        return classCount;
    }

    @Override
    public void showInfo() {
        System.out.println(name + "님의 나이는 " + age + "이고, 키는 " + height + "cm 입니다. 직업은 " + career + "이며, 진행중인 수업은 "
                + classCount + "개 입니다.");
        System.out.println();
    }
}
