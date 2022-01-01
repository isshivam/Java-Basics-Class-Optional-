import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Application{
    public static void main(final String[] args) {
        final int student1RollNo = 101;
        final int student2RollNo = 102;
        final int student3RollNo = 103;
        final int student4RollNo = 104;
        final int student5RollNo = 105;
        final int student6RollNo = 106;
        final int student7RollNo = 107;
        final int student8RollNo = 108;
        final int student9RollNo = 109;
        final int student10RollNo =110;

        Student student1 = new Student(
                "Shivam", student1RollNo, Optional.of("SpringBoot"));
        Student student2 = new Student(
                "Gulshan", student2RollNo, Optional.empty());
        Student student3 = new Student(
                "Gopal", student3RollNo, Optional.of("React"));
        Student student4 = new Student(
                "Mudit", student4RollNo, Optional.empty());
        Student student5 = new Student(
                "Rohit", student5RollNo, Optional.of("Kafka"));
        Student student6 = new Student(
                "priya", student6RollNo, Optional.empty());
        Student student7 = new Student(
                "Shikhar", student7RollNo, Optional.of("Angular"));
        Student student8 = new Student(
                "Arjun", student8RollNo, Optional.of("Angular"));

        Optional<List<Student>> studentList1 = Optional
                .of(Arrays.asList(student1, student2, student3, student6));

        Optional<List<Student>> studentList2 = Optional
                .of(Arrays.asList(student4, student5,
                        student7, student8));
        List<ClassRoom> classRooms = new ArrayList<>();
        classRooms.add(new ClassRoom("pqr", studentList1));
        classRooms.add(new ClassRoom("xyz", studentList2));
        classRooms.add(new ClassRoom("abc", Optional.empty()));

        String resultString = classRooms.get(1).hasStudents();
        System.out.println(resultString);
        List<Student> studentsWithoutSubject = classRooms
                .get(0).getStudentsWithoutSubject();

        System.out.println("\nStudent list without Subject: ");
        studentsWithoutSubject.stream().forEach(System.out::println);
        List<Optional<String>> subjectsList = classRooms.get(1)
                .getDistinctSubjectsByRoomId("xyz");
        System.out.println("\nDistinct Subject List of ClassRoom xyz: ");
        subjectsList.stream().forEach(System.out::println);
    }
}