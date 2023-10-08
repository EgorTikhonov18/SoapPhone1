package PhoneList;

import java.util.*;

import static java.util.Collections.EMPTY_SET;

public class TelephoneDirectory {
    static Map<String, Set<String>> telephoneDirectory = new HashMap<>();


    public void addRecord(String owner, String phoneNumber) {
        Set<String> phoneNumbers = new HashSet();
        phoneNumbers.add(phoneNumber);
        telephoneDirectory.put(owner, phoneNumbers);
        /*if (telephoneDirectory.containsKey(owner)) {
            telephoneDirectory.get(owner).add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new HashSet();
            phoneNumbers.add(phoneNumber);
            telephoneDirectory.put(owner, phoneNumbers);
        }*/
    }

   /* public static String getFullName(String personPhone){
        return telephoneDirectory.containsValue(personPhone) ? telephoneDirectory. //: Optional.of(null);
    }*/

    public Set<String> getNumbers(String owner) {
        return telephoneDirectory.containsKey(owner) ? telephoneDirectory.get(owner) : EMPTY_SET;
    }

    public static Map<String, Set<String>> getTelephoneDirectory(){
        return telephoneDirectory;
    }

   /* public static void removePerson(String personFullName, String personPhone){
        telephoneDirectory.re(personFullName, personPhone);
    }*/
    public static void removePhone(String personFullName, String personPhone) {
        telephoneDirectory.get(personFullName).remove(personPhone);

       /* Set<String> numbers = telephoneDirectory.get(personFullName);
        if (numbers.contains(personPhone)) {
            numbers.remove(personPhone);*/

        /*if (telephoneDirectory.containsKey(personFullName)) {
            Set<String> numbers = telephoneDirectory.get(personFullName);
            if (numbers.contains(personPhone)) {
                numbers.remove(personPhone);
            } else {
                System.out.println();
            }
        }*/
    }
}