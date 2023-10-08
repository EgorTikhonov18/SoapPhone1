import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TelephoneDirectoryTest {
    /*всего 10 тестов
     * 2 для addRecord - запись успешно добавена / запись уже есть
     * 2 для getNumbers - номер выдан / лиц с таким ФИО нет или у лиц нет номера
     * 2 для getFullname - фамилия получена / по такому номеру нет фио
     * 2 для removePhone - номер успешно удален / ошибка
     * 2 для removePerson - лицо успешно удалено
     */
    private TelephoneDirectory directory;

    @BeforeEach
    public void setUp() {
        directory = new TelephoneDirectory();
    }
    @Test
    public void testAddContact() {
        directory.addRecord("John", "123-456-7890");
        Set<String> numbers = directory.getNumbers("John");
        Assertions.assertEquals(1, numbers.size());
        Assertions.assertEquals("123-456-7890", numbers.contains("John"));
    }

    @Test
    public void testRemoveContact() {
        directory.addRecord("John", "123-456-7890");
        directory.removePhone("John","123-456-7890" );
        Set<String> numbers = directory.getNumbers("John");
        Assertions.assertNull(numbers);
    }
    @Test
    public void testGetNumbers() {
        directory.addRecord("John", "123-456-7890");
        Set<String> numbers = directory.getNumbers("John");
        Assertions.assertEquals(1, numbers.size());
        Assertions.assertEquals("123-456-7890", numbers.contains("John") );
    }
    /*@Test
    public void testGetAllContactNames() {
        directory.addRecord("John", "123-456-7890");
        List<String> names = directory.getFullName("John");
        Assertions.assertEquals(1, names.size());
        Assertions.assertEquals("John", names.get(0));
    }*/
}

