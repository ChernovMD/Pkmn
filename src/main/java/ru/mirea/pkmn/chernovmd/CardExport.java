package ru.mirea.pkmn.chernovmd;

import ru.mirea.pkmn.Card;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CardExport {
    public void exportToFile(Card card){
        String fileName = card.getName().replace(" ", "_") + ".crd";

        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(card);

        } catch (IOException e){
            System.out.println("Ошибка сериализации " + e.getMessage());
        }
    }
}
