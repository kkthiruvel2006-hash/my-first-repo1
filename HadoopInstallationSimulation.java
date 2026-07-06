public class HadoopInstallationSimulation {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--------------------------------------");
        System.out.println("     Hadoop Installation Simulation");
        System.out.println("--------------------------------------");

        simulateStep("Step 1: Checking Java installation...");
        simulateStep("Java found: JDK 8 installed");

        simulateStep("Step 2: Downloading Hadoop package...");
        simulateStep("Download completed successfully");

        simulateStep("Step 3: Extracting Hadoop files...");
        simulateStep("Extraction completed");

        simulateStep("Step 4: Setting JAVA_HOME environment variable...");
        simulateStep("JAVA_HOME configured successfully");

        simulateStep("Step 5: Configuring core-site.xml...");
        simulateStep("core-site.xml updated");

        simulateStep("Step 6: Configuring hdfs-site.xml...");
        simulateStep("hdfs-site.xml updated");

        simulateStep("Step 7: Configuring mapred-site.xml...");
        simulateStep("mapred-site.xml updated");

        simulateStep("Step 8: Configuring yarn-site.xml...");
        simulateStep("yarn-site.xml updated");

        simulateStep("Step 9: Formatting NameNode...");
        simulateStep("NameNode formatted successfully");

        simulateStep("Step 10: Starting HDFS services...");
        simulateStep("NameNode started");
        simulateStep("DataNode started");

        simulateStep("Step 11: Verifying Hadoop installation...");
        simulateStep("Hadoop installation completed successfully!");

        System.out.println("--------------------------------------");
        System.out.println(" Hadoop is ready to use.");
        System.out.println("--------------------------------------");
    }

    public static void simulateStep(String message) throws InterruptedException {
        System.out.print(message);
        Thread.sleep(1000);

        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }

        System.out.println(" Done!");
    }
}