package com.company;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PotionOfBloodlust extends Potion {
    public PotionOfBloodlust() {
        super();
        this.name = "Potion of Bloodlust";
        this.desc = "A thick, violent shade of red, it seems to anger you just looking at it.";
        this.bloodlust = 1;
        try {
            this.picture = ImageIO.read(new File("src/com/company/resources/Potions/Potion Of Bloodlust.png"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

