import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mName;
  private static List<Team> instances = new ArrayList<Team>();
  private int mId;

  public Team(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getTeamName() {
    return mName;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Team find(int id) {
    return instances.get(id -1);
  }

  public static List<Team> all() {
  return instances;
}
}
