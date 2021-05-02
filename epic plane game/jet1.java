import greenfoot.*;

public class jet1 extends Actor
{
    //cooldown vars
    private boolean readEnter = true;
    private Cooldown myCooldownmissil;
    
    
    public jet1()
    {
        myCooldownmissil = new Cooldown(); //Tilføjet cooldown til jet1
    }
    
    public void act()
    {
        move(4);
        
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(2);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            move(6);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-4);
        }
        
        if ("space".equals(Greenfoot.getKey()))
        {
            if(myCooldownmissil.Cooldownmissil()) //Cooldown bliver taget i brug
            {
                missil1(); //Missil affyrings mekanisme bliver sat igang
            }
        }
    }
    
    //skyd missil
    public void missil1()
    {
        missil1 missil1 = new missil1();
        getWorld().addObject(missil1, getX(), getY());
        missil1.setRotation(getRotation());
        missil1.move(60);
    }
}
 

