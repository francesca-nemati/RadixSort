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

    SortableLinkedList o = new SortableLinkedList();

    SortableLinkedList n0 = new SortableLinkedList();
    SortableLinkedList n1 = new SortableLinkedList();
    SortableLinkedList n2 = new SortableLinkedList();
    SortableLinkedList n3 = new SortableLinkedList();
    SortableLinkedList n4 = new SortableLinkedList();
    SortableLinkedList n5 = new SortableLinkedList();
    SortableLinkedList n6 = new SortableLinkedList();
    SortableLinkedList n7 = new SortableLinkedList();
    SortableLinkedList n8 = new SortableLinkedList();
    SortableLinkedList n9 = new SortableLinkedList();

    for (int i = 0; i < 10; i++) {
      o.add(i);
    }

    n0.add(10);
    n1.add(11);
    n2.add(12);
    n3.add(13);
    n4.add(14);
    n5.add(15);
    n6.add(16);
    n7.add(17);
    n8.add(18);
    n9.add(19);

    SortableLinkedList[] b = {n0, n1, n2, n3, n4, n5, n6, n7, n8, n9};

    System.out.println(o.toString());
    Radix.merge(o,b);
    System.out.println(o.toString());

    SortableLinkedList data = new SortableLinkedList();
    data.add(12);
    data.add(34);
    data.add(42);
    data.add(32);
    data.add(44);
    data.add(41);
    data.add(34);
    data.add(11);
    data.add(32);
    data.add(23);
    data.add(87);
    data.add(50);
    data.add(77);
    data.add(58);
    data.add(8);
    System.out.println(data.toString());
    Radix.radixSortSimple(data);
    System.out.println(data.toString());

    SortableLinkedList data2 = new SortableLinkedList();
    data2.add(10);
    data2.add(52);
    data2.add(5);
    data2.add(209);
    data2.add(19);
    data2.add(44);
    System.out.println(data2.toString());
    Radix.radixSortSimple(data2);
    System.out.println(data2.toString());
  }

}
