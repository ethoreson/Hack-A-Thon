import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {

      Map<String, Object> model = new HashMap<String, Object>();
      model.put("teams", request.session().attribute("teams"));
      model.put("templates", "templates/index.vtl");
      return new ModelAndView(new HashMap(), "templates/index.vtl");
    }, new VelocityTemplateEngine());

    post("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Team> teams = request.session().attribute("teams");
      if (teams == null) {
        teams = new ArrayList<Team>();
        request.session().attribute("teams", teams);
      }

      String teamName = request.queryParams("teamName");
      Team newTeam = new Team(teamName);
      teams.add(newTeam);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
