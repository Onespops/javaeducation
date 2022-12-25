package lesson9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
  static void graphs() {
    // Графы - набор узлов, связанных ребрами
  }

  static void trees() {
    // Деревья - графы без циклов
    // Бинарные деревья - деревья, у узлов которых может быть максимум два наследника (левый и правый)
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");
    Node nodeF = new Node("F");
    Node nodeG = new Node("G");

    nodeA.left = nodeB;
    nodeA.right = nodeC;
    nodeB.left = nodeD;
    nodeB.right = nodeE;
    nodeC.right = nodeF;
    nodeE.left = nodeG;

    Node root = nodeA;

    System.out.println(nodeA.info);
    System.out.println(nodeA.left.info);
  }

  static void horizontal(Node root) {
    LinkedList<Node> queue = new LinkedList<>();
    queue.addLast(root);
    while (!queue.isEmpty()) {
      Node temp = queue.removeFirst();
      System.out.println(temp.info);
      if (temp.left != null) {
        queue.addLast(temp.left);
      }
      if (temp.right != null) {
        queue.addLast(temp.right);
      }
      System.out.println(queue);
    }
  }

  static void preorder(Node root) {
    if (root != null) {
      System.out.println(root.info);
      preorder(root.left);
      preorder(root.right);
    }
  }

  static void inorder(Node root) {
    if (root != null) {
      inorder(root.left);
      System.out.println(root.info);
      inorder(root.right);
    }
  }

  static void reverseorder(Node root) {
    if (root != null) {
      reverseorder(root.right);
      System.out.println(root.info);
      reverseorder(root.left);
    }
  }

  static void postorder(Node root) {
    if (root != null) {
      postorder(root.left);
      postorder(root.right);
      System.out.println(root.info);
    }
  }

  static void treeTraversal() {
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");
    Node nodeF = new Node("F");
    Node nodeG = new Node("G");

    nodeA.left = nodeB;
    nodeA.right = nodeC;
    nodeB.left = nodeD;
    nodeB.right = nodeE;
    nodeC.right = nodeF;
    nodeE.left = nodeG;
    Node root = nodeA;

    // Обход в ширину - проход по уровням слева направа
//    horizontal(root);
    // Обход в глубину - проход сначала в глубину и только потом в ширину
    // Прямой (nlr, pre-order)
    System.out.println("Pre-order");
    preorder(root);
    // Центрированный (lnr, in-order)
    System.out.println("In-order");
    inorder(root);
    // Обратный (lrn, post-order)
    System.out.println("Post-order");
    postorder(root);
  }

  static void binarySearchTree() {
    // Бинарное дерево поиска - бинарное дерево, у которого правые потомки больше узла, а левые - меньше

  }

  static int linearSearch(List<Integer> list, int target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) {
        return i;
      }
    }
    return -1;
  }

  static int binarySearch(List<Integer> list, int target, int left, int right) {
    if (left > right) {
      return -1;
    }
    int mid = (left + right) / 2;
    System.out.printf("Ищем среди %s значение %d, \nleft = %d, right = %d, \nmid = %d, list.get(mid) = %d\n",
        list.subList(left, right + 1), target, left, right, mid, list.get(mid));
    if (list.get(mid) == target) {
      return mid;
    } else if (list.get(mid) > target) {
      return binarySearch(list, target, left, mid - 1);
    } else {
      return binarySearch(list, target, mid + 1, right);
    }
  }

  static int interpolationSearch(List<Integer> arr, int key) {
    int left = 0;
    int right = arr.size() - 1;
    int guess;

    while ((arr.get(right) != arr.get(left)) && (key >= arr.get(left)) && (key <= arr.get(right))) {
      guess = left + ((key - arr.get(left)) * (right - left) / (arr.get(right) - arr.get(left)));
      System.out.printf("Ищем среди %s значение %d, \nleft = %d, right = %d, \nguess = %d, list.get(mid) = %d\n",
          arr.subList(left, right + 1), key, left, right, guess, arr.get(guess));
      if (arr.get(guess) < key)
        left = guess + 1;
      else if (key < arr.get(guess))
        right = guess - 1;
      else
        return guess;
    }

    if (key == arr.get(left))
      return left;
    else
      return -1;
  }

  static void searchAlgorithms() {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(5);
    list.add(-1);
    list.add(4);
    list.add(3);
    list.add(10);
    list.add(7);
    System.out.printf("4 лежит на %d индексе\n", linearSearch(list, 4));
    System.out.printf("100 лежит на %d индексе\n", linearSearch(list, 100));

    list.sort((x, y) -> x - y);
    System.out.println(list);
//    System.out.printf("7 лежит на %d индексе\n", binarySearch(list, 7, 0, list.size() - 1));
//    System.out.printf("3 лежит на %d индексе\n", binarySearch(list, 3, 0, list.size() - 1));
//    System.out.printf("100 лежит на %d индексе\n", binarySearch(list, 100, 0, list.size() - 1));

    System.out.printf("7 лежит на %d индексе\n", interpolationSearch(list, 7));
    System.out.printf("3 лежит на %d индексе\n", interpolationSearch(list, 3));
    System.out.printf("8 лежит на %d индексе\n", interpolationSearch(list, 8));
  }


  static int Partition(int[] values, int l, int r) {
    int x = values[r];
    int less = l;

    for (int i = l; i < r; ++i) {
      if (values[i] <= x) {
        int temp = values[i];
        values[i] = values[less];
        values[less] = temp;
        ++less;
      }
    }
    int temp0 = values[r];
    values[r] = values[less];
    values[less] = temp0;
    return less;
  }

  static void QuickSortImpl(int[] values, int l, int r) {
    if (l < r) {
      System.out.printf("До разделения: %s, l = %d, r = %d\n", Arrays.toString(values), l, r);
      int q = Partition(values, l, r);
      System.out.printf("После разделения: %s, l = %d, r = %d\n", Arrays.toString(values), l, r);
      QuickSortImpl(values, l, q - 1);
      QuickSortImpl(values, q + 1, r);
    }
  }

  static void QuickSort(int[] values) {
    if (values.length != 0) {
      QuickSortImpl(values, 0, values.length - 1);
    }
  }

  static void MergeSortImpl(int[] values, int[] buffer, int l, int r) {
    if (l < r) {
      int m = (l + r) / 2;
      MergeSortImpl(values, buffer, l, m);
      MergeSortImpl(values, buffer, m + 1, r);
      System.out.println(Arrays.toString(values));

      int k = l;
      for (int i = l, j = m + 1; i <= m || j <= r; ) {
        if (j > r || (i <= m && values[i] < values[j])) {
          buffer[k] = values[i];
          ++i;
        } else {
          buffer[k] = values[j];
          ++j;
        }
        ++k;
      }
      for (int i = l; i <= r; ++i) {
        values[i] = buffer[i];
      }
    }
  }

  static void MergeSort(int[] values) {
    if (values.length != 0) {
      int[] buffer = new int[values.length];
      MergeSortImpl(values, buffer, 0, values.length - 1);
    }
  }

  static void sortAlgorithms() {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(10);
    list.add(7);
    list.add(5);
    list.add(-1);
    list.add(4);
    list.add(3);

    System.out.println(list);
    for (int j = 0; j < list.size(); j++) {
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
          int temp = list.get(i);
          list.set(i, list.get(i + 1));
          list.set(i + 1, temp);
        }
      }
    }
    System.out.println(list);
    
    int[] arrInt = new int[]{1, 10, 7, 5, -1, 4, 3};
    QuickSort(arrInt);
    arrInt = new int[]{10, 1, 7, 5, 4, -1, 9, 3};
    MergeSort(arrInt);
    System.out.println(Arrays.toString(arrInt));

    Arrays.sort(arrInt);
  }


  public static void main(String[] args) {
//    trees();
//    treeTraversal();
//    searchAlgorithms();
    sortAlgorithms();
  }
}
