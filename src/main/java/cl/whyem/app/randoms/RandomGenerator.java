package cl.whyem.app.randoms;

/**
 * Interfaz para generar multiples generadores de randoms.
 *
 * @author Y.Medina
 * @param <T>
 */
public interface RandomGenerator<T extends Object> {

    public T getRandomValue();

    public void printRandomValue();

}
