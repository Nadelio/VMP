import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame implements KeyListener, ActionListener
{
    private void init(Main frame) // add display area for the ship
    {
        JTextField typingArea;
        typingArea = new JTextField();
        typingArea.addKeyListener(this);
         
        frame.getContentPane().add(typingArea, BorderLayout.PAGE_START);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        System.out.println(e.getKeyCode());
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e.getActionCommand());
    }

    public static void main(String [] args) throws InterruptedException
    {
        int[] size = {1000, 1000};
        int[] origin = {500, 500};

        Main frame = new Main();
        canvas space = new canvas(size, origin, Color.WHITE, Color.BLACK);

        frame.setSize(space.size[0], space.size[1]);
        frame.setVisible(true);
        frame.getContentPane().setBackground(space.backgroundColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Graphics graphics = frame.getGraphics();

        // add various functions here
        Ship ship = new Ship(origin[0], origin[1], 100); // 10 is the side length of the ship/triangle

        Draw.makeShip(ship, space, graphics);
        
        frame.init(frame);
        frame.pack();
        
        /*
        for(int i = 10; i > 0; i--)
        {
            Thread.sleep(225);
            frame.update(graphics);
            Draw.moveLeft(ship, 50, 25, space, graphics);
        }
        */
    }
}
