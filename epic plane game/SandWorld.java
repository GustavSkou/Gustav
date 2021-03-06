import greenfoot.*;

public class SandWorld extends World
{
    //================================================================================
    //  world generator
    //================================================================================
    public SandWorld()
    {    
        super(1600, 900, 1);
        spawn();
    }
    
    //================================================================================
    //  Number generator
    //================================================================================
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
        
    //================================================================================
    //  Spawn
    //================================================================================
    public void spawn()
    {
        //variabler til random spawn
        int x1 = getRandomNumber(100,1600/2-100);       //får en tilfældigt x-værdi mellem 100 og 700
        int y1 = getRandomNumber(100,900-100);          //får en tilfældigt y-værdi mellem 100 og 800        
        int x2 = getRandomNumber(1600/2+100,1600-100);  //får en tilfældigt x-værdi mellem 800 og 1500
        int y2 = getRandomNumber(100,900-100);          //får en tilfældigt y-værdi mellem 100 og 800     
        
        //spawn jet1
        jet1 jet1 = new jet1();
        addObject(jet1,x1,y1);      //indsætter jet1 
        
        //spawn jet2
        jet2 jet2 = new jet2();
        addObject(jet2,x2,y2);      //indsætter jet1 
        jet2.turn(180);             //vender jet2 180, så jet1 og jet2 vender mod hinanden
    }
}