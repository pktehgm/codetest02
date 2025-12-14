package com.mg.codetest;

import com.mg.codetest.game.GameRunner;
import com.mg.codetest.game.GamingConsole;
import com.mg.codetest.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App03GamingSpringBeansJava {

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(App03GamingSpringBeansJava.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
