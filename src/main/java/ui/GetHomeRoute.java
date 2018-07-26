package ui;

import spark.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GetHomeRoute implements Route {

    static final String TITLE_ART = "title";
    static final String TITLE = "Welcome!";

    private final TemplateEngine templateEngine;

    public GetHomeRoute(TemplateEngine templateEngine){
        Objects.requireNonNull(templateEngine);
        this.templateEngine = templateEngine;
    }

    @Override
    public Object handle(Request request, Response response){
        Map<String,Object> vm = new HashMap<>();
        vm.put(TITLE_ART,TITLE);
        return templateEngine.render(new ModelAndView(vm, "home.ftl"));
    }
}
