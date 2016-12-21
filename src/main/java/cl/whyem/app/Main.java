package cl.whyem.app;

import cl.whyem.app.randoms.DaggerRandomComponent;
import cl.whyem.app.randoms.RandomComponent;

public class Main {

    public static void main(String[] args) {
        RandomComponent component = DaggerRandomComponent.create();
        component.getNumericRandomGenerator().printRandomValue();
        component.getStringRandomGenerator().printRandomValue();
        String randomFromComponent = component.getStringRandomGenerator().getRandomValue();
        System.out.println("Aleatorio obtenido desde 'Generator', mediante 'Component' => " + randomFromComponent);
    }
}
