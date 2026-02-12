public class Course {
    private String department;
    private String number;
    private int enrollment;

    public Course(String setDepartment, String setNumber, int setEnrollment) {
        assert setDepartment != null && setNumber != null && setEnrollment >= 0;
        department = setDepartment;
        number = setNumber;
        enrollment = setEnrollment;
    }

    @Override
    public boolean equals(Object o) {
        if (o ==  null || !(o instanceof Course)) {
            return false;
        }
        Course other = (Course) o;
        return other.number.equals(number) && other.department.equals(department);
    }
}