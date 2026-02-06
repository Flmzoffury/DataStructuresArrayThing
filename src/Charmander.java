public class Charmander extends Pokemon
{
    public Charmander()
    {
        super.setHealthPoints(50);
        super.setAbilityDamage(10);
        super.setAbilityName("Scratch");
        super.setName("Charmander");
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
