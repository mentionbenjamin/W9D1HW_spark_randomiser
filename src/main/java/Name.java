import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Name {



    private ArrayList<String> names;

    public Name() {
        this.names = new ArrayList<String>();
        names.add("Joe");
        names.add("Jack");
        names.add("Jill");
        names.add("Jo-Anne");
        names.add("Jabba");
    }

    public String getRandomName(){
        Collections.shuffle(names);
        return names.get(0);
    }


}
