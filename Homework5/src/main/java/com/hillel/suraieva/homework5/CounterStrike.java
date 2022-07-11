package com.hillel.suraieva.homework5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        System.out.println("Введите имя первой команды:");
        Scanner scanner = new Scanner(System.in);
        String nameTeam1 = scanner.next();
        System.out.println("Введите колличество фрагов для пятерых игроков команды: ");
        int frag11 = proverka();
        int frag12 = proverka();
        int frag13 = proverka();
        int frag14 = proverka();
        int frag15 = proverka();
        int result1 = frag11 + frag12 + frag13 + frag14 + frag15;

        System.out.println("Введите имя второй команды:");
        String nameTeam2 = scanner.next();
        System.out.println("Введите колличество фрагов для пятерых игроков: ");
        int frag21 = proverka();
        int frag22 = proverka();
        int frag23 = proverka();
        int frag24 = proverka();
        int frag25 = proverka();
        int result2 = frag21 + frag22 + frag23 + frag24 + frag25;

        double sredneeTeam1 = (double) result1 / 5;
        double sredneeTeam2 = (double) result2 / 5;

        if (sredneeTeam1 > sredneeTeam2) {
            System.out.println("Победила команда " + nameTeam1 + " набравшая " + result1 + " очков");
        } else if (sredneeTeam1 < sredneeTeam2) {
            System.out.println("Победила команда " + nameTeam2 + " набравшая " + result2 + " очков");
        } else {
            System.out.println("Между командами ничья со счетом " + result1 + " очков");
        }


    }

    static int proverka() {
        Scanner scanner = new Scanner(System.in);

        int frag = 0;
        if (scanner.hasNextInt()) {
           frag = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Try again");
            System.exit(0);
            scanner.next();
        }
        return frag;
    }
}
