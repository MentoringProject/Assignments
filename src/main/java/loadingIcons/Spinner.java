package loadingIcons;

public class Spinner {
    public static void spinner() throws InterruptedException {

        final int SPIN_DURATION = 5000;
        final int FRAMES_PER_SECOND = 10;
        final int FRAME_DELAY = 1000 / FRAMES_PER_SECOND;

        long startTime = System.currentTimeMillis();
        long currentTime;


        while ((currentTime = System.currentTimeMillis()) - startTime < SPIN_DURATION) {
            drawSpinner(currentTime, startTime, SPIN_DURATION);
            sleep(FRAME_DELAY);
        }

        System.out.println("\nLoading complete");
    }

    private static void drawSpinner(long currentTime, long startTime, int spinDuration) {
        int frameNumber = (int) ((currentTime - startTime) / (spinDuration / 8)) % 8;

        switch (frameNumber) {
            case 0:
                System.out.print("Loading...[/]\r");
                break;
            case 1:
                System.out.print("Loading...[|]\r");
                break;
            case 2:
                System.out.print("Loading...[\\]\r");
                break;
            case 3:
                System.out.print("Loading...[-]\r");
                break;
            case 4:
                System.out.print("Loading...[/]\r");
                break;
            case 5:
                System.out.print("Loading...[|]\r");
                break;
            case 6:
                System.out.print("Loading...[\\]\r");
                break;
            case 7:
                System.out.print("Loading...[-]\r");
                break;
        }
    }

    private static void sleep(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }
}
