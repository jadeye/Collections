package inters;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/30/11
 * Time: 10:42 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class superwoman extends human {
    String clsName ="";

    public superwoman(int age, String name) {
        super(age, name);
    }

    public superwoman() {
        super();
    }

    public abstract String getClsName();

    protected abstract void setClsName();
}
