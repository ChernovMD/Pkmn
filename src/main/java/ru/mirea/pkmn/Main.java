package ru.mirea.pkmn;

import ru.mirea.pkmn.chernovmd.CardImport;

public class Main {
    public static void main(String[] args) {
        /*
        CardImport cardImport = new CardImport();
        Card card = cardImport.importCard("C:\\Users\\markc.LAPTOP-DIL5991K\\Downloads\\Pkmn\\src\\main\\resources\\my_card.txt");
        System.out.println(card.printCard());
        CardExport export = new CardExport();
        export.exportToFile(card);
        */
        CardImport cardImport = new CardImport();
        Card card_2 = cardImport.desCard("C:\\Users\\markc.LAPTOP-DIL5991K\\Downloads\\Pkmn\\Palossand.crd");
        System.out.println("Вооооот");
        System.out.println(card_2);
    }
}
