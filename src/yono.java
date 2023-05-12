public class yono {
    // CourseException.java
    public class CourseException extends RuntimeException {
        private int type;

        public CourseException(int type) {
            this.type = type;
        }
        public String getMessage() {
            String message = "";
            switch(type) {
                case 0:
                    message = "Invalid course department: must consist of three letters";
                    break;
                case 1:
                    message = "Invalid course number: must be in the range 1001-9999";
                    break;
                case 2:
                    message = "Invalid course credits: must be between 1 and 6";
                    break;
                default:
                    message = "Unknown course exception";
            }
            return message;
        }
    }
    public class Course {
        private String department;
        private int number;
        private int credits;

        public Course(String department, int number, int credits) {
            if(department.length() != 3) {
                throw new CourseException(0);
            }
            if(number < 1001 || number > 9999) {
                throw new CourseException(1);
            }
            if(credits < 1 || credits > 6) {
                throw new CourseException(2);
            }
            this.department = department;
            this.number = number;
            this.credits = credits;
            System.out.println("Course created successfully: " + department + " " + number + ", " + credits + " credits");
        }
    }

    // CourseExceptionTest.java
    public class CourseExceptionTest {
        public  void main(String[] args) {
            Course[] courses = new Course[6];
            // valid courses
            courses[0] = new Course("BCE", 2005, 3);
            courses[1] = new Course("CSE", 1001, 3);
            courses[2] = new Course("ECE", 4003, 4);
            try {
                courses[3] = new Course("MTH", 2005, 3);
            } catch(CourseException e) {
                System.out.println("Error creating course: " + e.getMessage());
            }
            try {
                courses[4] = new Course("BCE", 999, 3);
            } catch(CourseException e) {
                System.out.println("Error creating course: " + e.getMessage());
            }
            try {
                courses[5] = new Course("CSE", 2005, 7);
            } catch(CourseException e) {
                System.out.println("Error creating course: " + e.getMessage());
            }
        }
    }

}
