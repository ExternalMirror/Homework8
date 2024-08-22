public class Group extends MainInformation {
    private  String grpName;
    private String leaderName;
    private int size; //amount of people


//    public Group(String grpName, String leaderName, int size) {
//        this.grpName = grpName;
//        this.leaderName = leaderName;
//        this.size = size;
//    }
//
//    public Group() {
//
//    }

    public String getGrpName(){
        return grpName;
    }
    public void setGrpName(String grpName){
        this.grpName = grpName;
    }
    public String getLeaderName(){
        return leaderName;
    }
    public void setLeaderName(String leaderName){
        this.leaderName = leaderName;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }

    public void groupInfo(){
        System.out.println("Name of group: "+grpName);
        System.out.println("Leader of group: "+ leaderName);
        System.out.println("Number of people group has: "+ size);
    }
}
