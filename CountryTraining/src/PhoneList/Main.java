package PhoneList;


public class Main {
    public static void main(String[] args) {
        TelephoneDirectory td = new TelephoneDirectory();
        td.addRecord( "Иванов Иван", "+1234567890");
        td.addRecord( "Иванов Иван", "+1234567890");
        td.addRecord( "Петров Петр", "+9876543210");
        td.addRecord( "Сидоров Сидор", "+1111111111");
        td.addRecord( "Иванов Иван", "+9999999999");

        System.out.println(td.getNumbers("Тихонов Егор"));
        System.out.println(td.getNumbers( "Иванов Иван"));
      //  td.removePhone("Сидоров Сидор", "+1111111111");
        System.out.println(td.getTelephoneDirectory());
        //td.removePerson("Петров Петр", "+9876543210");
        System.out.println(td.getTelephoneDirectory());
    }
}
