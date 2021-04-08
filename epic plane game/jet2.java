import greenfoot.*;

public class jet2 extends Actor
{
    private boolean readEnter = true;
    
    public void act()
    {
        move(4);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(2);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(9);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-4);
        }
        
        if(!readEnter && !Greenfoot.isKeyDown("enter"))
            readEnter = true;
        
        if(Greenfoot.isKeyDown("enter") && readEnter)
        {
            fire2();
            readEnter = false;
        }
    }
    
    //skyd missil
    public void fire2()
    {
        missil2 missil2 = new missil2();
        getWorld().addObject(missil2, getX(), getY());
        missil2.setRotation(getRotation());
        missil2.move(60);
    }
    
    /*
    public void death()
    {
        Actor jet2;
        Actor missil1;
        jet2 = getOneObjectAtOffset(0, 0, jet2.class);
        missil1 = getOneObjectAtOffset(0, 0, missil1.class);
        
        if (missil1 != jet2)
        {
            turn(4);
            move(3);
        }
    }
    */
}  
    

