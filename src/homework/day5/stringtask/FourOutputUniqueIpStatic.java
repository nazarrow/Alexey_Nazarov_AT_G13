package homework.day5.stringtask;

public class FourOutputUniqueIpStatic {

    public static void outputListUniqueIp(String logText) {

        String[] lines = logText.split("\n");

        String[] ipAddresses = new String[lines.length];
        int[] okCounts = new int[lines.length];
        int[] failedCounts = new int[lines.length];
        int uniqueCount = 0;

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];

            String[] parts = line.split(" ");
            String currentIp = parts[parts.length - 2];
            String status = parts[parts.length - 1];

            boolean ipExists = false;
            int existingIndex = -1;

            for (int j = 0; j < uniqueCount; j++) {
                if (ipAddresses[j] != null && ipAddresses[j].equals(currentIp)) {
                    ipExists = true;
                    existingIndex = j;
                    break;
                }
            }

            if (ipExists) {

                if (status.equals("granted")) {
                    okCounts[existingIndex]++;
                } else if (status.equals("denied")) {
                    failedCounts[existingIndex]++;
                }
            } else {

                ipAddresses[uniqueCount] = currentIp;
                if (status.equals("granted")) {
                    okCounts[uniqueCount] = 1;
                    failedCounts[uniqueCount] = 0;
                } else if (status.equals("denied")) {
                    okCounts[uniqueCount] = 0;
                    failedCounts[uniqueCount] = 1;
                }
                uniqueCount++;
            }
        }

        System.out.println("Результаты анализа лога:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println("ip " + ipAddresses[i] + ": ok - " + okCounts[i] + ", failed - " + failedCounts[i]);
        }
    }
}
