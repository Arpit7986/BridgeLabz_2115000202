public class PenDistribution {
    public static void main(String[] args) {
        int pen=14;
        int student=3;
        int quantity=pen/student;
        int remaining=pen%student;
        System.out.println("The Pen Per Student is "+quantity+" and the remaining pen not distributed is "+remaining);
    }
}
