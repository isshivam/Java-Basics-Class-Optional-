import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClassRoom {
    private String roomId;
    private Optional<List<Student>> studentList;
    public ClassRoom(final String classRoomId, final Optional<List<Student>> classStudents) {
        this.roomId = classRoomId;
        this.studentList = classStudents;
    }

    public List<Student> getStudentsWithoutSubject() {
        List<Student> withoutSubject =  studentList.get().stream()
                .filter(student -> student
                        .getSubject().equals(Optional.empty()))
                .collect(Collectors.toList());
        return withoutSubject;
    }

    public List<Optional<String>> getDistinctSubjectsByRoomId(
            final String classRoomId) {
        if (!classRoomId.equals(roomId)) {
            return null;
        }
        List<Optional<String>> distinctSubject = studentList.get()
                .stream()
                .filter(student -> student.getSubject().isPresent())
                .map(student -> student.getSubject()).distinct()
                .collect(Collectors.toList());
        return distinctSubject;
    }

    public String hasStudents() {
        if (studentList.isPresent()) {
            return "Hello Students!";
        }
        return "";
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(final String classRoomId) {
        this.roomId = classRoomId;
    }

    public Optional<List<Student>> getStudentList() {
        return studentList;
    }

    public void setStudentList(final Optional<List<Student>> classStudentList) {
        this.studentList = classStudentList;
    }
    @Override
    public String toString() {
        return "ClassRoom{"
                + "roomId='" + roomId + '\''
                + ", studentList=" + studentList
                + '}';
    }
}
