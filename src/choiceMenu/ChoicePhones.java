package choiceMenu;

import dataBase.DataBaseImpl;
import dataBase.DataBasePhones;
import dataBase.DataBaseable;
import entity.Phone;
import inputOutput.IOUserDataImpl;
import inputOutput.IOData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ChoicePhones {
    private static IOData iodata = new IOUserDataImpl();

    public static List<Integer> buyPhones(HashMap<Integer, Phone> map) {

        List<Integer> namesOfPhones = new ArrayList<>();

        boolean flag = true;
        String model;
        try (Scanner scanner = new Scanner(System.in)) {
            while (flag == true) {

                Integer nameOfPhone = Integer.parseInt(scanner.nextLine());

                DataBaseable dataBaseable = new DataBaseImpl();
                if (nameOfPhone.equals(0)) {

                    dataBaseable.deletePhones(Integer.valueOf(nameOfPhone), map);
                    flag = false;
                    iodata.entrance();

                } else if (!map.containsKey(nameOfPhone)) {
                    System.out.println("We don't have this model.Please try again \n For Exit in Main menu - press 0");
                    System.out.println(DataBasePhones.getPhones());
                } else {
                    System.out.println("You have bought " + map.get(nameOfPhone).getModel() + "\n For exit - press 0");

                    namesOfPhones.add(nameOfPhone);
                    dataBaseable.deletePhones(Integer.valueOf(nameOfPhone), map);
                }

            }
        }

        return namesOfPhones;
    }
}
