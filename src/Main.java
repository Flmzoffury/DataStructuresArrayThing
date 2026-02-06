public class Main
{
    //the extends keyword gives you access just to the PUBLIC interface of the superclass but not the private stuff

    public static void main(String[] args)
    {
        Charmander james = new Charmander();
        james.setName("James");
        Squirtle ron = new Squirtle();
        ron.setName("Ron");
        Bulbasaur mike = new Bulbasaur();
        mike.setName("Mike");

        PokemonBattleArena.battle(james, ron);


    }
}
