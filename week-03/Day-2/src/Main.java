

import java.util.ArrayList;
import java.util.List;


public class Main {
  public static void main(String[] args) {
//   PostIt excercise
    PostIt post1 = new PostIt();
    post1.backgroundColor = "orange";
    post1.text = "Idea 1 ";
    post1.textColor = "blue";

//    Blogpost excercise
    BlogPost blog1 = new BlogPost("Lorem Ipsum", "John Doe");
    blog1.publicationDate = "2000/05/04";
    System.out.println(blog1.text);

//    Animal
    Animal dog = new Animal();
    dog.drink();
    dog.eat();
    System.out.println(dog.thirst + " " + dog.hunger);
    dog.play();
    System.out.println(dog.thirst + " " + dog.hunger);

//    Sharpie
    Sharpie pen = new Sharpie();
    pen.color = "red";
    pen.widh = 0.5F;
    System.out.println(pen.inkAmount + ", " + pen.widh + ", " + pen.color);
    pen.use();
    System.out.println(pen.inkAmount);

//    Pokemon
    List<Pokemon> pokemonOfAsh = initializePokemons();
    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");
    for (int i = 0; i < pokemonOfAsh.size() - 1; i++) {
      if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)) {
        System.out.println("I choose you, " + pokemonOfAsh.get(i).name);
      }
    }
//    Fleet
    Thing task1 = new Thing("Get milk");
    Thing task2 = new Thing("Remove obstacles");
    Thing task3 = new Thing("Stand up");
    Thing task4 = new Thing("Eat lunch");
    task3.complete();
    task4.complete();

    Fleet things = new Fleet();
    things.add(task1);
    things.add(task2);
    things.add(task3);
    things.add(task4);
    System.out.println(things);


   /* DiceSet newset = new DiceSet();
    newset.roll();
    System.out.println(newset.getCurrent());
    newset.reroll();

    */
  }

    private static List<Pokemon> initializePokemons () {
      List<Pokemon> pokemon = new ArrayList<>();

      pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
      pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
      pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
      pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
      pokemon.add(new Pokemon("Kingler", "water", "fire"));

      return pokemon;
    }

  }



