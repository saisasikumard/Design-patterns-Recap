package factory;

public class Client {
    public static void main(String[] args) {
        Flutter fl=new Flutter();
        UIFactory uiFactory=fl.createUIfactory("android");
        uiFactory.createButton().getSize();

        Flutter fl2=new Flutter();
        UIFactory uiFactory2=fl.createUIfactory("ios");
        uiFactory2.createButton().getSize();
    }
}
