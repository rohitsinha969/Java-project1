class Student {// custom class banaye h
    int id;
    int yearOfjoining;
    String branchId;
    long collegeNumber;
    String name;

    public void printDetails() {
        System.out.println("Student ID is : " + collegeNumber + branchId + yearOfjoining + id);
        System.out.println("Student NAME is : " + name);
    }
}

public class page12_OOPS_in_JAVA {
    public static void main(String[] args) {
        Student S1 = new Student();// object create kiye hai yahan pe
        S1.collegeNumber = 103;
        S1.branchId = "ME";
        S1.yearOfjoining = 19;
        S1.id = 1117;
        S1.name = "Rohit";
        // custom class ka methods call kar diye
        // System.out.println(E1.id);
        // System.out.println(E1.name);
        // custom class ka function printDetails() ko call karenge ab
        S1.printDetails();

        Student S2 = new Student();// object create kiye hai yahan pe
        S2.collegeNumber = 157;
        S2.branchId = "CS";
        S2.yearOfjoining = 19;
        S2.id = 1206;
        S2.name = "YASHI";
        // custom class ka methods call kar diye
        // System.out.println(E2.id);
        // System.out.println(E2.name);
        // custom class ka function printDetails() ko call karenge ab
        S2.printDetails();
    }
}
