package inters;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/29/11
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class generation {

    static woman Jenny = new woman(27,"Jenny");
     /*{
        @Override
        public String getClsName() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        protected void setClsName() {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    };
          */
    static man James=new man(29,"James");


    public static void main(String[] args) {

        System.out.println(Jenny.getSex(Jenny.getClsName()));
        System.out.println(James.getSex(James.getClsName()));

    }
}
