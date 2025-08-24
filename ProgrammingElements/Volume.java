public class Volume {
    public static void main(String[] args) {
        
        int radiusKm = 6378;
        double volumeInKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.609;
        double volumeInMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm +
                           " and cubic miles is " + volumeInMiles);
    }
}
