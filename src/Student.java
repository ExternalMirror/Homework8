public class Student extends MainInformation {
    private String name;
    private int age;
    private String parentName;

//    public Student(String name, int age, String parentName) {
//        this.name = name;
//        this.age = age;
//        this.parentName = parentName;
//    }
//
//    public Student() {
//
//    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getParentName(){
        return parentName;
    }
    public void setParentName(String parentName){
        this.parentName = parentName;
    }
    public void studentInfo(){
        System.out.println("Name of student: "+ name);
        System.out.println("Age of student: "+age);
        System.out.println("Parent name of student: "+parentName);
    }
}
