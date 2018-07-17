import java.util.ArrayList;
import java.util.Collections;

public class Name {

    private ArrayList<String> names;

    public Name() {
        this.names = new ArrayList<String>();
        names.add("Jim");
        names.add("John");
        names.add("Jacob");
        names.add("Jemima");
        names.add("Jemma");

    }

    public String getRandomName() {
        Collections.shuffle(names);
        return names.get(0);
    }

    public ArrayList<String> getRandom2Names() {
        ArrayList<String> twoNames = new ArrayList<>();
        Collections.shuffle(names);
        twoNames.add(names.get(0));
        twoNames.add(names.get(1));
        return twoNames;
    }
}