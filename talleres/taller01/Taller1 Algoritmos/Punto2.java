public class Punto2
{
    private float x;
    private float y;

    public Punto2(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    public float radio(){
        return (float) Math.sqrt((x*x)+(y*y));
    
    }


    double angulo(){
        return (float) Math.atan2(x, y);
    }
}
