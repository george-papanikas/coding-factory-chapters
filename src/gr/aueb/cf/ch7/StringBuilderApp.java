package gr.aueb.cf.ch7;

public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String concatStr = "";

        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 90000; i++) {
            concatStr += i;
        }
        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 90000; i++) {
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String concat time: " + stringElapsedTime + " secs");
        System.out.println("Sb concat time: " + sbElapsedTime + " secs");
    }
}
