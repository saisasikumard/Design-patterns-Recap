package factory.factoryMethods.android;

import factory.FlutterI;
import factory.UIFactory;

public class Android implements FlutterI {
    @Override
    public UIFactory createUIfactory(String platform) {
        return new AndroidUIFactory();
    }
}
