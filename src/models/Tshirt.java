package models;

import java.util.Objects;
import java.util.Random;
import models.enums.Color;
import models.enums.Fabric;
import models.enums.Size;

public class Tshirt {

    private String name;
    private Color color;
    private Size size;
    private Fabric fabric;

    public Tshirt() {
        this.color = randomColor();
        this.size = randomSize();
        this.fabric = randomFabric();

    }

    public Tshirt(String name, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    private Color randomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }

    private Size randomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }

    private Fabric randomFabric() {
        Random random = new Random();
        return Fabric.values()[random.nextInt(Fabric.values().length)];
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + Objects.hashCode(this.size);
        hash = 97 * hash + Objects.hashCode(this.fabric);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tshirt other = (Tshirt) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.fabric != other.fabric) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tshirt{" + "name=" + name + ", color=" + color + ", size=" + size + ", fabric=" + fabric + '}';
    }

}
