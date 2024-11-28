import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends JFrame {
    private JLabel timeLabel;
    private Timer timer;

    public Main() {
        setTitle("Digital Clock");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        timeLabel = new JLabel();
        timeLabel.setVisible(true);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        timeLabel.setBackground(Color.CYAN);
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(timeLabel, BorderLayout.CENTER);


        timer = new Timer(1000, e -> updateTime());
        timer.start();


        updateTime();
    }

    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        timeLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main clock = new Main();
            clock.setVisible(true);
        });
    }
}