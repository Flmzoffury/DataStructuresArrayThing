public class Pokemon
{
    //Interfaces could have been useful in this case

    public int healthPoints;
    public String abilityName;
    public int abilityDamage;
    public String name;

    public Pokemon()
    {

    }

    public int getAbilityDamage()
    {
        return abilityDamage;
    }

    public String getAbilityName()
    {
        return abilityName;
    }

    public int getHealthPoints()
    {
        return healthPoints;
    }

    public String getName()
    {
        return name;
    }

    public void setHealthPoints(int inputHealthPoints)
    {
        healthPoints = inputHealthPoints;
    }

    public void setAbilityDamage(int inputAbilityDamage)
    {
        abilityDamage = inputAbilityDamage;
    }

    public void setAbilityName(String inputAbilityName)
    {
        abilityName = inputAbilityName;
    }

    public void setName(String inputName)
    {
        name = inputName;
    }

    public void attack(Pokemon inputPokemon)
    {

    }
}
