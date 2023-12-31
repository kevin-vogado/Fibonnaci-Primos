package fibonaccii;

import javax.swing.JOptionPane;

public class Fibonaccii {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        for (int i = 0; i < n; i++) {
            System.out.print("(" + i + "):" + Fibonaccii.formula(i) + "\t");
        }

    }

    static long formula(int n) {
        if (n < 2) {
            return n;
        } else {
            return formula(n - 1) + formula(n - 2);
        }
    }
}
