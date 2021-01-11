import java.util.*;
public class TestRadix {

  public static void main(String[] args) {
    System.out.println(Radix.nth(123, 1));
    System.out.println(Radix.nth(-123, 1));
    System.out.println(Radix.nth(123, 2));
    System.out.println(Radix.nth(-123, 2));
    System.out.println();
    System.out.println(Radix.length(0));
    System.out.println(Radix.length(15));
    System.out.println(Radix.length(-10));
    System.out.println(Radix.length(5112));

    MyLinkedList o = new MyLinkedList();

    MyLinkedList n0 = new MyLinkedList();
    MyLinkedList n1 = new MyLinkedList();
    MyLinkedList n2 = new MyLinkedList();
    MyLinkedList n3 = new MyLinkedList();
    MyLinkedList n4 = new MyLinkedList();
    MyLinkedList n5 = new MyLinkedList();
    MyLinkedList n6 = new MyLinkedList();
    MyLinkedList n7 = new MyLinkedList();
    MyLinkedList n8 = new MyLinkedList();
    MyLinkedList n9 = new MyLinkedList();

    for (int i = 0; i < 10; i++) {
      o.add("" + i);
    }

    n0.add("10");
    n1.add("11");
    n2.add("12");
    n3.add("13");
    n4.add("14");
    n5.add("15");
    n6.add("16");
    n7.add("17");
    n8.add("18");
    n9.add("19");

    MyLinkedList[] b = {n0, n1, n2, n3, n4, n5, n6, n7, n8, n9};

    System.out.println(o.toString());
    Radix.merge(o,b);
    System.out.println(o.toString());
  }

}
