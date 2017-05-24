package interfaces.impls;

import interfaces.AddressBook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import objects.Person;

import java.util.ArrayList;

/**
 * Created by gaffs on 23/05/17.
 */
public class CollectionAddressBook implements AddressBook {

    private ObservableList<Person> personList = FXCollections.observableArrayList();


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

    public ObservableList<Person> getPersonList(){
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
        personList.add(new Person("Ivan Pechkin", "123"));
        personList.add(new Person("Roman Gyral", "123"));
        personList.add(new Person("Anton Sedov", "123"));
        personList.add(new Person("Perto Vaskin", "123"));
        personList.add(new Person("Vasya Gral", "123"));
    }
}
