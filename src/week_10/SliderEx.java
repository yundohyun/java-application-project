package week_10;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {

    public SliderEx() {
        this.setTitle("Slider Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JLabel colorLabel = new JLabel(" SLIDER EXAMPLE ");
        JSlider[] sliders = new JSlider[3];

        for (int i = 0; i < sliders.length; i++) {
            sliders[i] = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
            sliders[i].setPaintTicks(true);
            sliders[i].setPaintLabels(true);
            sliders[i].setPaintTrack(true);
            sliders[i].setMajorTickSpacing(50);
            sliders[i].setMinorTickSpacing(10);
            sliders[i].addChangeListener(e -> {
                int r = sliders[0].getValue();
                int g = sliders[1].getValue();
                int b = sliders[2].getValue();
                colorLabel.setBackground(new Color(r,g,b));
            });
            this.add(sliders[i]);
        }
        sliders[0].setForeground(Color.RED);
        sliders[1].setForeground(Color.GREEN);
        sliders[2].setForeground(Color.BLUE);

        JButton ok = new JButton("확인");
        ok.addActionListener(e -> {
            int r = sliders[0].getValue();
            int g = sliders[1].getValue();
            int b = sliders[2].getValue();
            colorLabel.setOpaque(true);
            colorLabel.setBackground(new Color(r,g,b));
        });

        int r = sliders[0].getValue();
        int g = sliders[1].getValue();
        int b = sliders[2].getValue();
        colorLabel.setOpaque(true);
        colorLabel.setBackground(new Color(r,g,b));

        this.add(colorLabel);
        this.add(ok);

        this.setSize(300, 250);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SliderEx();
    }
}
