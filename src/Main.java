import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        HashSet demoHashSet = createHashSet(10);
        leggiHashSet(demoHashSet);
    }
    public static HashSet createHashSet(int size){
        HashSet<Integer> set = new HashSet<>();
        int aggiungere = 1;
        for (int i = 0; i < size; i++){
            set.add(aggiungere);
            aggiungere++;
        } return set;
    }
    public static void leggiHashSet(HashSet<Integer> set) {
        for (int i : set) {
            System.out.println(i);
        }
        System.out.println("L'HashSet contine : " + set.size() + " elementi");
    }
}