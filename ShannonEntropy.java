public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] counts = new int[m + 1]; // indices 1 to m
        int total = 0;
        
        // Read integers and count frequencies
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value >= 1 && value <= m) {
                counts[value]++;
                total++;
            }
        }
        
        double entropy = 0.0;
        for (int i = 1; i <= m; i++) {
            if (counts[i] == 0) continue;
            double p = (double) counts[i] / total;
            entropy -= p * (Math.log(p) / Math.log(2));
        }
        
        StdOut.printf("%.4f\n", entropy);
    }
}