public class Radix {

  public static int nth(int n, int col) {
    int nth;
    n = Math.abs(n);
    nth = n / (int)Math.pow(10, col) % 10;
    return nth;
  }

  public static int length(int n) {
    int len;
    n = Math.abs(n);
    if (n == 0) return 1;
    len = (int)(Math.log10(n) + 1);
    return len;
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {
    int passes = 1;
    int largest = 0;
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0; i < 10; i ++){
      SortableLinkedList bukt = new SortableLinkedList();
      buckets[i] = bukt;
    }
    for (int i = 0; i <= passes; i++) {
      for (int j = 0; j < data.size(); j++) {
        int d = data.get(0);
        if (i == 1) {
          if (Math.abs(d) > largest) largest = d;
        }
        int n = nth(d, i);
        buckets[n].add(d);
        data.remove(j);
        j--;
      }
      merge(data, buckets);
      passes = length(largest);
    }
  }

  public static void radixSort(SortableLinkedList data) {
    radixSortSimple(data);
    SortableLinkedList negData = new SortableLinkedList();
    SortableLinkedList posData = new SortableLinkedList();
    for (int i = 0; i < data.size(); i++) {
      int d = data.get(i);
      if (d < 0) {
        negData.add(0,d);
        data.remove(i);
        i--;
      }
      if (d >= 0) {
        posData.add(d);
        data.remove(i);
        i--;
      }
    }
    data.extend(negData);
    data.extend(posData);
  }

}
