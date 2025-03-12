class IndustryRun {
    public static void main(String[] args) {
        Industry industry1 = new Industry();
        Industry industry2 = new Industry();
        Industry industry3 = new Industry();
        Industry industry4 = new Industry();
        Industry industry5 = new Industry();
        Industry industry6 = new Industry();
        Industry industry7 = new Industry();
        Industry industry8 = new Industry();
        Industry industry9 = new Industry();
        Industry industry10 = new Industry();

        industry1.name = "Automobile";
        industry1.employees = 5000;
        industry1.revenue = 10.5f;
        industry1.isManufacturing = true;

        industry2.name = "Pharmaceuticals";
        industry2.employees = 8000;
        industry2.revenue = 15.0f;
        industry2.isManufacturing = true;

        industry3.name = "IT Services";
        industry3.employees = 20000;
        industry3.revenue = 25.5f;
        industry3.isManufacturing = false;

        industry4.name = "Textile";
        industry4.employees = 7000;
        industry4.revenue = 8.0f;
        industry4.isManufacturing = true;

        industry5.name = "Construction";
        industry5.employees = 10000;
        industry5.revenue = 18.2f;
        industry5.isManufacturing = true;

        industry6.name = "Retail";
        industry6.employees = 12000;
        industry6.revenue = 22.3f;
        industry6.isManufacturing = false;

        industry7.name = "Electronics";
        industry7.employees = 6000;
        industry7.revenue = 12.5f;
        industry7.isManufacturing = true;

        industry8.name = "Agriculture";
        industry8.employees = 9000;
        industry8.revenue = 9.8f;
        industry8.isManufacturing = true;

        industry9.name = "Telecom";
        industry9.employees = 15000;
        industry9.revenue = 20.0f;
        industry9.isManufacturing = false;

        industry10.name = "Aerospace";
        industry10.employees = 4000;
        industry10.revenue = 30.0f;
        industry10.isManufacturing = true;

        System.out.println("Industry 1: " + industry1.name + ", " + industry1.employees + " employees, revenue: " + industry1.revenue + ", Manufacturing: " + industry1.isManufacturing);
        System.out.println("Industry 2: " + industry2.name + ", " + industry2.employees + " employees, revenue: " + industry2.revenue + ", Manufacturing: " + industry2.isManufacturing);
        System.out.println("Industry 3: " + industry3.name + ", " + industry3.employees + " employees, revenue: " + industry3.revenue + ", Manufacturing: " + industry3.isManufacturing);
        System.out.println("Industry 4: " + industry4.name + ", " + industry4.employees + " employees, revenue: " + industry4.revenue + ", Manufacturing: " + industry4.isManufacturing);
        System.out.println("Industry 5: " + industry5.name + ", " + industry5.employees + " employees, revenue: " + industry5.revenue + ", Manufacturing: " + industry5.isManufacturing);
        System.out.println("Industry 6: " + industry6.name + ", " + industry6.employees + " employees, revenue: " + industry6.revenue + ", Manufacturing: " + industry6.isManufacturing);
        System.out.println("Industry 7: " + industry7.name + ", " + industry7.employees + " employees, revenue: " + industry7.revenue + ", Manufacturing: " + industry7.isManufacturing);
        System.out.println("Industry 8: " + industry8.name + ", " + industry8.employees + " employees, revenue: " + industry8.revenue + ", Manufacturing: " + industry8.isManufacturing);
        System.out.println("Industry 9: " + industry9.name + ", " + industry9.employees + " employees, revenue: " + industry9.revenue + ", Manufacturing: " + industry9.isManufacturing);
        System.out.println("Industry 10: " + industry10.name + ", " + industry10.employees + " employees, revenue: " + industry10.revenue + ", Manufacturing: " + industry10.isManufacturing);
    }
}