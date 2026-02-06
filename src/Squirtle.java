public class Squirtle extends Pokemon
{
    public Squirtle()
    {
        super.setHealthPoints(70);
        super.setAbilityName("Water Gun");
        super.setAbilityDamage(15);
        super.setName("Squirtle");
    }

    public void setName(String inputName)
    {
        super.setName(inputName);
    }

    public void attack(Pokemon inputPokemon)
    {
        inputPokemon.setHealthPoints(inputPokemon.getHealthPoints() - super.getAbilityDamage());
    }

}
