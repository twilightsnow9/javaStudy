package Algorithm.Test;

public class Famale {
    private String name;
    private Integer age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Famale() {
    }

    public Famale(String name, Integer age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Famale{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
