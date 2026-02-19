public final class Course {
    private String department;
    private String number;

    private Course(String setDepartment, String setNumber) {
        department = setDepartment;
        number = setNumber;
    }

    public static Course[] fromCSV(String csv) {
        assert csv != null && !csv.equals("");
        //split by lines, eg " CS, 125" 
        String[] lines = csv.split("\n");
        // set up our return array
        Course[] courses = new Course[lines.length];
        // now we have to split by commas and trim white space
        for (int i = 0; i < lines.length; i++) {
            String[] parts = lines[i].split(",");
            // line[i]: parts[0] == " CS" && parts[1] == "125"
            String dep = parts[0].trim();
            String num = parts[1].trim();
            courses[i] = new Course(dep, num);
        }
        return courses;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }
}