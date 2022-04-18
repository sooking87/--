package Week4;

public class Human {
    String name;
    int age;
    int height;
    String career;

    public Human() {
    }

    public Human(String career) {
        this.career = career;
    }

    // Human 생성자
    public Human(String name, int age, int height, String career) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.career = career;
    }

    // 생성자 외에 멤버를 대입시킬 수 있는 메소드
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAgeAndHeight(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void showInfo() {
        System.out.println(name + "님의 나이는 " + age + "이고, 키는 " + height + "입니다. 직업은 " + career + "입니다.");
    }
}
