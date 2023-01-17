public class Main {
    public static void main(String[] args) {
        /*
        scriviamo un programma che determini il segno zodiacale e lo stampi a video.
        in base all'inserimento di 4 numeri all'interno di variabili che rappresentano il giorno e il mese di inizio
        e il giorno e il mese di fine di ogni singolo segno.
        es. per gemelli si avrebbe:
        giornoinizio=21
        giornofine=21
        meseinizio=5
        mesefine=6
        per ogni segno zodiacale queste sono le fasce:
        Ariete 21 marzo-20 aprile
        toro 21 aprile-20 maggio
        gemelli 21 maggio- 21 giugno
        cancro 22 giugno- 22 luglio
        leone 23 luglio-23 agosto
        vergine 24 agosto-22 settembre
        bilancia 23 settembre- 22 ottobre
        scorpione 23 ottobre-22 novembre
        sagittario 23 novembre- 21 dicembre
        capricorno 22 dicembre- 20 gennaio
        acquario 21 gennaio- 19 febbraio
        pesci 20 febbraio- 20 marzo
         */
        System.out.println("determinare il segno zodiacale");
        //dichiaro e inizializzo le variabili
        byte giornoInizio = 21;
        byte giornoFine = 20;
        byte meseInizio = 3;
        byte meseFine = 4;
        String segno = null;

        if (giornoInizio >= 21 && meseInizio == 3) {
            if (giornoFine <= 20 && meseFine == 4) {
                segno = "Ariete";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 21 && meseInizio == 4) {
            if (giornoFine <= 20 && meseFine == 5) {
                segno = "Toro";
            }
        }
        else {
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 21 && meseInizio == 5) {
            if (giornoFine <= 21 && meseFine == 6) {
                segno = "Gemelli";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 22 && meseInizio == 6) {
            if (giornoFine <= 22 && meseFine == 7) {
                segno = "Cancro";
            }
        }
        else {
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 23 && meseInizio == 7) {
            if (giornoFine <= 23 && meseFine == 8) {
                segno = "Leone";
            }
        }
        else {
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 24 && meseInizio == 8) {
            if (giornoFine <= 22 && meseFine == 9) {
                segno = "vergine";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 23 && meseInizio == 9) {
            if (giornoFine <= 22 && meseFine == 10) {
                segno = "bilancia";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 23 && meseInizio == 10) {
            if (giornoFine <= 22 && meseFine == 11) {
                segno = "scorpione";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 23 && meseInizio == 11) {
            if (giornoFine <= 21 && meseFine == 12) {
                segno = "sagittario";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 22 && meseInizio == 12) {
            if (giornoFine <= 20 && meseFine == 1) {
                segno = "capricorno";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 21 && meseInizio == 1) {
            if (giornoFine <= 19 && meseFine == 2) {
                segno = "Acquario";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        if (giornoInizio >= 20 && meseInizio == 2) {
            if (giornoFine <= 20 && meseFine == 3) {
                segno = "Pesci";
            }
        }
        else{
            System.out.println("controlla l'istruzione successiva");
        }
        System.out.println("il segno zodiacale è:" + segno);

    }

}