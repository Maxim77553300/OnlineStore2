package dataBase;


import java.util.HashMap;


public class DataBaseUsers {

    private static HashMap<String, String> users = new HashMap<>();


    public static HashMap<String, String> getUsers() {

        return users;
    }

    public static void setUsers(String name, String password) {
        DataBaseUserable dataBaseUserable = new DataBaseUserImpl();
        dataBaseUserable.setUsers(name, password, users);
    }

}








