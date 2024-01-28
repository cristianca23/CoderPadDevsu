package karate;

import com.intuit.karate.junit5.Karate;

public class PetStoreFlowRunner {

    @Karate.Test
    Karate testAll() {
        return Karate.run("pet_store_flow").relativeTo(getClass());
    }
}
