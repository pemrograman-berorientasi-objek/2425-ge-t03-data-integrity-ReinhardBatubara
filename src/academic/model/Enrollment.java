package academic.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Enrollment {

    public String academicyear;
    public String semester;
    public String grade;
    public String code;
    public String id;

    public Enrollment(String code, String id, String academicyear, String semester, String grade) {
        this.code = code;
        this.id = id;
        this.academicyear = academicyear;
        this.semester = semester;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public String getId() {
        return id;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return grade;
    }

}