package Section_9_Interfaces_Inner_Abstract_Classes.Interface;

import java.util.LinkedList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> parameters = new LinkedList<String>();
        parameters.add(name);
        parameters.add(weapon);
        parameters.add(String.valueOf(hitPoints));
        parameters.add(String.valueOf(strength));
        return parameters;
    }

    @Override
    public List<String> read(List<String> parameters) {

        if (parameters.isEmpty() && parameters.size() > 0) {

        }

        return null;
    }

    @Override
    public String toString() {
        return "Player{name=" + name + ", hitpoints=" + hitPoints +
                ", strength=" + strength + ", weapon=" + weapon + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
