package factory;

public class Flutter implements FlutterI{

    void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }
    void setTheme(){
        System.out.println("Setting theme");
    }
    @Override
    public UIFactory createUIfactory(String platform){
        return UIFactoryFactory.getUIfactorybyPlatform(platform);
    }
}
