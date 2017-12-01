package fantasticworlds.worldserver.character;

public class Stat
{
    private int level;
    private int experience;
    private int needed;
    
    public int getLevel() { return level; }
    public int getExperience() { return experience; }
    public int getNeeded() { return needed; }
    
    public void awardExperience(int award)
    {
        experience += award;
        while(experience >= needed)
        {
            level++;
            experience -= needed;
        }
    }
    
    public Stat()
    {
        level = 0;
        experience = 0;
        needed = 1000;
    }
    
    //for loading from file
    public Stat(int level, int experience, int needed)
    {
        this.level = level;
        this.experience = experience;
        this.needed = needed;
    }
}