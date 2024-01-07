import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        createHashSet(10);
    }
    public static HashSet createHashSet(int size){
        HashSet<Integer> set = new HashSet<>();
        int aggiungere = 1;
        for (int i = 0; i < size; i++){
            set.add(aggiungere);
            aggiungere++;
        }
        System.out.println(set.size());
        for (int show : set){
            System.out.println(show);
        } return set;
    }
}