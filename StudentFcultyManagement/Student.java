package StudentFaculty;

public class Student {
    // instances
    private int stdID;
    private  String stdName;
    private String stdDept;
    // constructor
    public Student(int stdID, String stdName, String stdDept) {
        this.stdID = stdID;
        this.stdName = stdName;
        this.stdDept = stdDept;
    }
  //getters
    public int getStdID() {
        return stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdDept() {
        return stdDept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdID=" + stdID +
                ", stdName='" + stdName + '\'' +
                ", stdDept='" + stdDept + '\'' +
                '}';
    }
}
