package LinkedList;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Vi du sudung phuong thuc addALL()");
        System.out.println("------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("ListA: ");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc removeAll()");
        System.out.println("---------------------");

        // khoi tao listB
        LinkedList <String> listB= new LinkedList<String>();
        listA.retainAll(listB);
        System.out.println("ListA: ");
        showList(listA);

        System.out.println("Vi du su dung removeALL()");
        System.out.println("---------------------");
        list.removeAll(listB);
        System.out.println("list: ");
        showList(list);
    }
    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.println("\t"+ obj+ ", ");
        }
        System.out.println();
    }
}
