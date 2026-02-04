package factory.components.button;

public class AndroidButton implements Button{
    @Override
    public void getSize() {
        System.out.println("THis is android button size,default 50px");
    }
}
