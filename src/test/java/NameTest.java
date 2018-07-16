import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTest {

    private Name name;

    @Before
    public void setUp(){
        name = new Name("John", 24);
    }

    @Test
    public void hasName(){
        assertEquals("John", name.getName());
    }

    @Test
    public void setName(){
        name.setName("Jonathon");
        assertEquals("Jonathon", name.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(24, name.getAge());
    }



}
