package Models.Staff;

    public abstract class StaffMember {
        protected String name;
        protected String lastName;
        protected int age;
        protected int credential;

        public StaffMember (String name, String lastName, int age, int credential) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.credential = credential;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getCredential() {
            return credential;
        }

        public void setCredential(int credential) {
            this.credential = credential;
        }
    }

