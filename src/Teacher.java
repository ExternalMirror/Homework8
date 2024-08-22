public class Teacher extends MainInformation {
    private String name;
    private int age;
    private String subject; //which subject teacher teach

//    public Teacher (String name, int age, String subject) {
//        this.name = name;
//        this.age = age;
//        this.subject = subject;
//    }
//
//    public Teacher() {
//
//    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age =age;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject =subject;
    }
    public void teacherInfo(){
        System.out.println("Name of teacher: "+name);
        System.out.println("Age of teacher: "+age);
        System.out.println("Subject that is taught: "+ subject);
    }
}
