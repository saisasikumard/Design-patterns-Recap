package factory.components.button;

public class IOSButton implements Button   {
    @Override
    public void getSize() {
        System.out.println("this is IOS button size ..Default 40px");
    }
}
