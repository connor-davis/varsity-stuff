package gettersandsetters.entity;

public class Human extends Entity {
    public Human() {}

    public void greet() {
        System.out.println("Hello there, " + name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
