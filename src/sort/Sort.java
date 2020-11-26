package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Tshirt;
import printing.Print;
import random.RandomTshirtGenerator;

public class Sort {

    RandomTshirtGenerator r = new RandomTshirtGenerator();
    Print p = new Print();

    Scanner in = new Scanner(System.in);

    public Sort() {
    }

    public List<Integer> bubbleSort(List<Integer> arr) {
        List<Integer> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr2.get(j) > arr2.get(j + 1)) {
                    //swap arr[j+1] and arr[j]
                    int temp = arr2.get(j);
                    arr2.set(j, arr2.get(j + 1));
                    arr2.set(j + 1, temp);

                }
            }
        }
        return (arr2);
    }

    public List<Tshirt> bubbleSortTshirtsBySize(List<Tshirt> arr, int sortingType) { //sortingType = 0 --> ASC ----- sortingType = 1 --> DESC

        List<Tshirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() > arr2.get(j + 1).getSize().ordinal()) {
                            //swap arr[j+1] and arr[j]
                            Tshirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));
                            arr2.set(j + 1, temp);
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() < arr2.get(j + 1).getSize().ordinal()) {
                            Tshirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));
                            arr2.set(j + 1, temp);
                        }
                    }
                }
        }

        return (arr2);
    }

    public List<Tshirt> bubbleSortTShirtsByColor(List<Tshirt> arr, int sortingType) {
        List<Tshirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() > arr2.get(j + 1).getColor().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            Tshirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1)); 
                            arr2.set(j + 1, temp);  
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() < arr2.get(j + 1).getColor().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            Tshirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  
                            arr2.set(j + 1, temp);
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    public List<Tshirt> bubbleSortTShirtsByFabric(List<Tshirt> arr, int sortingType) {
        List<Tshirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() > arr2.get(j + 1).getFabric().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            Tshirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  
                            arr2.set(j + 1, temp); 
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() < arr2.get(j + 1).getFabric().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            Tshirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp; 
                        }
                    }
                }
                break;
        }

        return (arr2);
    }


    public void bubbleSortingType(int sortByType, int numOfTshirts) {
        List<Tshirt> tshirt = new ArrayList<>(numOfTshirts);
        switch (sortByType) {
            case 1:
                tshirt = bubbleSortTshirtsBySize(r.randomTshirtGenerator(numOfTshirts), 0);
                p.printArray(tshirt);
                break;
            case 2:
                tshirt = bubbleSortTshirtsBySize(r.randomTshirtGenerator(numOfTshirts), 1);
                p.printArray(tshirt);
                break;
            case 3:
                tshirt = bubbleSortTShirtsByColor(r.randomTshirtGenerator(numOfTshirts), 0);
                p.printArray(tshirt);
                break;
            case 4:
                tshirt = bubbleSortTShirtsByColor(r.randomTshirtGenerator(numOfTshirts), 1);
                p.printArray(tshirt);
                break;
            case 5:
                tshirt = bubbleSortTShirtsByFabric(r.randomTshirtGenerator(numOfTshirts), 0);
                p.printArray(tshirt);
                break;
            case 6:
                tshirt = bubbleSortTShirtsByFabric(r.randomTshirtGenerator(numOfTshirts), 1);
                p.printArray(tshirt);
                break;
               
                
        }
    }
     
       public void selectSortingType(Scanner in){
           
           System.out.println("Select number of TShirts:");
             int selectNumOfTshirts = in.nextInt();
        System.out.println("----------------Select Sorting Type-------------");
        System.out.println("1.Sorting By Size Ascendant\n"
                           +"2.Sorting By Size Descendant\n"
                           +"3.Sorting By Color Ascendant\n"
                           +"4.Sorting By Color Descendant\n"
                           +"5.Sorting By Fabric Ascendant\n"
                           +"6.Sorting By Fabric Descendant");
      
        int select = in.nextInt();
        switch(select){
                case 1:  bubbleSortingType(select,selectNumOfTshirts);
                break;
                case 2:  bubbleSortingType(select,selectNumOfTshirts);
                break;
                case 3:  bubbleSortingType(select,selectNumOfTshirts);
                break;
                case 4:  bubbleSortingType(select,selectNumOfTshirts);
                break;
                case 5:  bubbleSortingType(select,selectNumOfTshirts);
                break;
                case 6:  bubbleSortingType(select,selectNumOfTshirts);
                break;
       }
}
       
}
