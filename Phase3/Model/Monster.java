//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.Model;
import Phase3.Controller.GameUtility;
import Phase3.Controller.Modifiers;

public class Monster extends Creature{
    public MonsterType monstertype;
    public int MonsterID;
    
    private int isDead = 0; //false
    public int getisDead() {
    	return this.isDead;
    }
    public void setisDead() {
    	if(HP == 0) {
    		this.isDead = 1; //true	
    	}
    }
    
    private int isDisarmed = 0; //false
    public int getisDisarmed() {
    	return this.isDisarmed;
    }
    public void setisDisarmed(int x) {
    	this.isDisarmed = x;
    }
    
    private int BGridpos = 0;
    public int getBGridpos() {
    	return this.BGridpos;
    }
    public void setGridPos(int x) {
    	this.BGridpos = x;
    }
    

    //This method is used for Monster to attack another player.
    public int attack(Creature creature_target){
    	int damaged1=0;
    	if(this.isDisarmed == 0) {
    		int AttackRoll = GameUtility.rollDice("d20")+Modifiers.DEX_mod(this.DEX);
            if(AttackRoll>=creature_target.AC){
                damaged1 = this.rollHit();
                Creature.takeDamage(damaged1,creature_target);
                return damaged1; //hit
            }
            else{
                return 0; //miss
            }
    	}
    	else {
    		return 0;
    	}    
    }

    public int rollHit(){
        int damage=0; 
        damage = GameUtility.rollDice("d6") + Modifiers.STR_mod(this.STR);
        return damage;
    }

    public static Monster MonsterloadFromCsv(String data){
        Monster monster = new Monster();
        String[] arr = new String[data.length()]; 
        arr = data.split(",",data.length());
        try{
            if(arr.length==8){
                monster.AvatarNo = arr[0];
                monster.creatureName = arr[1];
                String monstyp = arr[2];
                if(monstyp.equals("HUMANOID")){
                    monster.monstertype = MonsterType.Humanoid;
                }
                else if(monstyp.equals("FIEND")){
                    monster.monstertype = MonsterType.Fiend;
                }
                else if(monstyp.equals("DRAGON")){
                    monster.monstertype = MonsterType.Dragon;
                }
                else{
                    System.out.println("Invalid Monster Type!!");
                    throw new CsvReadException(data);
                }
                try{
                    monster.HP = Integer.parseInt(arr[3]);
                }
                catch(NumberFormatException e){
                    System.out.println("NumberFormatException  Invalid value of STR!");
                    throw new CsvReadException(data);
                }
                try{
                    monster.AC = Integer.parseInt(arr[4]);
                }
                catch(NumberFormatException e){
                    System.out.println("NumberFormatException  Invalid value of STR!");
                    throw new CsvReadException(data);
                }
                try{
                    monster.STR = Integer.parseInt(arr[5]);
                }
                catch(NumberFormatException e){
                    System.out.println("NumberFormatException  Invalid value of STR!");
                    throw new CsvReadException(data);
                }
                try{
                    monster.DEX = Integer.parseInt(arr[6]);
                }
                catch(NumberFormatException e){
                    System.out.println("NumberFormatException  Invalid value of STR!");
                    throw new CsvReadException(data);
                }
                try{
                    monster.CON = Integer.parseInt(arr[7]);
                }
                catch(NumberFormatException e){
                    System.out.println("NumberFormatException  Invalid value of STR!");
                    throw new CsvReadException(data);
                }
                return monster; 
            }
            else{
                System.out.println("Input String is incorrect!");
                throw new CsvReadException(data);
            }    
        }
        catch(CsvReadException e){
            System.out.println(e);
            Monster monsternull = new Monster();
            monsternull.HP = -1;
            return monsternull;
        }
    }

}






