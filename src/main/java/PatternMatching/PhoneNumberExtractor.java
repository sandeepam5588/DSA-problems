package PatternMatching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\phonewithtext.txt"));
            String mobileRe = "[6-9][0-9]{9}";
//            extractMobileNumbers(br, mobileRe);
            extractMobileNumbersSpannedMultiLines(br, mobileRe);
            System.out.println("completed reading the file");
        }catch (Exception e){
            System.out.println("Error while extracting numbers"+ e);
        }
    }

    //this will not find the number if it is overlapped/spanned across two lines
    private static void extractMobileNumbers(BufferedReader br, String mobileRe) throws IOException {
        Pattern pattern = Pattern.compile(mobileRe);
        String line = br.readLine();
        Matcher matcher = null;
        while(line != null){
            matcher= pattern.matcher(line);
            while (matcher.find()){
                System.out.println("phone : "  + matcher.group());
            }
            line = br.readLine();
        }
    }
    private static void extractMobileNumbersSpannedMultiLines(BufferedReader br, String mobileRe) throws IOException {
        Pattern pattern = Pattern.compile(mobileRe, Pattern.MULTILINE);
        StringBuilder previousLine = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            String combinedLine = previousLine + line;
            Matcher matcher = pattern.matcher(combinedLine);

            // Find and print all matching phone numbers in the combined line
            int endIndexOfLastMatched = 0;
            while (matcher.find()) {
                System.out.println("phone: " + matcher.group());
                endIndexOfLastMatched = matcher.end();
            }
            previousLine = new StringBuilder(combinedLine.substring(endIndexOfLastMatched));
        }

        // Check the last remaining line for any phone numbers
        Matcher matcher = pattern.matcher(previousLine);
        while (matcher.find()) {
            System.out.println("phone: " + matcher.group());
        }
    }
}
