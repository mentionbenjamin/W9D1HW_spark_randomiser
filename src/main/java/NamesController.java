import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class NamesController {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        ArrayList<Name> names = new ArrayList<>();
        Name name1 = new Name("John",    24);
        Name name2 = new Name("Joe",     75);
        Name name3 = new Name("Jill",    43);
        Name name4 = new Name("James",   25);
        Name name5 = new Name("Jack",    86);
        Name name6 = new Name("Jo-Anne", 45);

        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);
        names.add(name6);

        get("names", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            model.put("template", "names.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }

}
