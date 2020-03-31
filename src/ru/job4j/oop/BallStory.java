package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Ball ball = new Ball();

        wolf.tryEat(ball);
        ball.run(wolf);
        hare.tryEat(ball);
        ball.run(hare);
        fox.tryEat(ball);
        fox.eating(ball);

    }
}