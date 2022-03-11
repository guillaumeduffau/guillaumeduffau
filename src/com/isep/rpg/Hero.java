package com.isep.rpg;
import java.util.*;

public abstract class Hero {
    private int lifePoints;
    private int armor;
    private int weaponDamage;
    private List<Potion> potions;
    private List<food> lembas;
    abstract void attack();
    abstract void defend();
    public static void useConsumable(Consumable consumable){

    }

}
