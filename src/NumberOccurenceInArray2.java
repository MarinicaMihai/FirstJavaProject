import java.util.HashMap;

public class NumberOccurenceInArray2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 2 };
        HashMap<Integer,Integer>duplicateNumbers=new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
//                    System.out.println(numbers[i] + " is a duplicate number");

                    if (!duplicateNumbers.containsKey(numbers[i])) {
                        duplicateNumbers.put(numbers[i], 1); // if the number does not exist in the HashMap, add it with value 1 occurence
//                        System.out.println("Number " + numbers[i] + " is a duplicate number" + " and occurs " + numberOfOccurence + " times");

                    } else {
//                        System.out.println("Number " + numbers[i] + " is a duplicate number" + " and occurs " + numberOfOccurence + " timesx");
                        duplicateNumbers.put(numbers[i], duplicateNumbers.get(numbers[i]) + 1); // if already exists increment the value of duplicateNumbers.get(numbers[i])
                    }
                }
            }

        }


        for (Integer key : duplicateNumbers.keySet()) {

            int foundDuplicateNo = key;
            int timesFound = (int) duplicateNumbers.get(key);
            System.out.println(foundDuplicateNo + " occurs " + timesFound + " times");

        }


    }
}

