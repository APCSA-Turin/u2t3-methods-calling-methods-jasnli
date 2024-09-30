public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Dodge Ball", 5);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Lives left: " + game.getLives());
        System.out.println("Is game over? " + game.isGameOver());

        
        if (game.isGameOver()) {
            System.out.println("Game Over!");
        } else {
             System.out.println("----- TURN 1 -----");
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        System.out.println("Hit 8, 3");
        game.increaseScore(8);
        game.increaseScore(3);        
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());     
        System.out.println("Score: " + game.getScore());
        System.out.println("Checking for loss...");
        if (game.checkForLoss()) {
            System.out.println("Life lost..."); 
            game.minusLife();
            System.out.println("Lives left: " + game.getLives());
            System.out.println("Score: " + game.getScore());
        } else {
            System.out.println("Still alive!"); 
        }
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());     
  
        }
       

        if (game.isGameOver()) {
            System.out.println("Game Over!");
        } else {
             System.out.println("----- TURN 2 -----");
        System.out.println("Lives left: " + game.getLives());
        System.out.println("Is game over? " + game.isGameOver());
        System.out.println("Hit 1, 4");
        game.increaseScore(1);
        game.increaseScore(4); 
        System.out.println("Checking for loss...");
        if (game.checkForLoss()) {
            System.out.println("Life lost..."); 
            game.minusLife();
            System.out.println("Lives left: " + game.getLives());
            System.out.println("Score: " + game.getScore());
        } else {
            System.out.println("Still alive!"); 
            System.out.println("Score: " + game.getScore());
        }
        }
       

        
        if (game.isGameOver()) {
            System.out.println("Game Over!");
        } else {
             System.out.println("----- TURN 3 -----");
        System.out.println("Hit 7");
        game.increaseScore(7);      
        System.out.println("Score: " + game.getScore());
        System.out.println("Lives left: " + game.getLives()); 
        System.out.println("Checking for loss...");
        if (game.checkForLoss()) {
            System.out.println("Life lost..."); 
            game.minusLife();
            System.out.println("Lives left: " + game.getLives());
            System.out.println("Score: " + game.getScore());
        } else {
            System.out.println("Still alive!"); 
            System.out.println("Score: " + game.getScore());
        }
        }
       

        if (game.isGameOver()) {
            System.out.println("Game Over!");
        } else {
          System.out.println("----- TURN 4 -----");
        System.out.println("Lives left: " + game.getLives());
        System.out.println("Is game over? " + game.isGameOver());
        System.out.println("Hit 8, 2");
        game.increaseScore(8);
        game.increaseScore(2); 
        System.out.println("Checking for loss...");
        if (game.checkForLoss()) {
            System.out.println("Life lost..."); 
            game.minusLife();
            System.out.println("Lives left: " + game.getLives());
            System.out.println("Score: " + game.getScore());
        } else {
            System.out.println("Still alive!"); 
            System.out.println("Score: " + game.getScore());
        }  
        }
        

      
        if (game.isGameOver()) {
            System.out.println("Game Over!");
        } else {
          System.out.println("----- TURN 5 -----");
        System.out.println("Lives left: " + game.getLives());
        System.out.println("Is game over? " + game.isGameOver());
        System.out.println("Hit 7, 10");
        game.increaseScore(7);
        game.increaseScore(10); 
        System.out.println("Checking for loss...");
        if (game.checkForLoss()) {
            System.out.println("Life lost..."); 
            game.minusLife();
            System.out.println("Lives left: " + game.getLives());
            System.out.println("Score: " + game.getScore());
        } else {
            System.out.println("Still alive!"); 
            System.out.println("Score: " + game.getScore());
        }  
        }
  
        if (game.isGameOver()) {
            System.out.println("Game Over!");
        } else {
          System.out.println("----- TURN 6 -----");
        System.out.println("Lives left: " + game.getLives());
        System.out.println("Is game over? " + game.isGameOver());
        System.out.println("Hit 7, 10");
        game.increaseScore(7);
        game.increaseScore(10); 
        System.out.println("Checking for loss...");
        if (game.checkForLoss()) {
            System.out.println("Life lost..."); 
            game.minusLife();
            System.out.println("Lives left: " + game.getLives());
            System.out.println("Score: " + game.getScore());
        } else {
            System.out.println("Still alive!"); 
            System.out.println("Score: " + game.getScore());
        }  
        }

    }
}
