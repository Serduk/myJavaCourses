package pmHome.homeWorks.pmHomeWork2;

import java.util.*;

/**
 * Created by serega on 17/11/15.
 */
public class HomeWorkArr {
    public static void main(String [] args) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            String str = "" + (int) (Math.random() * i);
            map.put(str, (int) (Math.random() * i));
            list.add((int) (Math.random() * i));
            set.add((int) (Math.random() * i));
        }

        System.out.println("Map size is.. " + map.size());
        System.out.println("List size is.. " + list.size());
        System.out.println("Set size is.. " + set.size());

        Iterator<Integer> listIterator = list.iterator();
        Iterator<Integer> setIterator = set.iterator();
        Iterator<Map.Entry<String, Integer>> iteratorMap = map.entrySet().iterator();

        System.out.println("List Iterator");
        printArray(listIterator);

        System.out.println("Set Iterator");
        printArray(setIterator);

        System.out.println("Map Iterator");
        printCollection(iteratorMap);

    }

    public static void printArray(Iterator<Integer> setIterator) {
        while (setIterator.hasNext()) {
            System.out.print(setIterator.next() + ", ");
        }
        System.out.println(" ");
    }

    public static void printCollection(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println(" ");
    }
}
