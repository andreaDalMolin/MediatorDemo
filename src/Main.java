import mediator.HomeMediator;
import mediator.Mediator;
import sensors.LightSensor;
import sensors.MotionSensor;
import sensors.Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Mediator mediator = new HomeMediator();
        LightSensor lightSensor = new LightSensor(mediator);
        MotionSensor motionSensor = new MotionSensor(mediator);
        Switch mySwitch = new Switch(mediator);

        String userChoice = "";

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("----------------T--O--M--M--A--X--A--N--D------S--Y--S--T--E--M--S----------------");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Bienvenue dans le système de gestion de lampe intélligentes !");

        while (!userChoice.equalsIgnoreCase("exit")) {
            System.out.println("Pour tester vos capteurs, entrez le chiffre corréspondant");
            System.out.println("1 - Capteur de lumière");
            System.out.println("2 - Capteur de mouvement");
            System.out.println("3 - Intérrupteur cuisine");
            System.out.print("Votre choix: ");
            userChoice = new Scanner(System.in).nextLine();

            if (userChoice.equalsIgnoreCase("1")) {
                lightSensor.toggle();
            } else if (userChoice.equalsIgnoreCase("2")) {
                motionSensor.toggle();
            } else if (userChoice.equalsIgnoreCase("3")) {
                mySwitch.toggle();
            }

            System.out.println("\n");
            Thread.sleep(1000);
        }
    }
}