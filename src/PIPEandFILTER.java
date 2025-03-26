import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PIPEandFILTER {
 public static void main(String[] args) {
   List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Function<List<Integer>, List<Integer>>> filters = new ArrayList<>();
       filters.add(PIPEandFILTER::filterEvenNumbers);
       filters.add(PIPEandFILTER::squareNumbers);
       filters.add(PIPEandFILTER::filterNumbersGreaterThanTen);
       filters.add(PIPEandFILTER::cubeNumbers);
       filters.add(PIPEandFILTER::oddNumbers);

        List<Integer> result = processPipeline(input, filters);
        System.out.println(result);
    }
    private static List<Integer> processPipeline(List<Integer> input, List<Function<List<Integer>, List<Integer>>> filters) {
        List<Integer> output = input;
        for (Function<List<Integer>, List<Integer>> filter : filters) {
            output = filter.apply(output);
        }
        return output;
    }
    private static List<Integer> filterEvenNumbers(List<Integer> input) {
        return input.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
    private static List<Integer> squareNumbers(List<Integer> input) {
        return input.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
    private static List<Integer> filterNumbersGreaterThanTen(List<Integer> input) {
        return input.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
    }
     // Cube of numbers new filter added
    private static List<Integer> cubeNumbers(List<Integer> input) {
        return input.stream()
                .map(n -> n * n * n)
                .collect(Collectors.toList());
    }
     //  filtering odd numbers
    private static List<Integer> oddNumbers(List<Integer> input) {
        return input.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }
}

    
    

