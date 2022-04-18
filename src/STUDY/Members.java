package STUDY;

class Members {
    String name;
    String dept;
    String major;
    int id;

    public Members(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void work() {
        System.out.println("\tMember: \"" + name + "\" does his best.");
    }
}
