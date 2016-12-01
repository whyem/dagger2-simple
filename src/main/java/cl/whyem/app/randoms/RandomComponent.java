package cl.whyem.app.randoms;

import dagger.Component;
import javax.inject.Singleton;

/**
 *
 * @author Y.Medina
 */
@Component(modules = RandomModule.class)
@Singleton
public interface RandomComponent {

    /**
     * Metodo que retorna una instancia de generador de numeros aleatorios.
     *
     * @return
     */
    public NumericRandomGenerator getNumericRandomGenerator();

    /**
     * Retorna una instancia de generador alfanumerico aleatorio.
     *
     * @return
     */
    public StringRandomGenerator getStringRandomGenerator();

}
