public class Bulbasaur extends Pokemon
{
    public Bulbasaur()
    {
        super.setHealthPoints(70);
        super.setAbilityName("LeechSeed");
        super.setAbilityDamage(20);
        super.setName("Bulbasaur");
    }

    public void setName(String inputName)
    {
        super.setName(inputName);
    }

    public void attack(Pokemon inputPokemon)
    {
        inputPokemon.setHealthPoints(inputPokemon.getHealthPoints() - super.getAbilityDamage());
        if (super.getHealthPoints() <= 50)
        {
            super.setHealthPoints(super.getHealthPoints() + 20);
        }
        else
        {
            super.setHealthPoints(70);
        }
    }

}
