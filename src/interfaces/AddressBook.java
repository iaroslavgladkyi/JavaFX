package interfaces;

import objects.Person;

/**
 * Created by gaffs on 23/05/17.
 */
public interface AddressBook {

    void add(Person person);

    void update(Person person);

    void delete(Person person);

}
