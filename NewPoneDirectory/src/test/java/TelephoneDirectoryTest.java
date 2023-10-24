import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.*;

import static java.util.Collections.EMPTY_SET;

public class TelephoneDirectoryTest {
    /*всего 10 тестов
     * 2 для addRecord - запись успешно добавена / запись уже есть
     * 2 для getNumbers - номер выдан / лиц с таким ФИО нет или у лиц нет номера
     * 2 для getFullname - фамилия получена / по такому номеру нет фио
     * 2 для removePhone - номер успешно удален / ошибка
     * 2 для removePerson - лицо успешно удалено
     */
    private TelephoneDirectory directory;
        String personFullName = "John";
        String phone = "123-456-7890";
    @BeforeEach
    public void setUp() {
        directory = new TelephoneDirectory();
    }

    @Test
    public void testAddRecord() {
        directory.addRecord(personFullName, phone);
        Set<String> numbers = directory.getNumbers(personFullName);
        Assertions.assertEquals(true, numbers.contains(phone));
    }

    @Test
    public void testRemoveOwner() {
        directory.addRecord("John", "123-456-7890");
        directory.removePhone("John", "123-456-7890");
        Set<String> numbers = directory.getNumbers("John");
        Assertions.assertEquals(EMPTY_SET, numbers);
    }

    @Test
    public void testGetNumbers() {
        directory.addRecord("John", "123-456-7890");
        directory.addRecord("John", "123-456-7899");
        Assertions.assertEquals(Set.of("123-456-7890", "123-456-7899"), directory.getNumbers("John"));
    }
    @Test
    public void testGetFullName() {
        directory.addRecord("John", "123-456-7890");

        Assertions.assertEquals(Optional.of("John"), directory.getFullName("123-456-7890"));
    }
    @Test
    public void testRemovePhone() {
        directory.addRecord("John", "123-456-7890");
        directory.removePhone("John","123-456-7890");
        Set<String> numbers = directory.getNumbers("John");
        Assertions.assertEquals(EMPTY_SET, numbers);
    }
}

