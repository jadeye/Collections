package fruit;

import static inters.ClassUtils.getClassName;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/29/11
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Apple extends Fruit {
//    String name = "";

    public String getClsName() {
        //name = getClassName(Strawberry.class);
        this.setClsName();
        return name;
    }

    protected void setClsName() {
        this.name = getClassName(getClass());
//                Strawberry.class);
    }


}
