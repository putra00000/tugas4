public class Soal6 {
    public static void main(String[] args) {
        int n = 9;
        int[] sequence = new int[n];
        
        sequence[0] = 1; 
        sequence[1] = 1; 
        
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2] + (i > 2 ? sequence[i - 3] : 0);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}
