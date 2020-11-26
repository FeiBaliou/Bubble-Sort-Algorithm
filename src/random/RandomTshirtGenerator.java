package random;

import java.util.ArrayList;
import java.util.List;
import models.Tshirt;

public class RandomTshirtGenerator {


    public List<Tshirt> randomTshirtGenerator(int randomTshirt) {
        List<Tshirt> randomTshirts = new ArrayList<>(randomTshirt);
        for (int i = 0; i < randomTshirt; i++) {
            randomTshirts.add(new RandomTshirt());
        }
        return randomTshirts;
    }

}
