package exo4;

import java.util.List;
import java.util.Random;

public class Randomizer {
    public void RamdomizeGoodEvent(Personnage personnage, List<Evenement> evenements) {
        int randomgoodevent = (int) Math.round(Math.random() * (evenements.size()-1));
        Evenement bonevenement = evenements.get(randomgoodevent);
        System.out.println(bonevenement.toString());
        randomgoodevent = (int) Math.round(Math.random());
        if (randomgoodevent == 1) {
            System.out.println(bonevenement.getReussite());
        } else {
            System.out.println(bonevenement.getEchec());
        }
    }

    public void RamdomizeBadEvent(Personnage personnage, List<Evenement> evenement) {
        int randombadevent = (int) Math.round(Math.random() * (evenement.size()-1));
        System.out.println(randombadevent);
        Evenement mauvaisevenement = evenement.get(randombadevent);
        System.out.println(mauvaisevenement.toString());
        randombadevent = (int) Math.round(Math.random());
        if (randombadevent == 1) {
            System.out.println(mauvaisevenement.getReussite());
        } else {
            System.out.println(mauvaisevenement.getEchec());
        }
    }

    public void RamdomizeBattle(Personnage personnage, List<Demon> demons) {
        int randomDemon = (int) Math.round(Math.random() * demons.size());
        Demon demon = demons.get(randomDemon);
        System.out.println("Un démon apparaît : \n" + demon.toString());
        long originalHP = demon.getHp();
        int originalATQ = demon.getForce();
        while(personnage.getPV()>0&&demon.getHp()>0){
         demon.subis(personnage.getATQ());
         if(demon.getHp()>0){
             personnage.perdPV(demon.attaque());
         }
        }
        if(personnage.getPV()<=0){
            System.out.println(personnage.getNom()+" est mort au combat.");
        }else{
            System.out.println(personnage.getNom()+" a tué "+ demon.getName()+".");
        }
        demon.setHp(originalHP);
        demon.setForce(originalATQ);
    }



    public void Ramdomize(Personnage personnage, List<Evenement> bonevenement,
                          List<Evenement> mauvaisevenement, List<Demon> demons, int max) {
        int originalHP = personnage.getPV();
        int originalATQ = personnage.getATQ();
        for(int i=0; i<max; i++){
            if(personnage.getPV()>0){
                int randomizer = (int) Math.round(Math.random() * 2);
                switch (randomizer) {
                    case 0->{RamdomizeGoodEvent(personnage, bonevenement);}
                    case 1->{RamdomizeBadEvent(personnage, mauvaisevenement);}
                    default->{RamdomizeBattle(personnage,demons);}
                }
            }else{
                System.out.println("Vous êtes mort...");
            }
        }
        personnage.setPV(originalHP);
        personnage.setATQ(originalATQ);
    }
}
