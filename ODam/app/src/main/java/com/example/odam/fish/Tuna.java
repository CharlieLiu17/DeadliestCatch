package com.example.odam.fish;

import com.example.odam.R;

public class Tuna extends Fish {
    public Tuna() {
        super();
        fishType = "Tuna";
        imageID = R.drawable.tuna;
        health = 100;
        baseSpeed = 8;
        speed = baseSpeed;
    }

}
