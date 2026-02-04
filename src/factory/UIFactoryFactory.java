package factory;

import factory.factoryMethods.android.AndroidUIFactory;
import factory.factoryMethods.ios.IOSuiFactory;

public class UIFactoryFactory {
    public static UIFactory getUIfactorybyPlatform(String platform){
        if(platform.equals("android")){
            return new AndroidUIFactory();
        } else if (platform.equals("ios") ){
            return new IOSuiFactory();
        }
        return null;

    }
}
