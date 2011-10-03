package LinkedList;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 10/4/11
 * Time: 12:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class TheLinkedListClass {
    static LinkedList<String> ll;

    public TheLinkedListClass() {
        ll = new LinkedList<String>();
    }


    public static void main(String[] args){
        new TheLinkedListClass();

        for(int i=0; i<12; i++){
            ll.add("James"+(int)i);
        }

        for (String aLl : ll) {

            if (aLl.contains("9")){
                String removed = aLl;
                ll.remove();
                System.out.print("Please Pay Attention, RoBoT NaMeD: ");
                System.out.println(removed+" has Been Removed for production!\n");
            } else {
            System.out.print("I M RoBoT NaMeD: ");
            System.out.println(aLl+"\n");
            }
        }

    }



}
