import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class Main extends JFrame implements KeyListener
{
    public static int[] size = { 1000, 1000 };
    public static int[] origin = { 500, 500 };

    public static void main(String[] args) throws InterruptedException {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }

    //-------------------unused-------------------//
    @Override
    public void keyTyped(KeyEvent e){}

    @Override
    public void keyReleased(KeyEvent e){}
    //--------------------------------------------//

    private static void createGUI() {
        // Create and set up the window.
        Main frame = new Main();
        canvas space = new canvas(size, origin, Color.WHITE, Color.BLACK);

        frame.setSize(space.size[0], space.size[1]);
        frame.setVisible(true);
        frame.getContentPane().setBackground(space.backgroundColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new Main());

        Ship ship = new Ship(origin[0], origin[1], 100); // 10 is the side length of the ship/triangle

        ShipPanel shipPanel = new ShipPanel(ship, space);
        shipPanel.setBackground(space.backgroundColor);
        frame.add(shipPanel);

        for (int i = 4; i > 0; i--) {
            try
            {
                Thread.sleep(225);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            Draw.moveLeft(ship, 50, 25, shipPanel);
        }
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println(e.getKeyCode());
    }
}
