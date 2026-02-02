package builder;

public class Main {
    public static void main(String[] args) {
        Student.Builder builder=Student.getBuilder();
        builder.setAge(24);
        Student student=builder.build();
        System.out.println(student);
        Student student1=Student.getBuilder()
                        .setAge(25)
                        .setName("sasi")
                        .build();
        System.out.println(student1);
    }
}
