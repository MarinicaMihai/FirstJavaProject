public class NumberOccurenceInArray3 {
    public static void main(String[] args) {
        String[][] words = {
                //pos       0     1    2    3
                /*0*/       {"a", "b", "c", "d"},
                /*1*/       {"e", "f", "g", "h"},
                /*2*/       {"i", "j", "k", "l"},
                /*3*/       {"m", "n", "o", "p"},
        };

        String[][] words2 = new String[4][4];
//        words2[0] = new String[]{"abcd"};
//        words2[1] = new String[]{"efgh"};
//        words2[2] = new String[]{"ijkl"};
//        words2[3] = new String[]{"mnop"};

        System.out.println(words[3][2]);


        int[][] numbers = {
                //pos       0     1    2    3
                /*0*/       {1, 2, 3, 4},
                /*1*/       {5, 6, 7, 8},
                /*2*/       {9, 10, 11, 12},
                /*3*/       {13, 14, 15, 16},
        };

        System.out.println(numbers[2][1]);

        System.out.print("* ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(j + "| ");
            }
            System.out.println();
            break;
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(j + "| ");
            for (int k = 0; k < numbers[j].length; k++) {
                System.out.print(numbers[j][k] + " ");
            }
            System.out.println();
        }

    }
}