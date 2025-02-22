package org.example.Tic_Tac_Toe;

import org.example.Tic_Tac_Toe.Builder.Game;
import org.example.Tic_Tac_Toe.bridge.*;
import org.example.Tic_Tac_Toe.composite.Directory;
import org.example.Tic_Tac_Toe.composite.File;
import org.example.Tic_Tac_Toe.composite.FileSystem;
import org.example.Tic_Tac_Toe.decorator.BasePizza;
import org.example.Tic_Tac_Toe.decorator.CheeseToppings;
import org.example.Tic_Tac_Toe.decorator.FarmHouse;
import org.example.Tic_Tac_Toe.decorator.PaneerToping;
import org.example.Tic_Tac_Toe.mediator.Bidder;
import org.example.Tic_Tac_Toe.mediator.Collegue;
import org.example.Tic_Tac_Toe.mediator.Mediator;
import org.example.Tic_Tac_Toe.mediator.MediatorImp;
import org.example.Tic_Tac_Toe.multithreading.MonitorLocks;
import org.example.Tic_Tac_Toe.multithreading.PrintTask;
import org.example.Tic_Tac_Toe.multithreading.SharedResource;
import org.example.Tic_Tac_Toe.observable.IPhoneStockObservableImp;
import org.example.Tic_Tac_Toe.observable.StocksObservable;
import org.example.Tic_Tac_Toe.observer.MobileAlertObserver;
import org.example.Tic_Tac_Toe.observer.NotificationAlertObserver;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        StocksObservable iphoneObservable = new IPhoneStockObservableImp();
        NotificationAlertObserver obs1 = new MobileAlertObserver(iphoneObservable, "8218617166");
        iphoneObservable.addObserver(obs1);
        iphoneObservable.setStock(10);

        //Decorator
        BasePizza pizza = new FarmHouse();
        BasePizza withCheese = new CheeseToppings(pizza);
        BasePizza withCheeseAndPaneer = new PaneerToping(withCheese);
        System.out.println("normal" + " " + pizza.getCost() + " " + withCheeseAndPaneer.getCost() + " " + withCheese.getCost());

        //threading
        MonitorLocks obj = new MonitorLocks();
        Thread t1 = new Thread(() -> {
            try {
                obj.task1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(() -> {obj.task3();});
        t1.start();
        t2.start();
        t3.start();
//
        SharedResource str = new SharedResource();
//        Thread produce = new Thread(() -> {str.produce();});
//        Thread consume = new Thread(() -> {str.consume();});
//        produce.start();
//        consume.start();

        // composite
        Directory directory = new Directory("movies");
        Directory diretory1 = new Directory("Bollowod");
        File file = new File("Sholay");
        directory.addFileSystem(diretory1);
        diretory1.addFileSystem(file);
        directory.ls();

        // streams
        int [] arr = new int[]{1,2,3,4,5,6,7};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> result =  list.stream().filter((ele) -> ele > 3).collect(Collectors.toList());
        System.out.println(result);

        Game game = new Game.GameBuilder().setGameName("dnjd").setNoOfPlayers(4).setNoOfTurns(2).build();
        System.out.println(game.getGameName());

        PrintTask printer = new PrintTask();
        Thread t5 = new Thread(printer::printOdd, "OddThread");
        Thread t6 = new Thread(printer::printEven, "EvenThread");

        t5.start();
        t6.start();

        //Mediator Design Pattern
        Mediator mediator = new MediatorImp();
        Collegue bidder1 = new Bidder(mediator, "lakshy");
        Collegue bidder2 = new Bidder(mediator, "Arun");

        bidder1.placeBid(1000);
        bidder2.placeBid(2000);

        //Bridge Design Pattern
        MoveLogic walk = new Walk();
        MoveLogic fly = new Fly();
        Animal human = new Human(walk);
        Animal Bird = new Bird(fly);
        human.move();
        fly.move();
    }
}