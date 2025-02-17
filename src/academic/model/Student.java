package academic.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Student {

    public String id;
    public String name;
    public String year;
    public String studyprogram;

    public Student(String id, String name, String year, String studyprogram) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.studyprogram = studyprogram;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getStudyprogram() {
        return studyprogram;
    }

}