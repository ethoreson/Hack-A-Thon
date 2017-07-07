import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member newMember = new Member("Jerry Garcia");
    assertEquals(true, newMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithMemberName_String() {
    Member newMember = new Member("Jerry Garcia");
    assertEquals("Jerry Garcia", newMember.getMemberName());
  }

}
