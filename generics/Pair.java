// Generic Type class with 2 value
public class Pair<K, V> {

    private K key;

    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Age",27);
        System.out.println(pair.getKey()+" : "+pair.getValue());
    }
}

