import java.awt.Graphics;
import javax.swing.JPanel;

public class ShipPanel extends JPanel // Credit to tinybluesapling on the Nico Is Lost discord ---> Github page: https://github.com/TinyBlueSapling
{
    private Ship ship;
    private canvas space;

    public ShipPanel(Ship ship, canvas space)
    {
        this.ship = ship;
        this.space = space;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Draw.makeShip(ship, space, g);
    }
}