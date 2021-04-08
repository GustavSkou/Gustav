import greenfoot.*;

public class SandWorld extends World
{
    /**
     * laver verden 
     */
    public SandWorld()
    {    
        super(900, 900, 1); 
        spawn();
    }

    /**
     * Objecterne laves og indsættes i verden
     */
    private void spawn()
    {
        jet1 jet1 = new jet1();
        addObject(jet1,174,170);
        jet2 jet2 = new jet2();
        addObject(jet2,700,700);
        jet2.turn(180);
    }
}