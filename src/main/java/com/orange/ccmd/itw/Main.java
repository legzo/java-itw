package com.orange.ccmd.itw;

import com.orange.ccmd.itw.model.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.debug("Bienvenue sur la boutique Orange !");

        Phone iphone7 = new Phone("iPhone 7", "Apple", 749.9f);
        Phone galaxyS8 = new Phone("Galaxy S8", "Samsung", 829.9f);

        LOGGER.debug("Prix du téléphone : {} {} > {}€", iphone7.getBrand(), iphone7.getModel(), iphone7.getPrice());
        LOGGER.debug("Prix du téléphone : {} {} > {}€", galaxyS8.getBrand(), galaxyS8.getModel(), galaxyS8.getPrice());
    }

}
