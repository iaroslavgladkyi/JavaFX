package start;

import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../fxml/main.fxml"));
        Parent fxmlMain = fxmlLoader.load();
        MainController mainController = fxmlLoader.getController();
        mainController.setMainStage(primaryStage);

        primaryStage.setTitle("Адресная книга");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(fxmlMain, 300, 275));
        primaryStage.show();

        testData();
    }


    public void testData() {
      //  CollectionAddressBook addressBook = new CollectionAddressBook();
      //  addressBook.fillTestData();
      //  addressBook.print();
        /*Person person1 = new Person();
        person1.setFio("person1");
        person1.setPhone("123456789");

        Person person2 = new Person();
        person2.setFio("person2");
        person2.setPhone("456789");

        person1.setPhone("111111");
        //addressBook.update(person1);

        addressBook.delete(person1);*/
    }


    public static void main(String[] args) {
        launch(args);
        //Main main = new Main();
        //main.testData();
    }

}
