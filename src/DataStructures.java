import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataStructures {

    public static void main(String args[]) {
        sortingSentences("Eddie knows what he's doing");
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(4);
        System.out.println(clumps(array));

    }

//    List<Cats> cats = new ArrayList<>;
//
//    public void printCats(List<Cats> cats) {
//        for (int i = 0; i < cats.size; i++) {
//            System.out.println(i);
//        }
//    }


    // 3.
    // Create a HashMap that maps the names of all the Access Coders in your Pod to their age.
    // Use a loop to print each key-value pair of the HashMap.

    public static void podHashMap() {
        Map<String, Integer> podMap = new HashMap<>();
        podMap.put("Josiel", 35);
        podMap.put("Max", 35);
        podMap.put("Eddie", 35);
        podMap.put("Que", 35);
        podMap.put("Ridita", 35);
        podMap.put("Yojana", 35);
        podMap.put("Asia", 35);

        for(String key : podMap.keySet()){
            System.out.println(key + " " + podMap.get(key));
        }

//        for (Map.Entry<String, Integer> entry : podMap.entrySet()) {
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }
    }


    // 6.

    public static int clumps(ArrayList<Integer> list) {
        int seriesCounter = 0, trueTracker = 0;
        boolean indexRepeat = true;

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).equals(list.get(i + 1))) { // == is comparing acsii value, need tro compare objects
                indexRepeat = true;
                trueTracker++;
            } else {
                indexRepeat = false;
            }

            if (indexRepeat && trueTracker == 1) {
                seriesCounter += 1;
            } else if (!indexRepeat) {
                trueTracker = 0;
            } else {
                indexRepeat = true;
            }
        }
        return seriesCounter;
    }


    // 7.

    public static void sortingSentences(String sentence) {
        String[] words = sentence.split(" "); //splits at spaces
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : words) {
            arrayList.add(string);
        }
        System.out.println(arrayList.toString());
    }

}
