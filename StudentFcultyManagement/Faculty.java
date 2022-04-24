package StudentFaculty;

public class Faculty {
    private int facultyID;
    private  String facultyName;
    private String facultyDept;
    private double facultySalary;

    public Faculty(int facultyID, String facultyName, String facultyDept, double facultySalary) {
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        this.facultyDept = facultyDept;
        this.facultySalary = facultySalary;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFacultyDept() {
        return facultyDept;
    }

    public double getFacultySalary() {
        return facultySalary;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyID=" + facultyID +
                ", facultyName='" + facultyName + '\'' +
                ", facultyDept='" + facultyDept + '\'' +
                ", facultySalary=" + facultySalary +
                '}';
    }
}
