public class Arrays {

    public static void main(String[] args) {

        String[] cars = { "Camaro", "Corvette", "Tesla", "BMW" };
        cars[0] = "Mustang";

        for (int i = 0; i <= cars.length; i++) {
            System.out.println(cars[i]);
        }

        // 2D array
        String[][] kars = new String[3][3]; // the first bracket is for rows/no of arrays and the second bracket is for columns/no of elements.

        kars[0][0] = "Camaro";
        kars[0][1] = "Corvette";
        kars[0][2] = "Silverado";
        kars[1][0] = "Mustang";
        kars[1][1] = "Ranger";
        kars[1][2] = "F-150";
        kars[2][0] = "Ferrari";
        kars[2][1] = "Lambo";
        kars[2][2] = "Telsa";
        
        for(int i = 0; i < kars.length; i++){
            System.out.println();
            for(int j=0; j<kars[i].length; j++){
                System.out.print(kars[i][j] + " ");
            }
        }
        

    }

}
