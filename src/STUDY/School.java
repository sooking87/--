package STUDY;

class School {
    Teacher yiyoon;
    Student kim, song, choi, lee;
    Members members[];

    public School() {
        yiyoon = new Teacher("Yoon", 10303, "IT 공학전공");
        kim = new Student("kim", 210324, "IT 공학전공");
        song = new Student("song", 200324, "IT 공학전공");
        choi = new Student("choi", 190324, "IT 공학전공");

        members = new Members[4];
        members[0] = yiyoon;
        members[1] = kim;
        members[2] = song;
        members[3] = choi;
    }

    public void makeWork() {
        int n = members.length;
        for (int i = 0; i < n; i++) {
            members[i].work();
        }
    }

    public static void main(String[] args) {
        School mycom = new School();
        mycom.makeWork();
    }
}
