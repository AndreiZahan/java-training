package code._4_student_effort._9_challengeNine;

import java.util.Arrays;

public class Set<T> implements MySet<T> {
    private Object[] set = new Object[0];

    @Override
    public void add(T e) {
        if (!contains(e)) {
            this.set = Arrays.copyOf(set, set.length + 1);
            this.set[this.set.length -1] = e;
        }
    }

    @Override
    public void remove(T e) {
        Object[] newSet = new Object[0];
        for (Object currentObject : this.set) {
            if (!currentObject.equals(e)) {
                newSet = Arrays.copyOf(newSet, newSet.length + 1);
                newSet[newSet.length - 1] = currentObject;
            }
        }
        this.set = newSet;
    }

    @Override
    public T get(int index) {
        return (T) this.set[index];
    }

    @Override
    public void set(int index, T e) {
        if (!contains(e)) {
            this.set[index] = e;
        }
    }

    @Override
    public int size() {
        return this.set.length;
    }

    @Override
    public boolean contains(T e) {
        boolean result = false;
        for (Object o : this.set) {
            if (o.equals(e)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
