package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
         Printer.print(cats);
        System.out.println("Sort by breed cats: ");
        cats.sort(Cat::byBreed);
        Printer.print(cats);
        System.out.println("Sort by name and age of cats: ");
        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
        Printer.print(cats);
        System.out.println("Removed gray: ");
        cats.removeIf(cat -> cat.getColor().equals("GRAY"));
        Printer.print(cats);
        System.out.println("Removed from the list of all cats, whose name length is 5: ");
        for (List<Cat> list :Arrays.asList(cats)) {
            list.removeIf(cat -> cat.getName().length()==5);
            Printer.print(cats);
        }
        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
    }


}
