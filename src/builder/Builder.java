package builder;

//public class Builder {
//    private int id;
//    private String name;
//    private int age;
//    private int gradYear;
//
//
//
//    public int getId() {
//        return id;
//    }
//
//    public Builder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Builder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public Builder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public String getBrnach() {
//        return brnach;
//    }
//
//    public Builder setBrnach(String brnach) {
//        this.brnach = brnach;
//        return this;
//    }
//
//    public long getMobile() {
//        return mobile;
//    }
//
//    public Builder setMobile(long mobile) {
//        this.mobile = mobile;
//        return this;
//    }
//
//    public int getReqardPoint() {
//        return reqardPoint;
//    }
//
//    public Builder setReqardPoint(int reqardPoint) {
//        this.reqardPoint = reqardPoint;
//        return this;
//    }
//
//    public String getMotherTongue() {
//        return motherTongue;
//    }
//
//    public Builder setMotherTongue(String motherTongue) {
//        this.motherTongue = motherTongue;
//        return this;
//    }
//
//    public String getHostelRoom() {
//        return hostelRoom;
//    }
//
//    public Builder setHostelRoom(String hostelRoom) {
//        this.hostelRoom = hostelRoom;
//        return this;
//    }
//
//    private String brnach;
//    private long mobile;
//    private int reqardPoint;
//    private String motherTongue;
//    private String hostelRoom;
//    public void Helper(){
//
//
//    }
//
//    public Student build(){
//        //Validation starts
//        if(age>25){
//            throw new IllegalArgumentException("Age should be lessthan or equalt to 25");
//        }
//        //validation Ends
//        return new Student(this);
//    }
//}
