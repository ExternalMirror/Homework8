import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1.Student");
            System.out.println("2.Group");
            System.out.println("3.Lesson");
            System.out.println("4.Teacher");
            System.out.print("Enter System: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Student student = new Student();
                    System.out.print("Enter Name: ");
                    student.setName(sc.nextLine());
                    System.out.print("Enter Age: ");
                    student.setAge(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Parent name: ");
                    student.setParentName(sc.nextLine());
                    student.studentInfo();
                    System.out.println("Choose an option:");
                    System.out.println("1. Add");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("4. Keep");
                    System.out.print("Enter option: ");
                    int optionStudent = sc.nextInt();
                    sc.nextLine();
                    statusOptions(optionStudent);
                    break;
                case 2:
                    Group group = new Group();
                    System.out.print("Enter group name: ");
                    group.setGrpName(sc.nextLine());
                    System.out.print("Enter leader name: ");
                    group.setLeaderName(sc.nextLine());
                    System.out.print("Enter Number of people Group has: ");
                    group.setSize(sc.nextInt());
                    group.groupInfo();
                    System.out.println("Choose an option:");
                    System.out.println("1. Add");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("4. Keep");
                    System.out.print("Enter option: ");
                    int optionGroup = sc.nextInt();
                    sc.nextLine();
                    statusOptions(optionGroup);
                    break;
                case 3:
                    Lesson lesson = new Lesson();
                    System.out.print("Enter name of lesson: ");
                    lesson.setLessonName(sc.nextLine());
                    System.out.print("Enter duration (min) : ");
                    lesson.setLessonDuration(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Topic of lesson: ");
                    lesson.setLessonTopic(sc.nextLine());
                    lesson.lessonInfo();
                    System.out.println("Choose an option:");
                    System.out.println("1. Add");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("4. Keep");
                    System.out.print("Enter option: ");
                    int optionLesson = sc.nextInt();
                    sc.nextLine();
                    statusOptions(optionLesson);
                    break;
                case 4:
                    Teacher teacher = new Teacher();
                    System.out.print("Enter name: ");
                    teacher.setName(sc.nextLine());
                    System.out.print("Enter age: ");
                    teacher.setAge(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter name of subject that Teacher teach: ");
                    teacher.setSubject(sc.nextLine());
                    teacher.teacherInfo();
                    System.out.println("Choose an option:");
                    System.out.println("1. Add");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("4. Keep");
                    System.out.print("Enter option: ");
                    int optionTeacher = sc.nextInt();
                    sc.nextLine();
                    statusOptions(optionTeacher);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid option");
            }
        }catch (Exception ex){
            System.err.println("Error has occurred");
            ex.printStackTrace();
        }finally {
            sc.close();
        }
    }
    private static void statusOptions(int option) {
        try {
            switch (option) {
                case 1:
                    MainInformation.add();
                    break;
                case 2:
                    MainInformation.update();
                    break;
                case 3:
                    MainInformation.delete();
                    break;
                case 4:
                    MainInformation.search();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid option");
            }
        }catch (Exception ex){
            System.err.println("Error has occurred");
            ex.printStackTrace();
        }
    }
}
