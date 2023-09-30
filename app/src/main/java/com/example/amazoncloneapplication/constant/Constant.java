package com.example.amazoncloneapplication.constant;

import com.example.amazoncloneapplication.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Constant {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<>();
    static {
        for (int i = 1; i < 11; i++) {
            QUANTITY_LIST.add(i);
        }
    }

    public static final Product PRODUCT1 = new Product(1,"Redmi Note11T", BigDecimal.valueOf(16999),
            "Redmi Note 11T 5G (Stardust White, 8GB RAM, 128GB ROM) |\n"+
            "+Dimensity 810 5G | 33W Pro Fast Charging | Charger Included",
            "redmi_note11t");

    public static final Product PRODUCT2 = new Product(2,"OnePlus Nord CE",BigDecimal.valueOf(27999),
            "OnePlus Nord CE 5G 256 GB, 12 GB RAM, Blue Void, Mobile Phone",
            "one_plus_never_settle");

    public static final Product PRODUCT3 = new Product(3,"Samsung Galaxy F42",BigDecimal.valueOf(20999),
            "Is Samsung F42 good for camera?\n" +
                    "The Galaxy F42 5G that comes with the advanced 5G processor by Mediatek,\n"+
                    "the Dimensity 700, offers a breathtaking camera for sure. The specs include \n" +
                    "a 64MP primary camera along with a 5-megapixel ultra-wide shooter and a 2-megapixel depth sensor.",
            "samsung_galaxy42");

    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();
    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
    }

    public static final String CURRENCY = "₹";
}


