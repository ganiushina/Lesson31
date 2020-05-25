import twosidelist.TwoSideLinkedList;
import twosidelist.TwoSideLinkedListImpl;

public class Main {
    public static void main(String[] args) {
        VectorList<Integer> vectorList = new VectorList<>();
        vectorList.add(1);
        vectorList.add(4);
        vectorList.add(6);
        vectorList.add(4);
        System.out.println(vectorList.get(0));
        System.out.println(vectorList.get(1));
        System.out.println(vectorList.get(2));
        System.out.println(vectorList.get(3));
        System.out.println(vectorList.getLast(0));
        System.out.println(vectorList.getLast(1));
        System.out.println(vectorList.getLast(2));
        System.out.println(vectorList.getLast(3));
        System.out.println(vectorList.getBack(0));
        System.out.println(vectorList.getBack(1));
        System.out.println(vectorList.getBack(2));
        System.out.println(vectorList.getBack(3));

        int[] array = new int[]{1,3,7,9,4,2,8};

        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }


        int k = 1;
        int b = 1;
        int c;
        int [] myArray = new int[20];
        myArray[0] = k;
        myArray[1] = b;

        for (int i = 2; i < 20 ; i++) {
            c = k + b;
            myArray[i] = c;
            k=b;
            b=c;
        }

        for (int i = 0; i < myArray.length ; i++) {
            System.out.println(myArray[i]);
        }

        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(5);

        linkedList.display();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));

        linkedList.removeFirst();
        linkedList.remove(2);

        linkedList.display();

    }
}
