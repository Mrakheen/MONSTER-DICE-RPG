//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.Controller;
import Phase3.Model.Player;
import Phase3.Model.Monster;
import Phase3.Model.Creature;
import java.util.*;
import java.io.*;
public class LoadedCharacters{
    public static ArrayList <Player> PlayerCreatures = new ArrayList<Player>();//only 1 player can be loaded into the game.
    public static ArrayList <Monster> MonsterCreatures = new ArrayList<Monster>();
    public static ArrayList <Monster> SelectedMonsterCreatures = new ArrayList<Monster>();

    public static void rollInitiative(ArrayList<Creature> creatures){ //sorts the list of all creatures based on their individual initiative rolls.
        Collections.sort(creatures, Creature.creatureComparator);
    }

    public static void readSpecific_playercharacterinfo(String filename) throws FileNotFoundException{
        File file = new File(filename);
        if(file.exists()){
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                Player playerobj = Player.PlayerloadFromCsv(data);
                if(playerobj.HP != -1){
                	PlayerCreatures.clear();
                    PlayerCreatures.add(playerobj);
                }
            }
            scan.close();
        }
    }

    //Used for Monster Creature Type ArrayList
    public static void readMonsterData(String filename) throws FileNotFoundException{
        MonsterCreatures.clear();
        try{
            File file = new File(filename);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                Monster monsterobj = Monster.MonsterloadFromCsv(data);
                if(monsterobj.HP != -1){
                    MonsterCreatures.add(monsterobj);
                }
            }
            scan.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File could not be found!!\n");
        }
    }
    
    public static void select2RanMonsters(){
    	SelectedMonsterCreatures.clear();
    	int len  = 0;
    	len = MonsterCreatures.size();
    	int randint1;
    	int randint2;
    	Random rand = new Random();
    	if(len !=0 ) {
    		randint1 = rand.nextInt(len);
    		MonsterCreatures.get(randint1).setGridPos(8); //Button number on Grid Button in StartGame.java
    		SelectedMonsterCreatures.add(MonsterCreatures.get(randint1)); 
    		randint2 = randint1;
    		while(randint2 == randint1) {
    			randint2 = rand.nextInt(len);
    		}
    		MonsterCreatures.get(randint2).setGridPos(11); //Button number on Grid Button in StartGame.java
    		SelectedMonsterCreatures.add(MonsterCreatures.get(randint2));
    	}

    }
}