package fruit;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/29/11
 * Time: 6:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fruit {

    float weight = 0;
    String color = "";
    String[] colors = {"red", "green", "orange", "yellow", "purple"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name = "";

    public Fruit(float weight, int ind) {
        this.setWeight(weight);
        this.setColor(ind);
        //this.name = n;
    }

    public Fruit() {
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float w) {
        this.weight = w;
    }

    public String getColor(int ind) {
        color = this.colors[ind];
        return color;
    }

    public void setColor(int ind) {
        this.color = this.colors[ind];
    }

    public void ShowMe() {
        System.out.println("I am " + this.color + " in color and \n");
        System.out.println("Weight " + this.weight + " Kgs...");
    }
}
