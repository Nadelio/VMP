import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class Main extends JFrame implements KeyListener
{
    public static int[] size = {1000, 1000};
    public static int[] origin = {500, 500};

    public static Main frame;
    public static canvas space;
    public static Ship ship;
    public static ShipPanel shipPanel;

    public static void main(String[] args) throws InterruptedException
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
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

    private static void createGUI()
    {
        // Create and set up the window.
        frame = new Main();
        space = new canvas(size, origin, Color.WHITE, Color.BLACK);

        frame.setSize(space.size[0], space.size[1]);
        frame.setVisible(true);
        frame.getContentPane().setBackground(space.backgroundColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new Main());

        ship = new Ship(origin[0], origin[1], 50); // a is the side length of the ship/triangle

        shipPanel = new ShipPanel(ship, space);
        shipPanel.setBackground(space.backgroundColor);
        frame.add(shipPanel);
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == 38)
        {
            Draw.moveUp(ship, 50, 25, shipPanel);
        }
        else if(e.getKeyCode() == 39)
        {
            Draw.moveRight(ship, 50, 25, shipPanel);
        }
        else if(e.getKeyCode() == 37)
        {
            Draw.moveLeft(ship, 50, 25, shipPanel);
        }
        else if(e.getKeyCode() == 40)
        {
            Draw.moveDown(ship, 50, 25, shipPanel);
        }
    }
}
