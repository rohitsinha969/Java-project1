class StudentAlpha {
    private int id;
    private String name;

    public StudentAlpha(String collegeName, int collegeID) {
        id = collegeID;
        name = collegeName;
    }

    public String getName() {
        return name;
    }// getter

    public void setName(String n) {
        this.name = n;
    }// setter

    public void setId(int i) {
        this.id = i;
    }// setter

    public int getId() {
        return id;
    }// getter

}

public class page13_Constructors_in_JAVA {
    public static void main(String[] args) {
        StudentAlpha S1 = new StudentAlpha("lnct bhopal", 45);
        // S1.setId(40);
        // S1.setName("abc");
        System.out.println(S1.getId());
        System.out.println(S1.getName());
    }
}
