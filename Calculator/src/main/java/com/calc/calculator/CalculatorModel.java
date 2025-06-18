package com.calc.calculator;

public class CalculatorModel {
    private int trenutniBroj;   // Trenutni broj koji je unet
    private int ukupniRezultat; // Ukupni rezultat koji se ažurira nakon svake operacije

    public CalculatorModel(int trenutniBroj) {
        this.trenutniBroj = trenutniBroj;
        this.ukupniRezultat = 0; // Početni rezultat je 0
    }

    public int getTrenutniBroj() {
        return trenutniBroj;
    }

    public void setTrenutniBroj(int trenutniBroj) {
        this.trenutniBroj = trenutniBroj;
    }

    public int getUkupniRezultat() {
        return ukupniRezultat;
    }

    public void setUkupniRezultat(int ukupniRezultat) {
        this.ukupniRezultat = ukupniRezultat;
    }

    // Metoda koja čuva rezultat nakon operacije
    public void spremiRezultat(Operator operator) {
        switch (operator) {
            case plus:
                ukupniRezultat = ukupniRezultat + trenutniBroj; // Dodaj trenutni broj na ukupni rezultat
                break;
            case minus:
                ukupniRezultat = ukupniRezultat - trenutniBroj; // Oduzmi trenutni broj od ukupnog rezultata
                break;
            case puta:
                ukupniRezultat = ukupniRezultat * trenutniBroj; // Pomnoži ukupni rezultat sa trenutnim brojem
                break;
            case podijeljeno:
                if (trenutniBroj != 0) {
                    ukupniRezultat = ukupniRezultat / trenutniBroj; // Podeli ukupni rezultat sa trenutnim brojem
                } else {
                    // Ako je trenutni broj 0, ne dozvoljava deljenje i postavi rezultat na 0
                    ukupniRezultat = 0;
                }
                break;
            case jednako:
                // Kada je pritisnuto "=" (jednako), samo vrati trenutni rezultat
                break;
        }
    }

    // Reseting trenutnog broja na 0
    public void resetujTrenutniBroj() {
        trenutniBroj = 0;
    }
}