package dataBase;

import entity.Phone;

import java.util.HashMap;


public class DataBasePhones {

    private static HashMap<Integer, Phone> phones = new HashMap<>();


    public static HashMap<Integer, Phone> getPhones() {

        return phones;
    }

    public static void setPhones(Phone phone) {
        phones.put(phone.getId(), phone);

    }
}
