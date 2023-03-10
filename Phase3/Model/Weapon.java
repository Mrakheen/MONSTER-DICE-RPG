//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.Model;
import Phase3.Controller.GameUtility;

public class Weapon{
    public String weaponName;
    public String weaponDamage;
    public int bonusDamage;
    public Weapon(String weaponName,String weaponDamage,int bonusDamage){
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.bonusDamage = bonusDamage;
    }
    public Weapon(){} //Default Constructor
    public int rollDamage() {
        int rolldamageout = GameUtility.rollDice(weaponDamage);
        return rolldamageout;  
    }
    public String toString() { 
        return weaponName+""+"("+weaponDamage+"+"+bonusDamage+")";  
    }

}




