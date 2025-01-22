public class UniversityFees {
    public static void main(String args[])
    {
        int fees=125000;
        int discountPercent=10;
        int discount=(fees*discountPercent)/100;
        int result=fees-discount;
        System.out.println("The Discount Amount is INR "+discount+" and the final discounted fees is INR "+result);
    }
}
