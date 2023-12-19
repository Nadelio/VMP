import java.awt.*;

public class Draw
{
    public static void moveLeft(Ship ship, int dist, canvas space, Graphics g)
    {
        int[] shipPos = ship.getPos();
        ship.changePos(shipPos[0] - dist, shipPos[1]);
        ship.updatePoints(dist)
        makeShip(ship, space, g);
    }

    public static void moveRight(Ship ship, int dist, canvas space, Graphics g)
    {
        int[] shipPos = ship.getPos();
        ship.changePos(shipPos[0] + dist, shipPos[1]);
        ship.updatePoints(dist);
        makeShip(ship, space, g);
    }

    public static void moveUp(Ship ship, int dist, canvas space, Graphics g)
    {
        int[] shipPos = ship.getPos();
        ship.changePos(shipPos[0], shipPos[1] + dist);
        ship.updatePoints(dist);
        makeShip(ship, space, g);
    }

    public static void moveDown(Ship ship, int dist, canvas space, Graphics g)
    {
        int[] shipPos = ship.getPos();
        ship.changePos(shipPos[0], shipPos[1] - dist);
        ship.updatePoints(dist);
        makeShip(ship, space, g);
    }

    public static void makeShip(Ship ship, canvas space, Graphics g)
    {
        Color color = space.paintColor;

        int[] shipTopPos = ship.getShipTop();
        int[] shipLeftPos = ship.getShipLeft();
        int[] shipRightPos = ship.getShipRight();

        int[] x = {shipTopPos[0], shipLeftPos[0], shipRightPos[0]};
        int[] y = {shipTopPos[1], shipLeftPos[1], shipRightPos[1]};

        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setColor(color);

        System.out.println(ship);
        System.out.println(space);

        g2d.drawPolygon(x, y, 3);
    }
}
