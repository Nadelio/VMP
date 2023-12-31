public class Ship
{
    private int[] pos = new int[2]; // {x, y} // this is the centerpoint
    private int[] shipTop = new int[2]; // {x, y}
    private int[] shipLeft = new int[2]; // {x, y}
    private int[] shipRight = new int[2]; // {x, y}
    
    public Ship(int a)
    {
        this.pos[0] = 0; // x
        this.pos[1] = 0; // y
        updatePoints(a, 0, 0);
    }

    public Ship(int x, int y, int a) // a = side length
    {
        this.pos[0] = x;
        this.pos[1] = y;
        this.shipTop[0] = x;
        this.shipTop[1] = (int) (y + ((Math.sqrt(3)/3) * a));
        this.shipLeft[0] = (int) (x - (a/2));
        this.shipLeft[1] = (int) (y - ((Math.sqrt(3)/6) * a));
        this.shipRight[0] = (int) (x + (a/2));
        this.shipRight[1] = (int) (y - ((Math.sqrt(3)/6) * a));
    }

    public void changePos(int a, int x, int y)
    {
        this.pos[0] = x;
        this.pos[1] = y;
        updatePoints(a, x, y);
    }

    public void updatePoints(int a, int x, int y)
    {
        this.shipTop[0] = x;
        this.shipTop[1] = (int) (y + ((Math.sqrt(3)/3) * a));
        this.shipLeft[0] = (int) (x - (a/2));
        this.shipLeft[1] = (int) (y - ((Math.sqrt(3)/6) * a));
        this.shipRight[0] = (int) (x + (a/2));
        this.shipRight[1] = (int) (y - ((Math.sqrt(3)/6) * a));
    }
    
    public int[] getPos(){return pos;}
    public int[] getShipTop(){return shipTop;}
    public int[] getShipLeft(){return shipLeft;}
    public int[] getShipRight(){return shipRight;}

    public String toString(){return "Ship Position: (" + pos[0] + ", " + pos[1] + ")";}
}

