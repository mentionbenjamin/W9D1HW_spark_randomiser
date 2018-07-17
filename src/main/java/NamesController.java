import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class NamesController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");


        get("/one", (req, res) -> {
            Name name = new Name();
            String foundName = name.getRandomName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", foundName);
            return new ModelAndView(model, "one.vtl");
        }, velocityTemplateEngine);


        get("/two", (req, res) -> {
            Name name = new Name();
            ArrayList<String> twoFoundNames = new ArrayList<>();
            twoFoundNames = name.getRandom2Names();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", twoFoundNames);
            return new ModelAndView(model, "two.vtl");
        }, velocityTemplateEngine);


    }
}