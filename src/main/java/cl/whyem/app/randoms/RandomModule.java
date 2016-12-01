package cl.whyem.app.randoms;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author Y.Medina
 */
@Module
public class RandomModule {

    @Provides
    public NumericRandomGenerator getNumericRandomGenerator() {
        return new NumericRandomGenerator();
    }

    @Provides
    public StringRandomGenerator getStringRandomGenerator() {
        return new StringRandomGenerator();
    }

}
