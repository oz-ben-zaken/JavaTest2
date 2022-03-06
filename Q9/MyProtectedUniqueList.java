package Q9;

import java.util.*;

public class MyProtectedUniqueList<T extends Comparable > implements Iterable<T> {
    private List<T> words;
    private String key;

    public MyProtectedUniqueList(String key) {
        words = new ArrayList();
        this.key = key;
    }

    public void Add(T value) throws Exception {
        if (value == null || value.equals(""))
            throw new Exception("the value has not initialized");
        if (!words.contains(value))
            words.add(value);
    }

    public void Remove(T value) throws Exception {
        if (value == null || value.equals(""))
            throw new Exception("the value has not initialized");
        words.remove(value);
    }

    public void RemoveAt(int index) throws Exception {
        if (index < 0 || index > words.size() - 1)
            throw new Exception("index is out of bound");
        words.remove(index);
    }

    public void Clear(String key) throws Exception {
        if (this.key.equals(key))
            words.clear();
        else throw new Exception("key is not matching");
    }

    public void Sort(String key) throws Exception {
        if (this.key.equals(key))
            Collections.sort(words);
        else throw new Exception("key is not matching");
    }

    @Override
    public String toString() {
        return "MyProtectedUniqueList{" +
                "words=" + words +
                ", key='" + key + '\'' +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return (i < words.size() && words.get(i) != null);
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return words.get(i++);
                }
                return null;
            }
        };
    }
}
