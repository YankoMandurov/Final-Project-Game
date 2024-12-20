import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

    @Test
    public void testYAML() {
        LoadYAML yl = new LoadYAML();
        Room room1 = yl.rooms.get("Starting Room");
        assertEquals(room1.name, "Starting Room");
    }

    @Test
    public void testLocked(){
        LoadYAML y1 = new LoadYAML();
        Chest item1 = (Chest)y1.items.get("treasure chest");
        
        assertEquals(item1.locked, true);
    }

    @Test
    public void checkStuck(){
        LoadYAML y1 = new LoadYAML();
        for(Room r:y1.rooms.values()){
         assertEquals((r.doors != null), true);   
        }
    }

}
