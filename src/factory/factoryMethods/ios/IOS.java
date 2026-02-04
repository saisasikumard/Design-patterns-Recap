package factory.factoryMethods.ios;

import factory.FlutterI;
import factory.UIFactory;

public class IOS implements FlutterI {
    @Override
    public UIFactory createUIfactory(String platform) {
        return new IOSuiFactory();
    }
}
