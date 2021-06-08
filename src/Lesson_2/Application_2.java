package Lesson_2;

import interfaces.CanMakePayment;
import models.Currency;
import models.Parent;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class Application_2 {

    public static void main(String[] args) {

        User admin = new User(
                "Admin",
                "password",
                "System Admin")
                .setCurrency(new ArrayList<Currency>(){
                    {
                        add(new Currency("UAH"));
                        add(new Currency("USD"));
                        add(new Currency("EUR"));
                    }
                });

        User user = new User(
                "User",
                "password",
                "System user").setCurrency(new ArrayList<Currency>(){
            {
                add(new Currency("PZL"));
                add(new Currency("TEN"));
                add(new Currency("GRP"));
            }
        });

//        Printer.printUserData(admin);
//        System.out.println("==============================");
//        Printer.printUserData(user);

//        Order order = new Order(124, "asdasrqrw435", new Date());

//        List<Parent> users = new ArrayList<>();
//        users.add(admin);
//        users.add(user);
//        users.add(new Currency("UAH"));


//        users.forEach(Printer::printData);
//        System.out.println("Admin have "
//                + admin.getCurrency().size()
//                + " count of currency");
//        admin.getCurrency().forEach(System.out::println);
//        System.out.println(admin.getCurrency().getName());

        List<CanMakePayment> paymentUsers = new ArrayList<>();
        paymentUsers.add(admin);
        paymentUsers.add(user);

        paymentUsers.forEach(entity -> {

            entity.makeTransaction(new Currency("USD"), 20);
            entity.showCurrency();
        });

    }

}
