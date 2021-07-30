package code._4_student_effort._7_challengeSeven;

public class HashTable<K, V> implements MyHashTable<K, V> {

    private Object[] values = new Object[Integer.MAX_VALUE / 100];
    private int numberOfEntries = 0;

    @Override
    public V get(K key) {
        return (V) this.values[key.hashCode()];
    }

    @Override
    public void put(K key, V value) {
        this.values[key.hashCode()] = value;
        numberOfEntries++;
    }

    @Override
    public void remove(K key) {
        this.values[key.hashCode()] = null;
    }

    @Override
    public boolean containsKey(K key) {
        return this.values[key.hashCode()] != null;
    }

    @Override
    public int size() {
        return numberOfEntries;
    }
}
