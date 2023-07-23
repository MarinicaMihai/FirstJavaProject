public class SpaceOccurancePercentage {
    public static void main(String[] args) {
        String text = "webcsdfndsb dsakdjsa mdskmdk ndsdnsk jdksjdk djksjdkjs dskjdskj d asdsd" +
                "333" + "              df fd " + " sdadsad  ds  d       ";
        int spaceCount = 0;
        int textTotalLength = text.length(); // here we get the total length of our string

        for (int i = 0; i < textTotalLength; i++) {
            if (text.charAt(i) == ' ') { // here we check if the character at position i is a space
                System.out.println("Space found at position " + i);
                spaceCount++;
            }
        }

        System.out.println("Space count is " + spaceCount);

        // here we calculate the percentage of spaces in our string
        double spacePercentage = (double) spaceCount / textTotalLength * 100;
        System.out.format("Space percentage is %.2f", spacePercentage);
        // show only 2 digits after the decimal point


    }
}
