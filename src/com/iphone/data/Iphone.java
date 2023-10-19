package com.iphone.data;
import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;
        do {
            option = 3;

            int music = 5;
            int music1 = 5;

            int phone = 5;
            int phone1 = 5;

            int internet = 5;
            int internet1 = 5;

            int menu = 5;

            System.out.println(" Welcome to the brand new Iphone\n Here you can choose what app you want to go ");
            System.out.println("1. Ipod ");
            System.out.println("2. Internet ");
            System.out.println("3. Phone ");
            System.out.println("0. Turn off the device  ");
            option = input.nextShort();

            if (option == 0) {
                System.out.println("Turning off the Iphone!!!");
                break;
            } else if (option == 1) {
                System.out.println("You have entered the Ipod app ");
                System.out.println("Select a music: ");
                System.out.println("1. moonlight ");
                music = input.nextShort();
            }
            if (music == 1) {
                System.out.println("1. Play");
                System.out.println("2. Pause");
                music1 = input.nextShort();
            }
            if (music1 == 1) {
                System.out.println("Music is playing now!");
                System.out.println("1. Go to menu ");
                menu = input.nextShort();
            } else if ( music1 == 2) {
                System.out.println("Music has been paused!");
                System.out.println("1. Go to menu ");
                menu = input.nextShort();
            }
            if (option == 3) {
                System.out.println("You have entered the Phone app ");
                System.out.println("Select a person to call: ");
                System.out.println("1. mom ");
                System.out.println("2. father ");
                System.out.println("3. friend ");
                phone = input.nextShort();
            }
            if (phone == 1) {
                System.out.println("You are calling mom");
                System.out.println("1. Turn off the call ");
                phone1 = input.nextShort();
            } else if (phone == 2) {
                System.out.println("You are calling father");
                System.out.println("1. Turn off the call ");
                phone1 = input.nextShort();
            } else if (phone == 3) {
                System.out.println("You are calling friend");
                System.out.println("1. Turn off the call ");
                phone1 = input.nextShort();
            }
            if (phone1 == 1){
                System.out.println("The call has ended");
                System.out.println("1. Go to menu ");
                menu = input.nextShort();
            }
            if (option == 2) {
                System.out.println("You have entered the Internet app ");
                System.out.println("Select what you want to do: ");
                System.out.println("1. Open a new tab ");
                internet = input.nextShort();
            }
            if (internet == 1) {
                System.out.println("See the most famous sites: ");
                System.out.println("1. google.com ");
                System.out.println("2. youtube.com ");
                System.out.println("3. instagram.com ");
                internet1 = input.nextShort();
            }
            if (internet1 == 1) {
                System.out.println("You have entered the 'google.com' website ");
                System.out.println("1. Go to menu ");
                menu = input.nextShort();
            } else if (internet1 == 2) {
                System.out.println("You have entered the 'youtube.com' website ");
                System.out.println("1. Go to menu ");
                menu = input.nextShort();
            }else if (internet1 == 3) {
                System.out.println("You have entered the 'instagram.com' website ");
                System.out.println("1. Go to menu ");
                menu = input.nextShort();
            }
            if (menu == 1) {
                System.out.println(" Welcome to the brand new Iphone\n Here you can choose what app you want to go ");
                System.out.println("1. Ipod ");
                System.out.println("2. Internet ");
                System.out.println("3. Phone ");
                System.out.println("0. Turn off the device  ");
                option = input.nextShort();
            }
            else {
                throw new RuntimeException("Type a valid number!");
            }
        } while (option != 0);
    }
}
