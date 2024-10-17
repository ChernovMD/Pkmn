package ru.mirea.pkmn;


import java.util.List;
import java.io.Serializable;

public class Card implements Serializable{
    private static final long serialVersionUID = 1L;

    PokemonStage pokemonStage;
    String name;
    int hp;
    EnergyType pokemonType;
    public Card evolvesFrom;
    List<AttackSkill> skills;
    EnergyType weaknessType;
    EnergyType resistanceType;
    String retreatCost;
    String gameSet;
    char regulationMark;
    Student pokemonOwner;

    public Card(PokemonStage pokemonStage,
                String name,
                int hp,
                EnergyType pokemonType,
                Card evolvesFrom,
                List<AttackSkill> skills,
                EnergyType weaknessType,
                EnergyType resistanceType,
                String retreatCost,
                String gameSet,
                char regulationMark,
                Student pokemonOwner) {
        this.pokemonStage = pokemonStage;
        this.name = name;
        this.hp = hp;
        this.pokemonType = pokemonType;
        this.evolvesFrom = evolvesFrom;
        this.skills = skills;
        this.weaknessType = weaknessType;
        this.resistanceType = resistanceType;
        this.retreatCost = retreatCost;
        this.gameSet = gameSet;
        this.regulationMark = regulationMark;
        this.pokemonOwner = pokemonOwner;
    }

    public Card() {
    }

    public PokemonStage getPokemonStage() {
        return pokemonStage;
    }

    public void setPokemonStage(PokemonStage pokemonStage) {
        this.pokemonStage = pokemonStage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public EnergyType getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(EnergyType pokemonType) {
        this.pokemonType = pokemonType;
    }

    public Card getEvolvesFrom() {
        return evolvesFrom;
    }

    /*
    public void setEvolvesFrom(Card evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

    */

    public List<AttackSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<AttackSkill> skills) {
        this.skills = skills;
    }

    public EnergyType getWeaknessType() {
        return weaknessType;
    }

    public void setWeaknessType(EnergyType weaknessType) {
        this.weaknessType = weaknessType;
    }

    public EnergyType getResistanceType() {
        return resistanceType;
    }

    public void setResistanceType(EnergyType resistanceType) {
        this.resistanceType = resistanceType;
    }

    public String getRetreatCost() {
        return retreatCost;
    }

    public void setRetreatCost(String retreatCost) {
        this.retreatCost = retreatCost;
    }

    public String getGameSet() {
        return gameSet;
    }

    public void setGameSet(String gameSet) {
        this.gameSet = gameSet;
    }

    public char getRegulationMark() {
        return regulationMark;
    }

    public void setRegulationMark(char regulationMark) {
        this.regulationMark = regulationMark;
    }

    public Student getPokemonOwner() {
        return pokemonOwner;
    }

    public void setPokemonOwner(Student pokemonOwner) {
        this.pokemonOwner = pokemonOwner;
    }

    @Override
    public String toString() {
        return "Card{" +
                "pokemonStage=" + pokemonStage +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", pokemonType=" + pokemonType +
                ", evolvesFrom=" + evolvesFrom +
                ", skills=" + skills +
                ", weaknessType=" + weaknessType +
                ", resistanceType=" + resistanceType +
                ", retreatCost='" + retreatCost + '\'' +
                ", gameSet='" + gameSet + '\'' +
                ", regulationMark=" + regulationMark +
                ", pokemonOwner=" + pokemonOwner +
                '}';
    }

    public String printCard() {
        return "Card{" + '\n' +
                "pokemonStage=" + pokemonStage + '\n' +
                "name='" + name + '\'' + '\n' +
                "hp=" + hp + '\n' +
                "pokemonType=" + pokemonType + '\n' +
                "evolvesFrom=" + evolvesFrom + '\n' +
                "skills=" + skills + '\n' +
                "weaknessType=" + weaknessType + '\n' +
                "resistanceType=" + resistanceType + '\n' +
                "retreatCost=" + retreatCost + "\\" +
                "gameSet=" + gameSet + '\\' +
                "regulationMark=" + regulationMark + '\n' +
                "pokemonOwner=" + pokemonOwner + '\n' +
                '}';
    }




}
