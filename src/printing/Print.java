package printing;

import java.util.ArrayList;
import java.util.List;
import models.Tshirt;
import random.RandomTshirt;

public class Print {

    /* Prints the array */
    public void printArray(List<Tshirt> arr) {
        int n = arr.size();
        for (int i = 0; i < n; ++i) {
            System.out.println(arr.get(i) + " ");
        }
        System.out.println();
    }

}
