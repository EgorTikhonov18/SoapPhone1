import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddRecordTest {
    AddRecord addRecord;
    @BeforeEach
    public void setUp(){
        addRecord = new AddRecord();
    }
    @Test
    public void testAddRecod(){
        Assertions.assertEquals("", addRecord);
    }
}
