package Main;

import javax.swing.*;

public class Main {
    static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Loot2d");

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
class guy {
    double x;
    double y;
    guy(double x, double y) {
        this.x = x;
    }

}