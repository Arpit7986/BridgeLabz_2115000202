public class EarthVolume {
    public static void main(String[] args) {
        final double pie=Math.PI;
        int radius=6378;
        double volume=(4*pie*radius*radius*radius)/3;
        System.out.println("The Volume Of Earth in Cubic Kilmeters is "+volume+" and cubic miles is "+(volume/1.6));
    }
}
