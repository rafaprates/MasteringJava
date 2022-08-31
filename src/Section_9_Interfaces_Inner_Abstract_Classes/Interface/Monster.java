package Section_9_Interfaces_Inner_Abstract_Classes.Interface;

import java.util.LinkedList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, String weapon, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> parameters = new LinkedList<String>();
        parameters.add(name);
        parameters.add(String.valueOf(hitPoints));
        parameters.add(String.valueOf(strength));
        return parameters;
    }

    @Override
    public List<String> read() {
        return null;
    }

    @Override
    public String toString() {
        return "Monster{name=" + name + ", hitpoints=" + hitPoints +
                ", strength=" + strength + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
