package cl.whyem.app.randoms;

import java.util.UUID;

/**
 * Generador de strings alfanumericos aleatorios.
 *
 * @author Y.Medina
 */
public class StringRandomGenerator implements RandomGenerator<String> {

    @Override
    public String getRandomValue() {
        return UUID.randomUUID().toString();
    }

    @Override
    public void printRandomValue() {
        System.out.println("String alfanumerico aleatorio => " + UUID.randomUUID().toString());
    }

}
