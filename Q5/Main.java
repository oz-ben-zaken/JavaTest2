package Q5;

public class Main {
    public static void main(String[] args) {
        MyProtectedUniqueList lst = new MyProtectedUniqueList("peepee");

        System.out.println(lst);

        try {
            lst.Add("word");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            lst.Add("word");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            lst.Add("wordsss");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            lst.Add("wordewsss");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(var word: lst)
            System.out.println(word);

        try {
            lst.Add("abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lst);

        try {
            lst.Sort("peepee");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lst);
    }

}
