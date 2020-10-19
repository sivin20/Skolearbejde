

public class EnrollmentSystem
{
    Student[] students;
    Course[] courses;
    int courseCount = 0;
    int studentCount = 0;

    EnrollmentSystem () {
        students = new Student[30];
        courses = new Course[10];
    }
    public void addStudent(Student studentAdd) {
        students[studentAdd.id] = studentAdd;
        studentCount++;
    }
    public void removeStudent(int idRemove) {
        for(int i=0; i < students.length; i++) {
            if (students[i].id == idRemove) {
                students[i] = null;
            }
            if (students[i]==null)
                break;
        }
    }

    public void addCourse(Course courseAdd) {
        courses[courseCount] = courseAdd;
        courseCount++;
    }

    public void removeCourse(Course courseRemove) {
        for(int i=0; i < courses.length; i++) {
            if(courses[i] == courseRemove) {
                courses[i] = null;
            }
            if(courses[i]==null){
                break;
            }
        }
    }


    public void enroll (Student student, Course course) {
        course.enroll(student);
    }

    public void remove (Student student, Course course) {
        course.remove(student);

    }
    public void showParticipants (Course course) {
        for (Student student: course.getParticipants()) {
            System.out.println(student.getName());
        }
    }

    public void getCourses() {
        for(int i=0; i<courseCount; i++) {
            System.out.println(courses[i].name);
        }
    }

    public void getStudents() {
        for(int i=0; i<studentCount; i++) {
            System.out.println(students[i].getName());
        }
    }
}