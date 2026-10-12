
class TimeDemo {
    int seconds;

    TimeDemo(int s) {
        seconds = s;
    }

    TimeDemo(int m, int s) {
        seconds = m * 60 + s;
    }

    TimeDemo(int h, int m, int s) {
        seconds = h * 3600 + m * 60 + s;
    }

    void display() {
        System.out.println("Time in seconds: " + seconds);
        System.out.println("Time in minutes: " + seconds / 60.0);
        System.out.println("Time in hours: " + seconds / 3600.0);
        System.out.println();
    }

    public static void main(String[] args) {
        TimeDemo t1 = new TimeDemo(45);
        TimeDemo t2 = new TimeDemo(2, 30);
        TimeDemo t3 = new TimeDemo(1, 2, 30);

        t1.display();
        t2.display();
        t3.display();
    }
}