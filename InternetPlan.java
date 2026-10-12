class InternetPlan
{
    String planName;
    int dataLimit;
    double price;

    InternetPlan()
    {
        this("Basic", 10, 199);
    }

    InternetPlan(String planName, int dataLimit)
    {
        this(planName, dataLimit, 299);
    }

    InternetPlan(String planName, int dataLimit, double price) {
        this.planName = planName;
        this.dataLimit = dataLimit;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName);
        System.out.println("Data Limit: " + dataLimit + " GB");
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Standard", 50);
        InternetPlan p3 = new InternetPlan("Premium", 100, 499);

        p1.display();
        p2.display();
        p3.display();
    }
}