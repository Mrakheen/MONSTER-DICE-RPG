//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.Controller;

import java.util.Random;

import Phase3.View.StartGame;

public class GridMovement{
	/* The Grid Numbering according to GButton ArrayList:
	 * ---------------------- 
	 * 0   1   2   3   4   5  
	 * 6   7   8   9   10  11
	 * 12  13  14  15  16  17
	 * 18  19  20  21  22  23
	 * 24  25  26  27  28  29
	 * ----------------------
	 */
  
	public static void PlayermoveUp() {
		int pos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null && LoadedCharacters.SelectedMonsterCreatures.get(1)!=null) {
			int mPos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			int mPos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos != 0 && pos !=1 && pos !=2 && pos !=3 && pos !=4 && pos !=5 && (pos - 6) !=mPos1 && (pos - 6) !=mPos2) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos - 6;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null && LoadedCharacters.SelectedMonsterCreatures.get(1)== null) {
			int mPos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			if(pos != 0 && pos !=1 && pos !=2 && pos !=3 && pos !=4 && pos !=5 && (pos - 6) !=mPos1) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos - 6;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)!= null && LoadedCharacters.SelectedMonsterCreatures.get(0)== null) {
			int mPos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos != 0 && pos !=1 && pos !=2 && pos !=3 && pos !=4 && pos !=5 && (pos - 6) !=mPos2) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos - 6;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		
	}
	
	public static void PlayermoveDown(){
		int pos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null && LoadedCharacters.SelectedMonsterCreatures.get(1)!=null) {
			int mPos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			int mPos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos != 24 && pos !=25 && pos !=26 && pos !=27 && pos !=28 && pos !=29 && (pos + 6) !=mPos1 && (pos + 6) !=mPos2) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos + 6;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}	
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null && LoadedCharacters.SelectedMonsterCreatures.get(1)== null) {
			int mPos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			if(pos != 24 && pos !=25 && pos !=26 && pos !=27 && pos !=28 && pos !=29 && (pos + 6) !=mPos1) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos + 6;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)!= null && LoadedCharacters.SelectedMonsterCreatures.get(0)== null) {
			int mPos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos != 24 && pos !=25 && pos !=26 && pos !=27 && pos !=28 && pos !=29 && (pos + 6) !=mPos2) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos + 6;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
	}
	
	public static void PlayermoveLeft() {
		int pos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null && LoadedCharacters.SelectedMonsterCreatures.get(1)!=null) {
			int mPos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			int mPos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos != 0 && pos !=6 && pos !=12 && pos !=18 && pos !=24 && (pos - 1) !=mPos1 && (pos - 1) !=mPos2) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos - 1;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null && LoadedCharacters.SelectedMonsterCreatures.get(1)== null) {
			int mPos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			if(pos != 0 && pos !=6 && pos !=12 && pos !=18 && pos !=24 && (pos - 1) !=mPos1) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos - 1;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)!= null && LoadedCharacters.SelectedMonsterCreatures.get(0)== null) {
			int mPos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos != 0 && pos !=6 && pos !=12 && pos !=18 && pos !=24 && (pos - 1) !=mPos2) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos - 1;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		
	}
	
	public static void PlayermoveRight() {
		int pos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null && LoadedCharacters.SelectedMonsterCreatures.get(1)!=null) {
			int mPos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			int mPos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos != 5 && pos !=11 && pos !=17 && pos !=23 && pos !=29 && (pos + 1) !=mPos1 && (pos + 1) !=mPos2) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos + 1;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null && LoadedCharacters.SelectedMonsterCreatures.get(1)== null) {
			int mPos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			if(pos != 5 && pos !=11 && pos !=17 && pos !=23 && pos !=29 && (pos + 1) !=mPos1) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos + 1;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)!= null && LoadedCharacters.SelectedMonsterCreatures.get(0)== null) {
			int mPos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos != 5 && pos !=11 && pos !=17 && pos !=23 && pos !=29 && (pos + 1) !=mPos2) {
				StartGame.GButton.get(pos).setIcon(null);
				StartGame.GButton.get(pos).setToolTipText(null);
				
				pos = pos + 1;
				LoadedCharacters.PlayerCreatures.get(0).setBGridpos(pos);
				StartGame.setplayerIcononGrid();
			}
		}
		
	}
	
	public static void Monster1moveUp() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)!= null) {
			int pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos1 != 0 && pos1 !=1 && pos1 !=2 && pos1 !=3 && pos1 !=4 && pos1 !=5 && (pos1 - 6) !=Ppos && (pos1 - 6) !=pos2) {
				StartGame.GButton.get(pos1).setIcon(null);
				StartGame.GButton.get(pos1).setToolTipText(null);
				
				pos1 = pos1 - 6;
				LoadedCharacters.SelectedMonsterCreatures.get(0).setGridPos(pos1);
				StartGame.setMonster1IcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)== null) {
			if(pos1 != 0 && pos1 !=1 && pos1 !=2 && pos1 !=3 && pos1 !=4 && pos1 !=5 && (pos1 - 6) !=Ppos) {
				StartGame.GButton.get(pos1).setIcon(null);
				StartGame.GButton.get(pos1).setToolTipText(null);
				
				pos1 = pos1 - 6;
				LoadedCharacters.SelectedMonsterCreatures.get(0).setGridPos(pos1);
				StartGame.setMonster1IcononGrid();
			}
		}
		
		
	}
	
	public static void Monster2moveUp() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null) {
			int pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			if(pos2 != 0 && pos2 !=1 && pos2 !=2 && pos2 !=3 && pos2 !=4 && pos2 !=5 && (pos2 - 6) !=Ppos && (pos2 - 6) !=pos1) {
				StartGame.GButton.get(pos2).setIcon(null);
				StartGame.GButton.get(pos2).setToolTipText(null);
				
				pos2 = pos2 - 6;
				LoadedCharacters.SelectedMonsterCreatures.get(1).setGridPos(pos2);
				StartGame.setMonster2IcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)== null) {
			if(pos2 != 0 && pos2 !=1 && pos2 !=2 && pos2 !=3 && pos2 !=4 && pos2 !=5 && (pos2 - 6) !=Ppos) {
				StartGame.GButton.get(pos2).setIcon(null);
				StartGame.GButton.get(pos2).setToolTipText(null);
				
				pos2 = pos2 - 6;
				LoadedCharacters.SelectedMonsterCreatures.get(1).setGridPos(pos2);
				StartGame.setMonster2IcononGrid();
			}
		}
		
	}
	
	public static void Monster1moveDown() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)!= null) {
			int pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos1 != 24 && pos1 !=25 && pos1 !=26 && pos1 !=27 && pos1 !=28 && pos1 !=29 && (pos1 + 6) !=Ppos && (pos1 + 6) !=pos2) {
				StartGame.GButton.get(pos1).setIcon(null);
				StartGame.GButton.get(pos1).setToolTipText(null);
				
				pos1 = pos1 + 6;
				LoadedCharacters.SelectedMonsterCreatures.get(0).setGridPos(pos1);
				StartGame.setMonster1IcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!= null) {
			if(pos1 != 24 && pos1 !=25 && pos1 !=26 && pos1 !=27 && pos1 !=28 && pos1 !=29 && (pos1 + 6) !=Ppos) {
				StartGame.GButton.get(pos1).setIcon(null);
				StartGame.GButton.get(pos1).setToolTipText(null);
				
				pos1 = pos1 + 6;
				LoadedCharacters.SelectedMonsterCreatures.get(0).setGridPos(pos1);
				StartGame.setMonster1IcononGrid();
			}
		}
				
	}
	
	public static void Monster2moveDown() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!=null) {
			int pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			if(pos2 != 24 && pos2 !=25 && pos2 !=26 && pos2 !=27 && pos2 !=28 && pos2 !=29 && (pos2 + 6) !=Ppos && (pos2 + 6) !=pos1) {
				StartGame.GButton.get(pos2).setIcon(null);
				StartGame.GButton.get(pos2).setToolTipText(null);
				
				pos2 = pos2 + 6;
				LoadedCharacters.SelectedMonsterCreatures.get(1).setGridPos(pos2);
				StartGame.setMonster2IcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)==null) {
			if(pos2 != 24 && pos2 !=25 && pos2 !=26 && pos2 !=27 && pos2 !=28 && pos2 !=29 && (pos2 + 6) !=Ppos) {
				StartGame.GButton.get(pos2).setIcon(null);
				StartGame.GButton.get(pos2).setToolTipText(null);
				
				pos2 = pos2 + 6;
				LoadedCharacters.SelectedMonsterCreatures.get(1).setGridPos(pos2);
				StartGame.setMonster2IcononGrid();
			}
		}
		
	}
	
	public static void Monster1moveLeft() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)!= null) {
			int pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos1 != 0 && pos1 !=6 && pos1 !=12 && pos1 !=18 && pos1 !=24 && (pos1 - 1) !=Ppos && (pos1 - 1) !=pos2) {
				StartGame.GButton.get(pos1).setIcon(null);
				StartGame.GButton.get(pos1).setToolTipText(null);
				
				pos1 = pos1 - 1;
				LoadedCharacters.SelectedMonsterCreatures.get(0).setGridPos(pos1);
				StartGame.setMonster1IcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)== null) {
			if(pos1 != 0 && pos1 !=6 && pos1 !=12 && pos1 !=18 && pos1 !=24 && (pos1 - 1) !=Ppos) {
				StartGame.GButton.get(pos1).setIcon(null);
				StartGame.GButton.get(pos1).setToolTipText(null);
				
				pos1 = pos1 - 1;
				LoadedCharacters.SelectedMonsterCreatures.get(0).setGridPos(pos1);
				StartGame.setMonster1IcononGrid();
			}
		}
		
		
	}
	
	public static void Monster2moveLeft() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!=null) {
			int pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			if(pos2 != 0 && pos2 !=6 && pos2 !=12 && pos2 !=18 && pos2 !=24 && (pos2 - 1) !=Ppos && (pos2 - 1) !=pos1) {
				StartGame.GButton.get(pos2).setIcon(null);
				StartGame.GButton.get(pos2).setToolTipText(null);
				
				pos2 = pos2 - 1;
				LoadedCharacters.SelectedMonsterCreatures.get(1).setGridPos(pos2);
				StartGame.setMonster2IcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)==null) {
			if(pos2 != 0 && pos2 !=6 && pos2 !=12 && pos2 !=18 && pos2 !=24 && (pos2 - 1) !=Ppos) {
				StartGame.GButton.get(pos2).setIcon(null);
				StartGame.GButton.get(pos2).setToolTipText(null);
				
				pos2 = pos2 - 1;
				LoadedCharacters.SelectedMonsterCreatures.get(1).setGridPos(pos2);
				StartGame.setMonster2IcononGrid();
			}
		}
		
	}
	
	public static void Monster1moveRight() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)!=null) {
			int pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
			if(pos1 != 5 && pos1 !=11 && pos1 !=17 && pos1 !=23 && pos1 !=29 && (pos1 + 1) !=Ppos && (pos1 + 1) !=pos2) {
				StartGame.GButton.get(pos1).setIcon(null);
				StartGame.GButton.get(pos1).setToolTipText(null);
				
				pos1 = pos1 + 1;
				LoadedCharacters.SelectedMonsterCreatures.get(0).setGridPos(pos1);
				StartGame.setMonster1IcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(1)==null) {
			if(pos1 != 5 && pos1 !=11 && pos1 !=17 && pos1 !=23 && pos1 !=29 && (pos1 + 1) !=Ppos) {
				StartGame.GButton.get(pos1).setIcon(null);
				StartGame.GButton.get(pos1).setToolTipText(null);
				
				pos1 = pos1 + 1;
				LoadedCharacters.SelectedMonsterCreatures.get(0).setGridPos(pos1);
				StartGame.setMonster1IcononGrid();
			}
		}
		
		
	}
	
	public static void Monster2moveRight() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)!=null) {
			int pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
			if(pos2 != 5 && pos2 !=11 && pos2 !=17 && pos2 !=23 && pos2 !=29 && (pos2 + 1) !=Ppos && (pos2 + 1) !=pos1) {
				StartGame.GButton.get(pos2).setIcon(null);
				StartGame.GButton.get(pos2).setToolTipText(null);
				
				pos2 = pos2 + 1;
				LoadedCharacters.SelectedMonsterCreatures.get(1).setGridPos(pos2);
				StartGame.setMonster2IcononGrid();
			}
		}
		if(LoadedCharacters.SelectedMonsterCreatures.get(0)==null) {
			if(pos2 != 5 && pos2 !=11 && pos2 !=17 && pos2 !=23 && pos2 !=29 && (pos2 + 1) !=Ppos) {
				StartGame.GButton.get(pos2).setIcon(null);
				StartGame.GButton.get(pos2).setToolTipText(null);
				
				pos2 = pos2 + 1;
				LoadedCharacters.SelectedMonsterCreatures.get(1).setGridPos(pos2);
				StartGame.setMonster2IcononGrid();
			}
		}
		
	}
	
	public static void Monster1Movement() {
		Random random = new Random(); 
		int choice = random.nextInt(1,5);
		if(choice == 1) {
			Monster1moveUp();
		}
		if(choice == 2) {
			Monster1moveDown();
		}
		if(choice == 3) {
			Monster1moveLeft();
		}
		if(choice == 4) {
			Monster1moveRight();
		}
		
	}
	
	public static void Monster2Movement() {
		Random random = new Random(); 
		int choice = random.nextInt(1,5);
		if(choice == 1) {
			Monster2moveUp();
		}
		if(choice == 2) {
			Monster2moveDown();
		}
		if(choice == 3) {
			Monster2moveLeft();
		}
		if(choice == 4) {
			Monster2moveRight();
		}
		
	}
	
	public static int isMonster1inPlayerRange() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos1 = 0;
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			pos1 = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
		}
		
		if((Ppos+1) == pos1 && LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			return 1; //True
		}
		else if((Ppos-1) == pos1 && LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			return 1;
		}
		else if((Ppos-6) == pos1 && LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			return 1;
		}
		else if((Ppos+6) == pos1 && LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			return 1;
		}
		else if((Ppos-7) == pos1 && LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			return 1;
		}
		else if((Ppos+7)==pos1 && LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			return 1;
		}
		else if((Ppos-5)==pos1 && LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			return 1;
		}
		else if((Ppos+5)==pos1 && LoadedCharacters.SelectedMonsterCreatures.get(0) !=null) {
			return 1;
		}
		else {
			return 0; //false
		}
	}
	
	public static int isMonster2inPlayerRange() {
		int Ppos  = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		int pos2 = 0;
		
		if(LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			pos2 = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
		}
		if((Ppos+1) == pos2 && LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			return 1; //True
		}
		else if((Ppos-1) == pos2 && LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			return 1;
		}
		else if((Ppos-6) == pos2 && LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			return 1;
		}
		else if((Ppos+6) == pos2 && LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			return 1;
		}
		else if((Ppos-7) == pos2 && LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			return 1;
		}
		else if((Ppos+7)==pos2 && LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			return 1;
		}
		else if((Ppos-5)==pos2 && LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			return 1;
		}
		else if((Ppos+5)==pos2 && LoadedCharacters.SelectedMonsterCreatures.get(1) !=null) {
			return 1;
		}
		else {
			return 0; //false
		}
	}
	
	

}
