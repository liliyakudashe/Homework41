package hw;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfIntegers {

    public static void listOfIntegers(){
        Stream<Integer> numStream = Stream.of(43, 65, 1, 98, 63);
        List<Integer> even = numStream.filter(n ->n % 2 == 0) .collect(Collectors.toList());
        System.out.println(even);
    }
}
