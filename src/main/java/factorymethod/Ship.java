package factorymethod;

import abstract_factory.Anchor;
import abstract_factory.Wheel;
import abstract_factory.WhiteAnchor;
import abstract_factory.WhiteWheel;

import java.util.Objects;

public class Ship {

    private String name;

    private String color;

    private String log;

    private Anchor anchor;

    private Wheel wheel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", log='" + log + '\'' +
                '}';
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
