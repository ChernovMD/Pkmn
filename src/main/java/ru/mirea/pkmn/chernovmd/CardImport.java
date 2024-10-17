package ru.mirea.pkmn.chernovmd;

import ru.mirea.pkmn.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CardImport {
    public Card desCard(String filePath){
        Card card = null;

        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)){

            card = (Card) in.readObject();

        } catch (IOException | ClassNotFoundException e){
            System.out.println("Ошибка десериализации " + e.getMessage());
        }
        return card;
    }
    public Card importCard(String filePath){
        Card card = new Card();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            card.setPokemonStage(PokemonStage.valueOf(br.readLine().trim().toUpperCase())); //1
            card.setName(br.readLine().trim());                               //2
            card.setHp(Integer.parseInt(br.readLine().trim()));               //3
            card.setPokemonType(EnergyType.valueOf(br.readLine().trim().toUpperCase()));    //4

            String evolvesFromStr = br.readLine().trim();  //5
            if (evolvesFromStr.endsWith(".txt")) {
                Card evolvesFromCard = importCard(evolvesFromStr);
                card.evolvesFrom = evolvesFromCard;
            }else if (evolvesFromStr.equals("-")) {
                Card evolvesFromCard = new Card();
                card.evolvesFrom = evolvesFromCard;
            }else {
                Card evolvesFromCard = importCard(evolvesFromStr);
                card.evolvesFrom = evolvesFromCard;;
            }


            String skillsStr = br.readLine().trim();
            card.setSkills(getAttackSkills(skillsStr));                       //6

            card.setWeaknessType(EnergyType.valueOf(br.readLine().trim().toUpperCase()));   //7


            card.setResistanceType(br.readLine().trim().equals("-") ? null : EnergyType.valueOf(br.readLine().trim()));
            /*
            String resistanceType = br.readLine().trim();
            if (resistanceType.equals("-")){
                card.setResistanceType(null);
            }
            else {
                //card.setResistanceType(null);
                card.setResistanceType(EnergyType.valueOf(br.readLine().trim())); //8
            }
            */



            card.setRetreatCost(br.readLine().trim());                        //9
            card.setGameSet(br.readLine().trim());                            //10
            card.setRegulationMark(br.readLine().trim().charAt(0));           //11

            String pokemonOwner_1 = br.readLine();
            if (pokemonOwner_1.equals("-")){
                card.setPokemonOwner(null);
            }else{
                String[] pokemonOwner = pokemonOwner_1.split("/");
                //card.setResistanceType(br.readLine().trim().equals("-") ? null : EnergyType.valueOf(br.readLine().trim()));
                card.setPokemonOwner(new Student(pokemonOwner[0], pokemonOwner[1], pokemonOwner[2], pokemonOwner[3]));
            }



        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return card;
    }
    private List<AttackSkill> getAttackSkills(String skillsStr){
        List<AttackSkill> skills = new ArrayList<>();
        String[] skills_split = skillsStr.split(",");

        for (String skill : skills_split) {
            String[] skillInfo = skill.split("/");

            String skillName = skillInfo[1].trim();
            Integer skillDamage = Integer.parseInt(skillInfo[2].trim());
            String skillCost = skillInfo[0].trim();

            skills.add(new AttackSkill(skillName, null, skillCost, skillDamage));
        }
        return skills;
    }

}
