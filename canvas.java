import java.awt.Color;

public class canvas
{
    public int[] size = new int[2];
    public int[] origin = new int[2];
    public Color paintColor;
    public Color backgroundColor;

    public canvas(int[] size, int[] origin, Color paintColor, Color backgroundColor)
    {
        this.size = size; // x,y
        this.origin = origin; // x,y
        this.paintColor = paintColor;
        this.backgroundColor = backgroundColor;
    }

    public String toString(){return "Size: " + size[0] + ", " + size[1] + " | Origin: " + origin[0] + ", " + origin[1] + " | Paint Color: " + paintColor + " | Background Color: " + backgroundColor;}
}