
import dataBase.DataBasePhones;
import dataBase.DataBaseUsers;

import entity.Phone;
import entity.User;


public class Main {

    public static void putPhonesTest() {
        //test
        Phone phone1 = new Phone(Phone.generateID(),"Simiens",180);
        Phone phone2 = new Phone(Phone.generateID(),"Nokia 3500", 150);
        Phone phone3 = new Phone(Phone.generateID(),"Simeins", 200);
        Phone phone4 = new Phone(Phone.generateID(),"Motorolla", 180);
        Phone phone5 = new Phone(Phone.generateID(),"Nokia 3300", 80);

        DataBasePhones.setPhones(phone1);
        DataBasePhones.setPhones(phone2);
        DataBasePhones.setPhones(phone3);
        DataBasePhones.setPhones(phone4);
        DataBasePhones.setPhones(phone5);

    }



    public static void main(String[] args) {
        putPhonesTest();




      User user = new User("Kolia","222");
      user.entrance();

        System.out.println(DataBasePhones.getPhones());
        System.out.println(DataBaseUsers.getUsers());
    }
}
