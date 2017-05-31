package objects;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by gaffs on 23/05/17.
 */
public class Person {

    private SimpleStringProperty fio = new SimpleStringProperty("");
    private SimpleStringProperty phone = new SimpleStringProperty("");

    public Person() {

    }

    public Person(String fio, String phone) {
        this.fio = new SimpleStringProperty(fio);
        this.phone = new SimpleStringProperty(phone);
    }

    public String getFio() {
        return fio.get();
    }

    public String getPhone() {
        return phone.get();
    }

    public void setFio(String fio) {
        this.fio.set(fio);
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public SimpleStringProperty fioProperty() {
        return fio;
    }

    public SimpleStringProperty phoneProrepty() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
