package Week4;

public class HumanTest {
    public static void main(String[] args) {
        Student2 Sohn = new Student2("SohnSooKyoung", 21, 165, 2116313);
        // 교수님의 프로필을 몰라서 -1로 넣었습니다...
        Professor Yoon = new Professor("YoonYongIk", -1, -1, 5);
        Manager Kim = new Manager("Kim", 42, 176, 9, 18);
        Manager Choi = new Manager("Choi", 35, 158, 8, 18);
        Human sohnsoo = new Student2("a", 21, 165, 21);

        Human h = new Student2();
        Student2 s = (Student2) h;

        Sohn.setAgeAndHeight(22, 165);
        Sohn.showInfo();

        Yoon.showInfo();

        Kim.showInfo();

        System.out.println(Choi.getName() + "님은 오늘 야간 근무를 합니다.");
        Choi.setStartAndEnd(8, 22);
        Choi.showInfo();

        // 업캐스팅
        h.setName("손민국");
        h.setAgeAndHeight(20, 178);
        h.setCareer("Student");
        h.showInfo();

        // 다운 캐스팅
        s.setName("송이현");
        s.setAgeAndHeight(22, 160);
        s.setCareer("Student");
        s.setStudentID(21);
        s.showInfo();
    }
}
