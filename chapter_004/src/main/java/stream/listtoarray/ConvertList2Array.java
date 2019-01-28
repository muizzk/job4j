package stream.listtoarray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ConvertList2Array.
 *
 * @author Maxim Vanny.
 * @version 2.0
 * @since 0.1
 */
@SuppressWarnings("Duplicates")
public class ConvertList2Array {
    /**
     * Method convert list to array.
     *
     * @param list list Integer.
     * @param rows number rows.
     * @return array from list.
     */
    public final int[][] toArray(final List<Integer> list, final int rows) {

        int cells;
        if (list.size() % rows == 0) {
            cells = list.size() / rows;
        } else {
            cells = (list.size() / rows) + 1;
        }
        Iterator<Integer> iterator = list.iterator();
        int[][] array = new int[rows][cells];
        final int[] ints = list.stream().mapToInt(Integer::intValue).toArray();

  /*      for (int out = 0; out < rows; out++) {
            for (int in = 0; in < cells; in++) {
                if (iterator.hasNext()) {
                    array[out][in] = iterator.next();
                } else {
                    break;
                }
            }
        }*/

        return null;
    }

    /**
     * Method convert members of arrays from list to general list.
     *
     * @param list the list of arrays[].
     * @return the list of Integers.
     */
    public final List<Integer> convert(final List<int[]> list) {
        return list.stream()
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toList());
    }
}
