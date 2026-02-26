public class Inherit {
    class Person{
        private String firstName;
        private String lastName;
        private String gender;

        public Person(){}
        
        public Person(String firstName, String lastName, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }
        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }

        public String getGender() { return gender; }
        public void setGender(String gender) { this.gender = gender; }

        public String toString() {
            return "Person: " + firstName + " " + lastName + ", Gender: " + gender;
        }
        
        public boolean equals(Person p) {
            return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender);
        }
    }

    class Teacher extends Person{
        private String department;
        private String[] courses;

        public  Teacher(){}

        public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
            super(firstName, lastName, gender);
            this.department = department;
            this.courses = courses;
        }

        public String getDepartment() { return department; }
        public void setDepartment(String firstName) { this.department = department; }

        public String[] getCourses() { return courses; }
        public void setCourses(String[] courses) { this.courses = courses; }

    }
}
