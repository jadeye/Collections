package fruit;

import java.util.*;


/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/29/11
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class basket {

    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        str.add("Hello ");
        str.add("World.");
        String MyString = "";
        /*
        String MyString = str.get(0);

        System.out.println(MyString);
        System.out.println(str.get(0)+str.get(1));
        */
        for (Iterator<String> iter = str.iterator(); iter.hasNext(); ) {
            //String s= iter.next();
            MyString = MyString.concat(iter.next());
        }
        System.out.println(MyString);


        List<Integer> ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(1);

        int sum = 0;
        for (int i : ints) {
            sum += i;
        }

        /*List<Apple> apples = new ArrayList<Apple>();
        List<? extends Fruit> fruits = apples;

        Apple[] apples = new Apple[1];
        Fruit[] fruits = apples;
        fruits[0] = new Strawberry();

        List<Apple> apples = new ArrayList<Apple>();
        List<? extends Fruit> fruits = apples;
        fruits.add(new Strawberry());
        */
        Collection<Fruit> fruits = new HashSet<Fruit>();
        fruits.add(new Strawberry());
        fruits.add(new Apple());


        for (Iterator<Fruit> itera1 = fruits.iterator(); itera1.hasNext(); ) {
            //String s= iter.next();
            Fruit MyFruit = itera1.next();
            MyFruit.name = ClassUtils.getClassName(MyFruit.getClass());
            if (MyFruit.name.equals("Apple"))
                MyFruit.setColor(1);
            else
                MyFruit.setColor(0);
//            if ()
            System.out.println(MyFruit.name + " is " + MyFruit.color);
            /*else
                System.out.println("and a "+MyFruit.color+" "+MyFruit.name);*/
//            System.out.println(MyFruit);
//            System.out.println(MyFruit.color);
        }


    }

}
