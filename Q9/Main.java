package Q9;

public class Main {
    public static void main(String[] args) {
        MyProtectedUniqueList lst = new MyProtectedUniqueList<Integer>("peepee");

        System.out.println(lst);

        try {
            lst.Add(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            lst.Add(3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            lst.Add(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            lst.Add(3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(var word: lst)
            System.out.println(word);


        try {
            lst.Sort("peepee");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(lst);
    }

}
