package exoCalculatrice;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator multiplie = (a,b) -> a*b ;
        Calculator divise = (a,b) -> a/b ;
        Calculator additionne = (a,b) -> a+b ;
        Calculator soustrait = (a,b) -> a-b ;

    double reponse=0;
    int choix = 12;
    double Ra,Rb;
        System.out.println("Bonjour, merci de faire votre choix : ");
        while(choix!=0){

            System.out.println("1. Multiplication.\n" +
                    "2. Division.\n" +
                    "3. Addition.\n" +
                    "4. Soustraction.\n" +
                    "0. Sortir de ce super programme.");
            choix = sc.nextInt();
            sc.nextLine();

            switch(choix){
                case 1->{
                    System.out.println("Entrez la première valeur : ");
                    Ra=sc.nextDouble();
                    System.out.println("Entrez la deuxième valeur : ");
                    Rb=sc.nextDouble();
                    sc.nextLine();
                    reponse = multiplie.calculate(Ra,Rb);
                    System.out.println(Ra + " x " + Rb + " = " + reponse);
                }
                case 2->{
                    System.out.println("Entrez la première valeur : ");
                    Ra=sc.nextDouble();
                    System.out.println("Entrez la deuxième valeur : ");
                    Rb=sc.nextDouble();
                    sc.nextLine();
                    while(Rb==0){
                        System.out.println("Tu va réecrire la 2eme varibla sinon je te defonce");
                        Rb=sc.nextDouble();
                        sc.nextLine();
                    }
                    reponse = divise.calculate(Ra,Rb);
                    System.out.println(Ra + " / " + Rb + " = " + reponse);
                }
                case 3->{
                    System.out.println("Entrez la première valeur : ");
                    Ra=sc.nextDouble();
                    System.out.println("Entrez la deuxième valeur : ");
                    Rb=sc.nextDouble();
                    sc.nextLine();
                    reponse = additionne.calculate(Ra,Rb);
                    System.out.println(Ra + " + " + Rb + " = " + reponse);
                }
                case 4->{
                    System.out.println("Entrez la première valeur : ");
                    Ra=sc.nextDouble();
                    System.out.println("Entrez la deuxième valeur : ");
                    Rb=sc.nextDouble();
                    sc.nextLine();
                    reponse = soustrait.calculate(Ra,Rb);
                    System.out.println(Ra + " - " + Rb + " = " + reponse);
                }
                default ->{
                    if (choix!=0){
                        System.out.println("nique ta grand mère.");
                    }else{
                        System.out.println("Au revoir.");
                    }

                }
            }
        }

sc.close();
    }
}
