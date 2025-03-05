class Boolean {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean hasLicense = false;
        boolean isWeekend = true;
        boolean isDoorOpen = false;
        boolean hasDiscount = true;

        System.out.println("Initial Boolean values: Is Raining = " + isRaining + ", Has License = " + hasLicense + ", Is Weekend = " + isWeekend + ", Is Door Open = " + isDoorOpen + ", Has Discount = " + hasDiscount);

        isRaining = false;
        hasLicense = true;
        isWeekend = false;
        isDoorOpen = true;
        hasDiscount = false;

        System.out.println("Updated Boolean values: Is Raining = " + isRaining + ", Has License = " + hasLicense + ", Is Weekend = " + isWeekend + ", Is Door Open = " + isDoorOpen + ", Has Discount = " + hasDiscount);
    }
}
