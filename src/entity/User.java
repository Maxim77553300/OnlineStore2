package entity;

import inputOutput.IOData;
import inputOutput.IOUserDataImpl;


public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void entrance() {
        IOData ioData = new IOUserDataImpl();
        ioData.entrance();
    }


}
