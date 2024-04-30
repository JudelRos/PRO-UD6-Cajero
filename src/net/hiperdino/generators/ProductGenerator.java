package net.hiperdino.generators;

import java.util.Random;

public class ProductGenerator {
    private static final String[] products = {
        "Shirt",
        "Pencilcase",
        "Gel",
        "Teddy bear",
        "Pizza",
        "Lasagna",
        "Brush",
        "Papel Towel",
        "Salmon",
        "Macs",
        "Watter bottle",
        "Apples"
    };
    
    public static String obtainRandomProduct() {
        Random random = new Random();
        int randomIndex = random.nextInt(products.length);
        return products[randomIndex];
    }
}
