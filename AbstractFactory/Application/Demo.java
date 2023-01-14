package Application;

import Factories.AndroidFactory;
import Factories.GUIFactory;
import Factories.WindowsFactory;

public class Demo {

    private static App configureApplication() {
        App app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("Android")) {
            factory = new AndroidFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new App(factory);

        return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();

        app.paint();
    }
}