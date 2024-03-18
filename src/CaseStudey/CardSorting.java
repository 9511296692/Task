package CaseStudey;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardSorting {
    public static void main(String[] args) {
    	
    	
        List<String> Sandeep = new ArrayList<>();
         Sandeep.add("SH2");
        Sandeep.add("SH5");
        Sandeep.add("SCI");
        Sandeep.add("SD4");

        
        List<String> Ramesh = new ArrayList<>();
         Ramesh.add("RD10");
        Ramesh.add("RC5");
        Ramesh.add("RDI");
        Ramesh.add("RS4");

        List<String> Pack = new ArrayList<>();
        Pack.addAll(Ramesh);
        Pack.addAll(Sandeep);

        Collections.sort(Pack, new Comparator<String>() {
            @Override
            public int compare(String card1, String card2) {
                return getColorValue(card1) - getColorValue(card2);
            }
        });
        System.out.println("Sorted by Color:");
        for (String card : Pack) {
            System.out.println(card);
        }
        Collections.sort(Pack, new Comparator<String>() {
            @Override
            public int compare(String card1, String card2) {
                return getNumberValue(card1) - getNumberValue(card2);
            }
        });
        System.out.println("\nSorted by Number:");

        for (String card : Pack) {
            System.out.println(card);
        }
    }
    private static int getColorValue(String card) {
        char color = card.charAt(0);
        switch (color) {
            case 'S':
                return 0; 
            case 'H':
                return 1;
            case 'D':
                return 2; 
            case 'C':
                return 3; 
            default:
                return -1;
        }
    }

    private static int getNumberValue(String card) {
        String numberPart = card.substring(2); 
        try {
            return Integer.parseInt(numberPart); 
        } catch (NumberFormatException e) {
           
            return -1;
}

    }
}