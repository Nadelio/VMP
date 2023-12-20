import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Main extends JFrame implements KeyListener, ActionListener {

    public static int[] size = { 1000, 1000 };
    public static int[] origin = { 500, 500 };

    public static void main(String[] args) throws InterruptedException {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }

    private static void createGUI() {
        Main frame = new Main();
        canvas space = new canvas(size, origin, Color.WHITE, Color.BLACK);

        frame.setSize(space.size[0], space.size[1]);
        frame.setVisible(true);
        frame.getContentPane().setBackground(space.backgroundColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new Main());

        Graphics graphics = frame.getGraphics();

        // add various functions here
        Ship ship = new Ship(origin[0], origin[1], 100); // 10 is the side length of the ship/triangle

        Draw.makeShip(ship, space, graphics);

        /*
         * for(int i = 10; i > 0; i--)
         * {
         * Thread.sleep(225);
         * frame.update(graphics);
         * Draw.moveLeft(ship, 50, 25, space, graphics);
         * }
         */
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
