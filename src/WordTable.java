import java.util.ArrayList;
public class WordTable {

    private ArrayList<String>[] table;

    public WordTable(int size) {
        table = new ArrayList<String>[size];

        for (ArrayList<String> a : table)
            a = new ArrayList<String>();
    }

    public int hash(String s) {
        return s.length() % table.length;
    }

    public int isInTable(String s) {
        int index = hash(s);
        int i = 0;
        while (i < table[i].size()) {
            if (table[i].get(i).equals(s))
                return index;
            i++;
        }
        return -1;
    }

    public void add(String s) {
        int i = isInTable(s);
        if (i != -1)
            table[i].add(table[i].size() - 1, s);
    }

    public void fill(ArrayList<String> a) {
        for (String s : a)
            table.add(s);
    }

    public String toString() {
        String out = "";
        for (ArrayList<String> a : table) {
            out += a.toString();
            out += "\n";
        }
        return out;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("hola");
        words.add("hi");
        words.add("hello");
        words.add("howdy");
        words.add("yello");

        WordTable w = new WordTable(4);
        w.fill(words);

        System.out.println(w);
    }
}
