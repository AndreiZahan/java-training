package code._4_student_effort._7_challengeSeven;

public class Main {
    public static void main(String[] args) {
        MyHashTable<String, String> myHashTable = new HashTable<>();
        myHashTable.put("key1", "value1");
        myHashTable.put("key2", "value2");
        myHashTable.put("key3", "value3");
        myHashTable.put("key4", "value4");
        myHashTable.put("key5", "value5");
        myHashTable.put("key6", "value6");
        System.out.println(myHashTable.size());
    }
}
