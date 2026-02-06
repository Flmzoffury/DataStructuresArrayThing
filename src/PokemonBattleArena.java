import java.util.Random;
public class PokemonBattleArena {
    public static void battle(Pokemon inputPokemonOne, Pokemon inputPokemonTwo)
    {
        Random randGen = new Random();
        int turnNum;
        turnNum = randGen.nextInt(2);

        while (inputPokemonOne.getHealthPoints() > 0 && inputPokemonTwo.getHealthPoints() > 0)
        {
            if (turnNum == 0)
            {
                inputPokemonOne.attack(inputPokemonTwo);
                System.out.println(inputPokemonOne.getName() + " used " + inputPokemonOne.getAbilityName() + "!");
                System.out.println(inputPokemonTwo.getName() + " has " + inputPokemonTwo.getHealthPoints() + " health");
            }
            else if (turnNum == 1)
            {
                inputPokemonTwo.attack(inputPokemonOne);
                System.out.println(inputPokemonTwo.getName() + " used " + inputPokemonTwo.getAbilityName() + "!");
                System.out.println(inputPokemonOne.getName() + " has " + inputPokemonOne.getHealthPoints() + " health");
            }

            turnNum += 1;
            turnNum %= 2;

        }

        if (inputPokemonOne.getHealthPoints() <= 0)
        {
            System.out.println(inputPokemonTwo.getName() + " wins!");
        }
        else if (inputPokemonTwo.getHealthPoints() <= 0)
        {
            System.out.println(inputPokemonOne.getName() + " wins!");
        }

    }
}
