package ee.taltech.deepdarkdungeon.Models.characterClasses;

import com.badlogic.gdx.graphics.Texture;
import ee.taltech.deepdarkdungeon.Models.GameObject;

public class Magic extends GameObject {

    public Magic(Texture picture, String name, int health, int power, int x, int y, double width, double height, CharacterClass characterClass, CharacterType characterType, int place) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.characterClass = characterClass;
        this.characterType = characterType;
        this.texture = picture;
        this.skills = "sunstrike";
        this.mana = 100;
        this.place = place;
        this.description = "The wizard is a \"genius student\" of\n" +
                "arcane magic, who has studied the\n" +
                "subject for years. Thanks to powerful\n" +
                "spell-casters, there is a possibility to\n" +
                "attack three enemies at the same\n" +
                "time. Mage is very valuable, if you\n" +
                "use his power properly.";
    }
}
