package cl.whyem.app.randoms;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Generador de numeros aleatorios.
 *
 * @author Y.Medina
 */
public class NumericRandomGenerator implements RandomGenerator<Long> {

    @Override
    public Long getRandomValue() {
        return ThreadLocalRandom.current().nextLong(new Date().getTime());
    }

    @Override
    public void printRandomValue() {
        System.out.println("Numero aleatorio => " + ThreadLocalRandom.current().nextLong(new Date().getTime()));
    }

}
