package ch.bbw.luckynumber;

import java.util.*;
import java.util.Random;

/**
 * LuckyNumber
 * Fachklasse für das Berechnen von Glueckszahlen
 *
 * @author Peter Rutschmann
 * @date 06.09.2021
 */
public class LuckyNumber {

    public int singleDice(){
        //Hier ergaenzen
        Random random = new Random();
        int value = random.nextInt(6)+1;
        return value;
    }

    public List<Integer> doubleDice(){
        List<Integer> liste = new ArrayList<>();
        //Hier ergaenzen
        Random random = new Random();
        liste.add(random.nextInt(6)+1);
        liste.add(random.nextInt(6)+1);
        return liste;
    }

    public boolean trueOrFalse(){
        //Hier ergaenzen
        Random random = new Random();
        return random.nextBoolean();
    }

    public Set <Integer> sixLottoNumbers(){
        Random random = new Random();

        Set<Integer> set = new HashSet<>();

        while(set.size() < 6){
            set.add(random.nextInt(42)+1);
        }
        return set;
    }

    public String playingCard(){
        //Hier ergaenzen
        Random random = new Random();
        String card = "";
        if (random.nextBoolean()) {
            if(random.nextBoolean()){
                card = card + "Rot, Herz, ";
            }else{
                card = card + "Rot, Karo, ";
            }
        }
        else{
            if (random.nextBoolean()){
                card = card + "Schwarz, Pik, ";
            }
            else{
                card = card + "Schwarz, Kreuz, ";
            }
        }
        card = card + (random.nextInt(9)+2);
            return card;
    }

    public List<Integer> primeUpTo100(){
        List<Integer> list = new ArrayList<>();
        //Hier ergaenzen
        int border = 100; //ein Kommentar
        for (int n = 2; n <= border ; n++){
            boolean isPrimeZahl = true;
            for (int i = 2; i < n && isPrimeZahl;i++){
                if((n % i) == 0 ){
                    isPrimeZahl = false;
                }
            }
            if(isPrimeZahl){
                list.add(n);
            }
        }
        return list;
    }

    public int primeNextTo(int value){
        //Hier ergaenzen
        int max = 0;
        int border = value -1;
        for (int i = 2; i <= border; i++){
            boolean isPrimZahi = true;
            for(int j = 2; j <i && isPrimZahi; j++){
                if((i % j) == 0){
                    isPrimZahi = false;
                }
                if(isPrimZahi){
                    max = i;
                }
            }
        }
        return max;
    }

    public List<Integer> triangleNumbersUpTo(int value){
        List<Integer> list = new ArrayList<Integer>();
        //Hier ergaenzen

        return list;
    }

}
