import greenfoot.*;

public class missil2 extends Actor
{
    public void act()
    {
        Actor jet1;
        Actor missil2;
        jet1 = getOneObjectAtOffset(0, 0, jet1.class);
        missil2 = getOneObjectAtOffset(0, 0, missil2.class);
        /*
         * Når missilen rammer jeten fjernes denes og der kommer en explosion, og spillet stoppes 
         */
        if (missil2 != jet1)
        {
            World world;
            world = getWorld();
            world.removeObject(jet1);
            world.removeObject(missil2); // virker ikke
            BigBoom boom = new BigBoom();
            world.addObject(boom, getX(), getY());
            Greenfoot.stop();
        }
        else
        {
            move(20);
        }
        
        /*
         * Hvis missilen rammer kanten slettes den og erstattes med en explosion  
         */
        if (isAtEdge())
        {
            Boom boom = new Boom();
            getWorld().addObject(boom, getX(), getY());
            getWorld().removeObject(this);
        }
    }   
}