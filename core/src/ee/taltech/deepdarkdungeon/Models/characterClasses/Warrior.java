package ee.taltech.deepdarkdungeon.Models.characterClasses;

import com.badlogic.gdx.graphics.Texture;
import ee.taltech.deepdarkdungeon.Models.GameObject;

public class Warrior extends GameObject {

    public Warrior(Texture picture, String name, int health, int power, int x, int y, double width, double height, CharacterClass characterClass, CharacterType characterType, int place) {
        this.texture = picture;
        this.name = name;
        this.health = health;
        this.power = power;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.characterClass = characterClass;
        this.characterType = characterType;
        this.skills = "berserk call";
        this.mana = 100;
        this.place = place;
        this.description = "The Warrior fills the role of tanking,\n" +
                "he is the most enduring of all \n" +
                "creatures in the universe. Arms, fury,\n" +
                "and protection are the Warrior's \n" +
                "specializations. Warrior is a basic\n" +
                "fighter and it's hard to imagine some\n" +
                "fight without his participation.";
    }
}
