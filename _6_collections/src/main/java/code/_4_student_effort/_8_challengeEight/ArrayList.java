package code._4_student_effort._8_challengeEight;

import java.util.Arrays;

public class ArrayList<T> implements MyArrayList {
    private Object[] list = new Object[0];


    @Override
    public void add(Object e) {
        this.list = Arrays.copyOf(list, list.length + 1);
        this.list[this.list.length -1] = e;
    }

    @Override
    public void remove(Object e) {
        Object[] newList = new Object[0];
        for (Object currentObject : this.list) {
            if (!currentObject.equals(e)) {
                newList = Arrays.copyOf(newList, newList.length + 1);
                newList[newList.length - 1] = currentObject;
            }
        }
        this.list = newList;
    }

    @Override
    public Object get(int index) {
        return (T) this.list[index];
    }

    @Override
    public void set(int index, Object e) {
        this.list[index] = 0;
    }

    @Override
    public int size() {
        return this.list.length;
    }
}
