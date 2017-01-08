import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DataStructures {

    public static void main(String args[]) {
        sortingSentences("Eddie knows what he's doing");
    }

    List<Cats> cats = new ArrayList<>;

    public void printCats(List<Cats> cats) {
        for (int i = 0; i < cats.size; i++) {
            System.out.println(i);
        }
    }

    // 6.

    public static void clumps(){

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
