package dataBase;

import choiceMenu.ChoicePhones;

import java.util.HashMap;
import java.util.List;

public class DataBaseUserImpl implements DataBaseUserable {
    @Override
    public void setUsers(String name, String password, HashMap<String, String> users) {
        List<Integer> listOfPhones = null;


        if (users.containsKey(name) && !users.containsValue(password)) {
            System.out.println("Error!! This nickname is already in our DataBase!! Please, enter another name!!");
        } else if (users.containsKey(name) && users.containsValue(password)) {
            System.out.println("Dear " + name + "! You are in your personal account,you can buy phone! please make choice!");
            System.out.println("We have these phones in our store :" + DataBasePhones.getPhones().toString());
            listOfPhones = ChoicePhones.buyPhones(DataBasePhones.getPhones());
        } else {
            users.put(name, password);
            System.out.println("You are in your account, your data was saved successfully");
            System.out.println("You can buy a phone. Please, make you choice : enter the id of model phone ");
            System.out.println(DataBasePhones.getPhones());
            listOfPhones = ChoicePhones.buyPhones(DataBasePhones.getPhones());


        }
    }


}
