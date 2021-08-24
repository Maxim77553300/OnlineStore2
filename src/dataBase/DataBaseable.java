package dataBase;

import entity.Phone;

import java.util.HashMap;

public interface DataBaseable {

    boolean deletePhones(Integer id, HashMap<Integer, Phone> phones);

    HashMap<Integer, Phone> getPhones();

    void setPhones(Phone phone);


}
