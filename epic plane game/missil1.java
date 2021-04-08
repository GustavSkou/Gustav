import greenfoot.*;

public class missil1 extends Actor
{
    public void act()
    {
        Actor jet2;
        Actor missil1;
        jet2 = getOneObjectAtOffset(0, 0, jet2.class);
        missil1 = getOneObjectAtOffset(0, 0, missil1.class);
        
        //død
        if (missil1 != jet2)
        {
            World world;
            world = getWorld();
            world.removeObject(jet2);
            world.removeObject(missil1); // virker ikke
            BigBoom boom = new BigBoom();
            world.addObject(boom, getX(), getY());
            Greenfoot.stop();
        }
        else
        {
            move(20);
        }
        
        //fjernes og erstattes ved edgen med "Boom"
        if (isAtEdge())
        {
            Boom boom = new Boom();
            getWorld().addObject(boom, getX(), getY());
            getWorld().removeObject(this);
        }
    }   
}