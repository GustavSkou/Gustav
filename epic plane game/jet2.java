import greenfoot.*;

public class jet2 extends Actor
{
    //cooldown vars
    private boolean readEnter = true;
    private Cooldown myCooldownmissil;
    
    public jet2()
    {
        myCooldownmissil = new Cooldown(); //Tilføjet cooldown til jet2
    }
    
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
            if(myCooldownmissil.Cooldownmissil())//Cooldown bliver taget i brug
            {
                missil2(); //Missil affyrings mekanisme bliver sat igang
            }
            readEnter = false;   
        }
    }
    
    //skyd missil
    private void missil2()
    {
        missil2 missil2 = new missil2();
        getWorld().addObject(missil2, getX(), getY());
        missil2.setRotation(getRotation());
        missil2.move(60);           
    }
}
    



