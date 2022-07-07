package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        mergeLists(firstList, secondList, resultList);
        printResultList(resultList);
    }

    private static void printResultList(List<Integer> resultList) {
        for (int number : resultList) {
            System.out.printf("%d ", number);
        }
    }

    private static void mergeLists(List<Integer> firstList, List<Integer> secondList, List<Integer> resultList) {
        int minSizeList = Math.min(firstList.size(), secondList.size());
        int maxSizeList = Math.max(firstList.size(), secondList.size());
        for (int i = 0; i < minSizeList; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }
        for (int i = minSizeList; i < maxSizeList; i++) {
            if (maxSizeList == firstList.size()) {
                resultList.add(firstList.get(i));
            } else {
                resultList.add(secondList.get(i));
            }
        }
    }

}
