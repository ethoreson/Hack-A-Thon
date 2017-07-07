import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void Team_instantiatesCorrectly_true() {
    Team newTeam = new Team("H4ck3Rs");
    assertEquals(true, newTeam instanceof Team);
  }

  @Test
  public void Team_instantiatesWithTeamName_String() {
    Team newTeam = new Team("H4ck3Rs");
    assertEquals("H4ck3Rs", newTeam.getTeamName());
  }

}
