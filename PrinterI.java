public class PrinterI implements Demo.Printer {
    private int jobCount = 0;

    @Override
    public String printString(String s, com.zeroc.Ice.Current current) {
        jobCount++;
        System.out.println("printString: " + s);
        return "Printed: " + s;
    }

    @Override
    public String printUpperCase(String s, com.zeroc.Ice.Current current) {
        jobCount++;
        System.out.println("printUpperCase: " + s.toUpperCase());
        return "Printed: " + s.toUpperCase();
    }

    @Override
    public int getJobCount(com.zeroc.Ice.Current current) {
        return jobCount;
    }
}
