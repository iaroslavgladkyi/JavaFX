package interfaces.impls;

import interfaces.AddressBook;
import objects.Person;

import java.util.ArrayList;

/**
 * Created by gaffs on 23/05/17.
 */
public class CollectionAddressBook implements AddressBook {

    private ArrayList<Person> personList = new ArrayList<Person>();


    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    //do not use for collection, but must be useful for DB or file
    public void update(Person person) {
        //due to our collection is storage, so we do not need to update person's info,
        //if our datas storage in the DB or in the file, we will update our person's info
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList(){
        return personList;
    }

    public void print() {
        int number = 0;
        System.out.println();
        for (Person person : personList){
            number++;
            System.out.println(number + ") fio = " + person.getFio() + "; phone = " + person.getPhone());
        }
    }

    public void fillTestData() {
        personList.add(new Person("Ivan", "123"));
        personList.add(new Person("Roman", "123"));
        personList.add(new Person("Anton", "123"));
        personList.add(new Person("Perto", "123"));
        personList.add(new Person("Vasya", "123"));
    }
}
