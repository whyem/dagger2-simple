package cl.whyem.app.randoms;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 *
 * @author Y.Medina
 */
@Module
public class RandomModule {

    @Provides
    @Singleton
    public NumericRandomGenerator getNumericRandomGenerator() {
        return new NumericRandomGenerator();
    }

    @Provides
    @Singleton
    public StringRandomGenerator getStringRandomGenerator() {
        return new StringRandomGenerator();
    }

}
