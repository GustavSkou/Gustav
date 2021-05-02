import greenfoot.*;

public class Cooldown
{
    //cooldown vars missil
    private long timePressed = 0;
    
    public boolean Cooldownmissil()
    {
        {
            //cooldown
            final long cooldownTime = 1500;
            long time = System.currentTimeMillis();
            if (time > timePressed + cooldownTime)
            { 
                timePressed = time;
                return true;
            }
            else
            {
                return false; //Cooldown in progress
            }
        }
    }
}