package random;

import java.util.Random;
import models.Tshirt;
import models.enums.Color;
import models.enums.Fabric;
import models.enums.Size;

public class RandomTshirt extends Tshirt {

    public RandomTshirt() {
       this.setColor(randomColor());
       this.setSize(randomSize());
       this.setFabric(randomFabric());
       this.setName(randomName());
    }

    public Size randomSize() {
        Random r = new Random();
        return Size.values()[r.nextInt(Size.values().length)];
    }

    private Fabric randomFabric() {
        Random random = new Random();
        return Fabric.values()[random.nextInt(Fabric.values().length)];
    }

    private Color randomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }

    
    public String randomName(){
        char chars[] = {'A','B','C','D','E','F','G','H','I','G','K','L','M','N','O'};
        String s = "";
        for (int i = 0; i <8; i++) {
            s+=chars[new Random().nextInt(chars.length)];
        }
        return s;
    }
}
