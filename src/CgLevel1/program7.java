package CgLevel1;

public class program7 {
    public static void main(String[] args) {
        double rKm = 6378;

        double volumeKm3 = (4.0/3.0) * Math.PI * Math.pow(rKm, 3);

        double volumeMiles3 = volumeKm3 * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
