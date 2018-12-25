package practice.algorithms.greedy;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/beautiful-pairs/problem">problem</a>
 * @since 2018-12-25
 */

public class BeautifulPairs {
    static int beautifulPairs(int[] A, int[] B) {
        /*List<Integer> aList = Arrays.stream(A).boxed().sorted().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(B).boxed().sorted().collect(Collectors.toList());

        System.out.println(aList);
        System.out.println(bList);

        aList.removeAll(bList);

        System.out.println(aList);

        return bList.size() - aList.size() + 1;*/
        int[] bucket = new int[1001];
        int count = 0, position = 0;
        for (int i = 0; i < A.length; i++) {
            bucket[A[i]]++;
        }

        for (int i = 0; i < B.length; i++) {
            position = B[i];
            if (bucket[position] > 0) {
                count++;
                bucket[position]--;
            }
        }

        return (count < A.length) ? ++count : --count;
    }

    public static void main(String[] args) {
        System.out.println("Pairs ::" + beautifulPairs(new int[]{3, 4, 1, 2}, new int[]{1, 2, 3, 3}));
    }
}
