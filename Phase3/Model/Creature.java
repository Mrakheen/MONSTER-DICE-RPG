//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.Model;
import Phase3.Controller.GameUtility;
import Phase3.Controller.Modifiers;
import java.util.*;

public abstract class Creature{
    public String AvatarNo;
    public String creatureName;
    public String creationDate;
    public int HP, STR, DEX, CON, AC;
    public int rollinitiative;

    public Creature(){
        int player1roll=0;
        player1roll = GameUtility.rollDice("d20");
        player1roll = player1roll+Modifiers.DEX_mod(this.DEX);
        this.rollinitiative = player1roll;
    }

    public abstract int attack(Creature creature_target);

    public static void takeDamage(int inputDamage, Creature obj){
        if((obj.HP - inputDamage)>=0 && inputDamage>0){
            obj.HP = obj.HP - inputDamage;
        }
        else if((obj.HP - inputDamage)<0 && inputDamage>0){
            obj.HP = 0;
        }
    }

    public static Comparator<Creature> creatureComparator = new Comparator<Creature>() {
        public int compare(Creature s1, Creature s2) {
            int c1 = s1.rollinitiative;
            int c2 = s2.rollinitiative;
            //ascending
            return c1-c2;
        }
    };

    public String toString() {  
        return creatureName+","+"HP:"+" "+HP+","+"STR:"+" "+STR+","+"DEX:"+" "+DEX+","+"CON:"+" "+CON; 
    }

}







