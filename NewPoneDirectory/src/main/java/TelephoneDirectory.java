
import java.util.*;

import static java.util.Collections.EMPTY_SET;

public class TelephoneDirectory {
    static Map<String, Set<String>> telephoneDirectory = new HashMap<>();


    public void addRecord(String owner, String phoneNumber) {
        if (owner==null || phoneNumber==null){
            throw new IllegalStateException("Нельзя поместить null");
        }
      telephoneDirectory.merge(owner, new HashSet<>(Arrays.asList(phoneNumber)), (oldValue, newValue) -> {
                  oldValue.addAll(newValue);
                  return oldValue;
              });
    }

    public static Optional<String> getFullName(String personPhone){
        for (Map.Entry<String, Set<String>> entry : telephoneDirectory.entrySet()) {
            Set<String> values = entry.getValue();
            if (values.contains(personPhone)) {
                return Optional.ofNullable(entry.getKey());
            }
        }
        return Optional.empty();
    }

    public Set<String> getNumbers(String owner) {
        return telephoneDirectory.containsKey(owner) ? telephoneDirectory.get(owner) : EMPTY_SET;
    }

    public static Map<String, Set<String>> getTelephoneDirectory(){
        return telephoneDirectory;
    }

     public static void removeOwner(String personPhone){
         for (Map.Entry<String, Set<String>> entry : telephoneDirectory.entrySet()) {
             Set<String> values = entry.getValue();
             if (values.contains(personPhone)) {
                 values.remove(personPhone);
                 if (values.isEmpty()) {
                     telephoneDirectory.remove(entry.getKey());
                     }
                 break;
             }
         }
     }
    public static void removePhone(String personFullName, String personPhone) {
        telephoneDirectory.get(personFullName).remove(personPhone);

    }
}
