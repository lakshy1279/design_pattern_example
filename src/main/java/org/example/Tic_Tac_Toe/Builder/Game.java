package org.example.Tic_Tac_Toe.Builder;


// Use the Builder pattern to get rid of a “telescoping constructor”.
//Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
//Use the Builder to construct Composite trees or other complex objects.
public class Game {
    private String gameName;
    private int noOfPlayers;
    private int noOfTurns;

    private Game(GameBuilder builder) {
        this.gameName = builder.gameName;
        this.noOfPlayers = builder.noOfPlayers;
        this.noOfTurns = builder.noOfTurns;
    }

    public String getGameName() {
        return gameName;
    }
    public static class GameBuilder {
        private String gameName;
        private int noOfPlayers;
        private int noOfTurns;

        public GameBuilder setGameName(String gameName) {
            this.gameName = gameName;
            return this;
        }
        public GameBuilder setNoOfPlayers(int noOfPlayers) {
            this.noOfPlayers = noOfPlayers;
            return this;
        }
        public GameBuilder setNoOfTurns(int noOfTurns) {
            this.noOfTurns = noOfTurns;
            return this;
        }
        public Game build() {
            Game game = new Game(this);
            return game;
        }
    }
}
