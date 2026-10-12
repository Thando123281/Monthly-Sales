public class CoffeeHutReport {

    public static void main(String[] args) {

        // Declare and populate a one-dimensional array
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Declare and populate a two-dimensional array
        int[][] sales = {
            {500, 300, 125},
            {450, 250, 100},
            {480, 175, 120}
        };

        // Declare a one-dimensional array for city totals
        int[] cityTotals = new int[3];

        // Declare a variable for total sales
        int totalSales = 0;

        // Display the application heading
        System.out.println("NUMBER 1 COFFEE HUT APPLICATION");
        System.out.println("==============================================");

        // Display the sales report heading
        System.out.println("\nNUMBER 1 COFFEE HUT REPORT");
        System.out.println("==============================================");

        // Print the column headings
        System.out.printf("%-20s %10s %10s %12s%n",
                "CITY", "COFFEE", "TEA", "BOBA TEA");

        System.out.println("----------------------------------------------");

        // Display the sales for each city
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s %10.2f %10.2f %12.2f%n",
                    cities[i],
                    (double) sales[i][0],
                    (double) sales[i][1],
                    (double) sales[i][2]);

            // Calculate total sales for each city
            for (int j = 0; j < sales[i].length; j++) {
                cityTotals[i] += sales[i][j];
            }

            // Add each city's total to the grand total
            totalSales += cityTotals[i];
        }

        // Display the total sales for each city
        System.out.println("\nPRODUCT SALES TOTALS FOR EACH CITY");
        System.out.println("==============================================");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s R%.2f%n",
                    cities[i], (double) cityTotals[i]);
        }

        // Display total sales for all cities
        System.out.println("==============================================");
        System.out.printf("TOTAL SALES FOR CITIES: R%.2f%n",
                (double) totalSales);

        System.out.println("==============================================");
    }
}
