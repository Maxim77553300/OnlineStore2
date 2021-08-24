package choiceMenu;

import dataBase.DataBaseImpl;
import dataBase.DataBasePhones;
import dataBase.DataBaseUsers;
import dataBase.DataBaseable;
import entity.Phone;
import inputOutput.IOUserDataImpl;

import java.util.Scanner;

public class AdminMenu implements ChoiceMenu {
    @Override
    public void choice() {

        boolean flag = true;

        try (Scanner scanner = new Scanner(System.in)) {


            IOUserDataImpl ioUserData = new IOUserDataImpl();

            while (flag == true && scanner.hasNext()) {
                Integer number = Integer.valueOf(scanner.nextLine());
                DataBaseable dataBase = new DataBaseImpl();

                switch (number) {
                    case 1:
                        System.out.println("Admin menu");
                        System.out.println("Make your choice!\n 1 - Admin menu\n 2 - Delete/show goods\n 3 - Enter goods\n 4 - Exit\n 5 - Show list of users");
                        break;
                    case 2:
                        System.out.println("Delete goods,press 4 for exit,Enter id please");
                        System.out.println(DataBasePhones.getPhones());
                        number = Integer.valueOf(scanner.nextLine());
                        if (number.equals(4)) {
                            ioUserData.entrance();
                        } else if (!dataBase.getPhones().containsKey(number)) {
                            System.out.println("We dont have this id, please enter again");
                        } else {
                            dataBase.deletePhones(Integer.valueOf(number), dataBase.getPhones());

                        }
                        break;
                    case 3:
                        System.out.println("Enter new Goods");
                        System.out.println("Enter name of model Phone :");
                        String name = scanner.nextLine();
                        System.out.println("Enter price of the phone :");
                        Integer price = scanner.nextInt();
                        dataBase.setPhones(new Phone(Phone.generateID(), name, price));
                        System.out.println("This model we added to store successfully");
                        break;
                    case 4:
                        System.out.println("Exit site");
                        flag = false;
                        new AdminMenu().exit();
                        break;
                    case 5:
                        System.out.println("Show list of users");
                        System.out.println(DataBaseUsers.getUsers());
                    default:

                        System.out.println("Error adminMenu");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exit() {
        System.exit(1);
    }
}
