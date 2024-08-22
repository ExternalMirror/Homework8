public class Lesson extends MainInformation {
    private String lessonName;
    private int lessonDuration;
    private String lessonTopic;

//    public Lesson() {
//
//    }
//    public Lesson(String lessonName, int lessonDuration, String lessonTopic) {
//        this.lessonName = lessonName;
//        this.lessonDuration = lessonDuration;
//        this.lessonTopic = lessonTopic;
//    }
    public String getLessonName(){
        return lessonName;
    }
    public void setLessonName(String lessonName){
        this.lessonName = lessonName;
    }
    public int getLessonDuration(){
        return lessonDuration;
    }
    public void setLessonDuration( int lessonDuration){
        this.lessonDuration = lessonDuration;
    }
    public String getLessonTopic() {
        return lessonTopic;
    }
    public void setLessonTopic(String lessonTopic){
        this.lessonTopic = lessonTopic;
    }
    public void lessonInfo(){
        System.out.println("Name of lesson: "+lessonName);
        System.out.println("Duration of lesson: "+ lessonDuration);
        System.out.println("Topic of lesson: "+lessonTopic);
    }
}
