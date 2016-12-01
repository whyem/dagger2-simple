package cl.whyem.app;

import cl.whyem.app.randoms.DaggerRandomComponent;
import cl.whyem.app.randoms.RandomComponent;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

public class Main {

    interface Printer {

        void printMsg(String msg);
    }

    static class ConsolePrinter implements Printer {

        @Override
        public void printMsg(String msg) {
            System.out.println(msg);
        }
    }

    @Singleton
    @Component(modules = ConsoleModule.class)
    interface HelloWorldApp {

        Printer getPrinter();

    }

    @Module
    static class ConsoleModule {

        @Provides
        Printer providePrinter() {
            return new ConsolePrinter();
        }

    }

    public static void main(String[] args) {
        HelloWorldApp app = DaggerMain_HelloWorldApp.create();
        app.getPrinter().printMsg("Hello");

        RandomComponent component = DaggerRandomComponent.create();
        component.getNumericRandomGenerator().printRandomValue();
        component.getStringRandomGenerator().printRandomValue();

        String randomFromComponent = component.getStringRandomGenerator().getRandomValue();
        System.out.println("Aleatorio obtenido desde 'Generator', mediante 'Component' => " + randomFromComponent);
    }
}
