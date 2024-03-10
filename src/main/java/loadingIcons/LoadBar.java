package loadingIcons;

public class LoadBar {
    public static void loadBar() throws InterruptedException {
        final int MAX_PROGRESS = 100;
        final int TILE_SIZE = 10;

        System.out.print("Loading... [          ]0%\r");

        for (int progress = 0; progress <= MAX_PROGRESS; progress += TILE_SIZE) {
            drawProgressBar(progress, MAX_PROGRESS);
            sleep(500);
        }

        System.out.println("\nLoading complete");
    }
        private static void drawProgressBar(int progress, int maxProgress) {
        int numTiles = progress / (maxProgress / 10);
            System.out.print("Loading...[");
            for (int i = 0; i < 10; i++) {
                if (i < numTiles) {
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + progress + "%\r");
        }

        private static void sleep(int milliseconds) throws InterruptedException {
            Thread.sleep(milliseconds);
        }
    }

