package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger(" Basic", "Sausage", 3.56, "White");

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHambgurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is " +healthyBurger.itemizeHambgurger());

        DeluxeBurger db=new DeluxeBurger();
        System.out.println(db.itemizeHambgurger());
    }
}
