package academic.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver1 {

    public static void main(String[] _args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
        
        while (scanner.hasNext()) {
            String input = scanner.nextLine().trim();

            if (input.equals("---")) {
                break;
            }

            String[] inputSegments = input.split("#");
            String command = inputSegments[0];
            if (command.equals("course-add"))
            {
                String code = inputSegments[1];
                String name = inputSegments[2];
                String credits = inputSegments[3];
                String passinggrade = inputSegments[4];
                boolean mirip = false;
                for (Course course : courses) {
                    if (course.getCode().equalsIgnoreCase(code)) {
                        mirip = true;
                    }
                }
                if(!mirip){
                Course course = new Course(code, name, Integer.parseInt(credits), passinggrade);
                courses.add(course);
                }
            }
            if (command.equals("student-add"))
            {
                String id = inputSegments[1];
                String name = inputSegments[2];
                String year = inputSegments[3];
                String studyprogram = inputSegments[4];    
                Student student = new Student(id, name, year, studyprogram);
                students.add(student);
            }
            if (command.equals("enrollment-add"))
            {
                String code = inputSegments[1];
                String id = inputSegments[2];
                String academicyear = inputSegments[3];
                String semester = inputSegments[4];
                Enrollment enrollment = new Enrollment(code, id, academicyear, semester, "None");
                enrollments.add(enrollment);        
            }
        }
        Collections.sort(courses, (a1, a2) -> a1.getCode().compareTo(a2.getCode()));
        for (Course course : courses) {
            System.out.println(course.getCode() + "|" + course.getName() + "|" + course.getCredits() + "|" + course.getPassinggrade());
        }
        for (Student student : students) {
            System.out.println(student.getId() + "|" + student.getName() + "|" + student.getYear() + "|" + student.getStudyprogram());
        }
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.getCode() + "|" + enrollment.getId() + "|" + enrollment.getAcademicyear() + "|" + enrollment.getSemester()+ "|" + enrollment.getGrade());
        }
        scanner.close();

    }

}