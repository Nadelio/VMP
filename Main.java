import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Main
{
    public static void main(String [] args) throws InterruptedException
    {
        int[] size = {1000, 1000};
        int[] origin = {500, 500};

        JFrame frame = new JFrame();
        canvas space = new canvas(size, origin, Color.WHITE, Color.BLACK);

        frame.setSize(space.size[0], space.size[1]);
        frame.setVisible(true);
        frame.getContentPane().setBackground(space.backgroundColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Graphics graphics = frame.getGraphics();

        // add various functions here
        Ship ship = new Ship(origin[0], origin[1], 100); // 10 is the side length of the ship/triangle

        Draw.makeShip(ship, space, graphics);

        Thread.sleep(1000);
        frame.update(graphics);
        Thread.sleep(1000);
        
        Draw.moveLeft(ship, 250, space, graphics);
    }
}
