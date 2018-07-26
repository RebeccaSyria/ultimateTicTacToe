package ui;
import spark.TemplateEngine;

import java.util.Objects;

import static spark.Spark.*;

public class WebServer {

    private final TemplateEngine templateEngine;

    public static final String HOME_URL = "/";

    public WebServer(final TemplateEngine templateEngine){
        Objects.requireNonNull(templateEngine, "templateEngine must not be null");
        this.templateEngine = templateEngine;
    }

    public void initialize(){
        get(HOME_URL,new GetHomeRoute(templateEngine));
    }

}
