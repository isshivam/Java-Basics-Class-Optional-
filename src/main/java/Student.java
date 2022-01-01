import java.util.Optional;
public class Student {
    private String name;
    private int rollNumber;
    private Optional<String> subject;
    public Student(final String studentName, final int studentRollNumber,
                   final Optional<String> studentSubject) {
        this.name = studentName;
        this.rollNumber = studentRollNumber;
        this.subject = studentSubject;
    }
    public String getName() {
        return name;
    }

    public void setName(final String studentName) {
        this.name = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(final int studentRollNumber) {
        this.rollNumber = studentRollNumber;
    }

    public Optional<String> getSubject() {
        return subject;
    }

    public void setSubject(final Optional<String> studentSubject) {
        this.subject = studentSubject;
    }


    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", rollNumber=" + rollNumber
                + ", subject=" + subject
                + '}';
    }
}
