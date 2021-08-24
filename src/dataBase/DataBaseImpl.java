package dataBase;

import entity.Phone;

import java.util.HashMap;

public class DataBaseImpl implements DataBaseable {

    @Override
    public boolean deletePhones(Integer id, HashMap<Integer, Phone> phones) {


        if (phones.containsKey(id)) {
            System.out.println("You have chosen phone model " + phones.containsKey(id));
            phones.remove(id);

            return true;
        }


        return false;
    }


    @Override
    public HashMap<Integer, Phone> getPhones() {
        return DataBasePhones.getPhones();

    }

    @Override
    public void setPhones(Phone phone) {
        DataBasePhones.setPhones(phone);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
