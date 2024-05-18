import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) {
        array();
        list();
        map();
    }

    public static void map() {
        // declare
        Map<Integer, String> names = new HashMap<>();

        // initial values
        names.put(1, "João Delfino");
        names.put(2, "Maria do Carmo");
        names.put(3, "Claudinei Silva");

        // list values
        System.out.println(names);

        // get
        System.out.println(names.get(2));

        // length
        System.out.println(names.size());

        // set
        System.out.println(names.entrySet());

        // iterator
        Iterator<Entry<Integer, String>> iteratorNames = names.entrySet().iterator();

        while (iteratorNames.hasNext()) {
            System.out.println(iteratorNames.next());
        }
    }

    public static void list() {
        // declare
        List<Integer> nums = new ArrayList<>();

        // initial values
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }

        // list values
        System.out.println(nums.toString());

        // length
        System.out.println(nums.size());

        // get first
        System.out.println(nums.getFirst());

        // get last
        System.out.println(nums.getLast());

        // contains
        System.err.println(nums.contains(5));
        System.err.println(nums.contains(-5));

        // stream
        System.out.println(nums.stream().findFirst());
    }

    public static void array() {
        // declare
        int[] nums = new int[10];

        // initial values
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        // list values in nums
        System.out.println(Arrays.toString(nums));

        // length nums
        System.out.println(nums.length);

        // clone
        int[] cloneNums = nums.clone();

        // list values in cloneNums
        System.out.println(Arrays.toString(cloneNums));

        // length cloneNums
        System.out.println(cloneNums.length);

        // another nums
        int[] anotherNums = { 0, 7, 11, 22, 37 };

        // length anotherNums
        System.out.println(anotherNums.length);

        // equals
        System.out.println(Arrays.equals(nums, cloneNums));
        System.out.println(Arrays.equals(nums, anotherNums));
        System.out.println(Arrays.equals(anotherNums, cloneNums));

        // mismatch
        System.out.println(Arrays.mismatch(nums, cloneNums));
        System.out.println(Arrays.mismatch(nums, anotherNums));
        System.out.println(Arrays.mismatch(anotherNums, cloneNums));

        // stream
        Arrays.stream(nums).forEach(System.out::println);
        System.out.println(Arrays.stream(nums).sum());
        System.out.println(Arrays.stream(nums).max());
        System.out.println(Arrays.stream(nums).min());
    }
}
