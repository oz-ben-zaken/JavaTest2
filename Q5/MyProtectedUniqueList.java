package Q5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MyProtectedUniqueList implements Iterable {
    private List<String> words;
    private String key;

    public MyProtectedUniqueList(String key) {
        words = new ArrayList();
        this.key = key;
    }

    public void Add(String word) throws Exception {
        if (word == null || word.equals(""))
            throw new Exception("the value has not initialized");
        if (!words.contains(word))
            words.add(word);
    }

    public void Remove(String word) throws Exception {
        if (word == null || word.equals(""))
            throw new Exception("the value has not initialized");
        words.remove(word);
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
            words.sort(Comparator.naturalOrder());
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
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return (i < words.size() && words.get(i) != null);
            }

            @Override
            public String next() {
                if (hasNext()) {
                    return words.get(i++);
                }
                return null;
            }
        };
    }
}
