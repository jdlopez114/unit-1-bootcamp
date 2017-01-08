import java.util.ArrayList;
import java.util.Arrays;

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
