//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.TimerTask;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Phase3.Controller.GridMovement;
import Phase3.Controller.LoadedCharacters;
import Phase3.Controller.Modifiers;
import Phase3.Model.Creature;

public class StartGame extends JFrame implements ActionListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2772094633738754914L;
	JPanel Panel1,Panel3,ePanel,Panel4; //Panel1 for map
    JButton button1,button2,dButton1,dButton2,dButton3,dButton4;
    JLabel label1,label2,label3,label4;
    public static JLabel label5;
    JLabel pInfo,pInfo2,pInfo3,pInfo4,sLabel;
    JLabel m1Info1,m2Info1;
    JPanel LabelPanel,DPanel2;
    JPanel layout,layout2;
    public static ArrayList <JButton> GButton = new ArrayList <JButton>();
    JButton GButton1,GButton2,GButton3,GButton4,GButton5,GButton6,GButton7,GButton8,GButton9,GButton10,GButton11,GButton12,GButton13,GButton14,GButton15,GButton16,GButton17,GButton18,GButton19,GButton20,GButton21,GButton22,GButton23,GButton24,GButton25,GButton26,GButton27,GButton28,GButton29,GButton30;
    public static int timerDone = 1; //true
    
    public StartGame() {

        Panel1 = new JPanel();
        Panel3 = new JPanel();
                
		// Setting grid  layout to JFrame GUI
        JPanel btnPanel = new JPanel(new GridLayout(5,6));
		// Adding buttons using Grid Layout
        
        GButton1 = new JButton();
        GButton1.setPreferredSize(new Dimension(150,150));
        GButton1.setBackground(Color.WHITE);
        GButton1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton1);
        
        GButton2 = new JButton();
        GButton2.setPreferredSize(new Dimension(150,150));
        GButton2.setBackground(Color.WHITE);
        GButton2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton2);
        
        GButton3 = new JButton();
        GButton3.setPreferredSize(new Dimension(150,150));
        GButton3.setBackground(Color.WHITE);
        GButton3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton3);
        
        GButton4 = new JButton();
        GButton4.setPreferredSize(new Dimension(150,150));
        GButton4.setBackground(Color.WHITE);
        GButton4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton4);
        
        GButton5 = new JButton();
        GButton5.setPreferredSize(new Dimension(150,150));
        GButton5.setBackground(Color.WHITE);
        GButton5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton5);
        
        GButton6 = new JButton();
        GButton6.setPreferredSize(new Dimension(150,150));
        GButton6.setBackground(Color.WHITE);
        GButton6.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton6);
        
        GButton7 = new JButton();
        GButton7.setPreferredSize(new Dimension(150,150));
        GButton7.setBackground(Color.WHITE);
        GButton7.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton7);
        
        GButton8 = new JButton();
        GButton8.setPreferredSize(new Dimension(150,150));
        GButton8.setBackground(Color.WHITE);
        GButton8.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton8);
        
        GButton9 = new JButton();
        GButton9.setPreferredSize(new Dimension(150,150));
        GButton9.setBackground(Color.WHITE);
        GButton9.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton9);
        
        GButton10 = new JButton();
        GButton10.setPreferredSize(new Dimension(150,150));
        GButton10.setBackground(Color.WHITE);
        GButton10.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton10);
        
        GButton11 = new JButton();
        GButton11.setPreferredSize(new Dimension(150,150));
        GButton11.setBackground(Color.WHITE);
        GButton11.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton11);
        
        GButton12 = new JButton();
        GButton12.setPreferredSize(new Dimension(150,150));
        GButton12.setBackground(Color.WHITE);
        GButton12.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton12);
        
        GButton13 = new JButton();
        GButton13.setPreferredSize(new Dimension(150,150));
        GButton13.setBackground(Color.WHITE);
        GButton13.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton13);
        
        GButton14 = new JButton();
        GButton14.setPreferredSize(new Dimension(150,150));
        GButton14.setBackground(Color.WHITE);
        GButton14.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton14);
        
        GButton15 = new JButton();
        GButton15.setPreferredSize(new Dimension(150,150));
        GButton15.setBackground(Color.WHITE);
        GButton15.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton15);
        
        GButton16 = new JButton();
        GButton16.setPreferredSize(new Dimension(150,150));
        GButton16.setBackground(Color.WHITE);
        GButton16.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton16);
        
        GButton17 = new JButton();
        GButton17.setPreferredSize(new Dimension(150,150));
        GButton17.setBackground(Color.WHITE);
        GButton17.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton17);
        
        GButton18 = new JButton();
        GButton18.setPreferredSize(new Dimension(150,150));
        GButton18.setBackground(Color.WHITE);
        GButton18.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton18);
        
        GButton19 = new JButton();
        GButton19.setPreferredSize(new Dimension(150,150));
        GButton19.setBackground(Color.WHITE);
        GButton19.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton19);
        
        GButton20 = new JButton();
        GButton20.setPreferredSize(new Dimension(150,150));
        GButton20.setBackground(Color.WHITE);
        GButton20.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton20);
        
        GButton21 = new JButton();
        GButton21.setPreferredSize(new Dimension(150,150));
        GButton21.setBackground(Color.WHITE);
        GButton21.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton21);
        
        GButton22 = new JButton();
        GButton22.setPreferredSize(new Dimension(150,150));
        GButton22.setBackground(Color.WHITE);
        GButton22.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton22);
        
        GButton23 = new JButton();
        GButton23.setPreferredSize(new Dimension(150,150));
        GButton23.setBackground(Color.WHITE);
        GButton23.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton23);
        
        GButton24 = new JButton();
        GButton24.setPreferredSize(new Dimension(150,150));
        GButton24.setBackground(Color.WHITE);
        GButton24.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton24);
        
        GButton25 = new JButton();
        GButton25.setPreferredSize(new Dimension(150,150));
        GButton25.setBackground(Color.WHITE);
        GButton25.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton25);
        
        GButton26 = new JButton();
        GButton26.setPreferredSize(new Dimension(150,150));
        GButton26.setBackground(Color.WHITE);
        GButton26.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton26);
        
        GButton27 = new JButton();
        GButton27.setPreferredSize(new Dimension(150,150));
        GButton27.setBackground(Color.WHITE);
        GButton27.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton27);
        
        GButton28 = new JButton();
        GButton28.setPreferredSize(new Dimension(150,150));
        GButton28.setBackground(Color.WHITE);
        GButton28.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton28);
        
        GButton29 = new JButton();
        GButton29.setPreferredSize(new Dimension(150,150));
        GButton29.setBackground(Color.WHITE);
        GButton29.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton29);
        
        GButton30 = new JButton();
        GButton30.setPreferredSize(new Dimension(150,150));
        GButton30.setBackground(Color.WHITE);
        GButton30.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        GButton.add(GButton30);
        
		btnPanel.add(GButton.get(0));
		btnPanel.add(GButton.get(1));
		btnPanel.add(GButton.get(2));
		btnPanel.add(GButton.get(3));
		btnPanel.add(GButton.get(4));
		btnPanel.add(GButton.get(5));
		btnPanel.add(GButton.get(6));
		btnPanel.add(GButton.get(7));
		btnPanel.add(GButton.get(8));
		btnPanel.add(GButton.get(9));
		btnPanel.add(GButton.get(10));
		btnPanel.add(GButton.get(11));
		btnPanel.add(GButton.get(12));
		btnPanel.add(GButton.get(13));
		btnPanel.add(GButton.get(14));
		btnPanel.add(GButton.get(15));
		btnPanel.add(GButton.get(16));
		btnPanel.add(GButton.get(17));
		btnPanel.add(GButton.get(18));
		btnPanel.add(GButton.get(19));
		btnPanel.add(GButton.get(20));
		btnPanel.add(GButton.get(21));
		btnPanel.add(GButton.get(22));
		btnPanel.add(GButton.get(23));
		btnPanel.add(GButton.get(24));
		btnPanel.add(GButton.get(25));
		btnPanel.add(GButton.get(26));
		btnPanel.add(GButton.get(27));
		btnPanel.add(GButton.get(28));
		btnPanel.add(GButton.get(29));
		
		Panel1.add(btnPanel,BorderLayout.CENTER);
		
		String istra = "Phase3/Icons/dice.png";
        ImageIcon iconca = new ImageIcon(istra);
        Image ica = iconca.getImage();
        Image new_imageca = ica.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        iconca = new ImageIcon(new_imageca);
		button1 = new JButton();
        button1.setPreferredSize(new Dimension(100, 50));
        button1.setIcon(iconca);
        String istra2 = "Phase3/Icons/attack.png";
        ImageIcon iconca2 = new ImageIcon(istra2);
        Image ica2 = iconca2.getImage();
        Image new_imageca2 = ica2.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        iconca2 = new ImageIcon(new_imageca2);
        button1.setRolloverIcon(iconca2);
        button1.setToolTipText("ATTACK");
        button1.setFont(new Font("Verdana", Font.PLAIN, 8));
        
        label1 = new JLabel();
        label1.setFont(new Font("Verdana", Font.PLAIN, 18));
        label2 = new JLabel();
        label2.setFont(new Font("Verdana", Font.PLAIN, 18));
        label3 = new JLabel();
        label3.setFont(new Font("Verdana", Font.PLAIN, 18));
        label4 = new JLabel();
        label4.setFont(new Font("Verdana", Font.PLAIN, 18));
        label5 = new JLabel();
        label5.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        button2 = new JButton();
        button2.setPreferredSize(new Dimension(100, 50));
        String istrd = "Phase3/Icons/disarm.png";
        ImageIcon iconcd = new ImageIcon(istrd);
        Image icd = iconcd.getImage();
        Image new_imagecd = icd.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        iconcd = new ImageIcon(new_imagecd);
		button2 = new JButton();
        button2.setIcon(iconcd);
        button2.setToolTipText("DISARM");
        button2.setFont(new Font("Verdana", Font.PLAIN, 8));
        
        JLabel space1 = new JLabel(" ");
        JLabel space2 = new JLabel(" ");
        JLabel space3 = new JLabel(" ");
        JLabel space4 = new JLabel(" ");
        
        LoadedCharacters.select2RanMonsters();

        pInfo = new JLabel("Player Name: "+LoadedCharacters.PlayerCreatures.get(0).creatureName);
        pInfo.setFont(new Font("Verdana", Font.PLAIN, 18));
        pInfo2 = new JLabel(LoadedCharacters.PlayerCreatures.get(0).getWeaponName()+"||"+"Damage: "+LoadedCharacters.PlayerCreatures.get(0).getWeaponDamage()+"||"+"Bonus: "+LoadedCharacters.PlayerCreatures.get(0).getWeaponBonus());
        pInfo2.setFont(new Font("Verdana", Font.PLAIN, 18));
        pInfo3 = new JLabel(">> Player HP: "+LoadedCharacters.PlayerCreatures.get(0).HP+" <<");
        pInfo3.setFont(new Font("Verdana", Font.PLAIN, 18));
        pInfo4 = new JLabel("STR: "+LoadedCharacters.PlayerCreatures.get(0).STR+"||"+" DEX: "+LoadedCharacters.PlayerCreatures.get(0).DEX+"||"+" CON "+LoadedCharacters.PlayerCreatures.get(0).CON);
        pInfo4.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        m1Info1 = new JLabel(LoadedCharacters.SelectedMonsterCreatures.get(0).creatureName+" || "+LoadedCharacters.SelectedMonsterCreatures.get(0).monstertype+" || >>HP: "+LoadedCharacters.SelectedMonsterCreatures.get(0).HP+"<<");
        m1Info1.setFont(new Font("Verdana", Font.PLAIN, 18));
        m2Info1 = new JLabel(LoadedCharacters.SelectedMonsterCreatures.get(1).creatureName+" || "+LoadedCharacters.SelectedMonsterCreatures.get(1).monstertype+" || >>HP: "+LoadedCharacters.SelectedMonsterCreatures.get(1).HP+"<<");
        m2Info1.setFont(new Font("Verdana", Font.PLAIN, 18));
                
        layout = new JPanel(new GridBagLayout());
        layout.setBorder(new EmptyBorder(5, 5, 5, 5));
        LabelPanel = new JPanel(new GridLayout(27, 1, 25, 6));
        LabelPanel.add(label1,BorderLayout.CENTER);
        LabelPanel.add(label2,BorderLayout.CENTER);
        LabelPanel.add(space1,BorderLayout.CENTER);
        LabelPanel.add(label3,BorderLayout.CENTER);
        LabelPanel.add(label4,BorderLayout.CENTER);
        LabelPanel.add(space2,BorderLayout.CENTER);
        LabelPanel.add(label5,BorderLayout.WEST);
        LabelPanel.add(space3,BorderLayout.CENTER);
        LabelPanel.add(pInfo,BorderLayout.CENTER);
        LabelPanel.add(pInfo3,BorderLayout.CENTER);
        LabelPanel.add(pInfo2,BorderLayout.CENTER);
        LabelPanel.add(pInfo4,BorderLayout.CENTER);
        LabelPanel.add(space4,BorderLayout.CENTER);
        LabelPanel.add(m1Info1,BorderLayout.CENTER);
        LabelPanel.add(m2Info1,BorderLayout.CENTER);
        layout.add(LabelPanel);
        
        Panel3.setBorder(new EmptyBorder(2, 3, 2, 3));
        layout2 = new JPanel(new GridBagLayout());
        layout2.setBorder(new EmptyBorder(5, 5, 5, 5));
        DPanel2 = new JPanel(new GridLayout(10, 1, 10, 5));
        
        
        String istr = "Phase3/Icons/up.png";
        ImageIcon iconc = new ImageIcon(istr);
        Image ic = iconc.getImage();
        Image new_imagec = ic.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        iconc = new ImageIcon(new_imagec);
        dButton1 = new JButton(iconc);
        dButton1.setPreferredSize(new Dimension(40,40));
        
        String istr2 = "Phase3/Icons/dn.png";
        ImageIcon iconc2 = new ImageIcon(istr2);
        Image ic2 = iconc2.getImage();
        Image new_imagec2 = ic2.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        iconc2 = new ImageIcon(new_imagec2);
        dButton2  = new JButton(iconc2);
        dButton2.setPreferredSize(new Dimension(40,40));
       
        String istr3 = "Phase3/Icons/lt.png";
        ImageIcon iconc3 = new ImageIcon(istr3);
        Image ic3 = iconc3.getImage();
        Image new_imagec3 = ic3.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        iconc3 = new ImageIcon(new_imagec3);
        dButton3  = new JButton(iconc3);
        dButton3.setPreferredSize(new Dimension(40,40));
        
        String istr4 = "Phase3/Icons/rt.png";
        ImageIcon iconc4 = new ImageIcon(istr4);
        Image ic4 = iconc4.getImage();
        Image new_imagec4 = ic4.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        iconc4 = new ImageIcon(new_imagec4);
        dButton4  = new JButton(iconc4);
        dButton4.setPreferredSize(new Dimension(40,40));
        
        ePanel = new JPanel();
        ePanel.add(dButton3,BorderLayout.CENTER);
        ePanel.add(dButton4,BorderLayout.CENTER);
                
        DPanel2.add(dButton1,BorderLayout.CENTER);
        DPanel2.add(ePanel,BorderLayout.CENTER);
        DPanel2.add(dButton2,BorderLayout.CENTER);
        DPanel2.add(button1,BorderLayout.CENTER);
        DPanel2.add(button2,BorderLayout.CENTER);
        
        layout2.add(DPanel2);
        Panel3.add(layout2,BorderLayout.CENTER);
        
        setplayerIcononGrid();
        setMonster1IcononGrid();
        setMonster2IcononGrid();
              
        add(layout,BorderLayout.WEST);
        add(Panel1,BorderLayout.CENTER);
        add(Panel3,BorderLayout.EAST);
        
        dButton1.addActionListener(this);
        dButton2.addActionListener(this);
        dButton3.addActionListener(this);
        dButton4.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
               
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setTitle("MONSTER DICE RPG");
        Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
        setSize(screenSize.width,screenSize.height);
        setVisible(true);
	        
    }
    
    public void actionPerformed(ActionEvent action){ 
    	
    	if(action.getSource()==dButton1) { //Player UP Move
    		GridMovement.PlayermoveUp();
    		if(LoadedCharacters.SelectedMonsterCreatures.get(0) != null) {
    			GridMovement.Monster1Movement();
    		}
    		if(LoadedCharacters.SelectedMonsterCreatures.get(1) != null) {
    			GridMovement.Monster2Movement();
    		}
    	}
    	if(action.getSource()==dButton2) { //Player Down Move
    		GridMovement.PlayermoveDown();
    		if(LoadedCharacters.SelectedMonsterCreatures.get(0) != null) {
    			GridMovement.Monster1Movement();
    		}
    		if(LoadedCharacters.SelectedMonsterCreatures.get(1) != null) {
    			GridMovement.Monster2Movement();
    		}
    	}
    	if(action.getSource()==dButton3) { //Player Left Move
    		GridMovement.PlayermoveLeft();
    		if(LoadedCharacters.SelectedMonsterCreatures.get(0) != null) {
    			GridMovement.Monster1Movement();
    		}
    		if(LoadedCharacters.SelectedMonsterCreatures.get(1) != null) {
    			GridMovement.Monster2Movement();
    		}
    	}
    	if(action.getSource()==dButton4) { //Player Right Move
    		GridMovement.PlayermoveRight();
    		if(LoadedCharacters.SelectedMonsterCreatures.get(0) != null) {
    			GridMovement.Monster1Movement();
    		}
    		if(LoadedCharacters.SelectedMonsterCreatures.get(1) != null) {
    			GridMovement.Monster2Movement();
    		}
    	}
    	if(action.getSource()==button1) {//Attack
    		
    		int inRangem1 = GridMovement.isMonster1inPlayerRange();
    		if(inRangem1 == 1 && LoadedCharacters.SelectedMonsterCreatures.get(0).getisDead()==0) {
    			int damage = LoadedCharacters.PlayerCreatures.get(0).attack(LoadedCharacters.SelectedMonsterCreatures.get(0));
    			Creature.takeDamage(damage, LoadedCharacters.SelectedMonsterCreatures.get(0));
    			m1Info1.setText(LoadedCharacters.SelectedMonsterCreatures.get(0).creatureName+" || "+LoadedCharacters.SelectedMonsterCreatures.get(0).monstertype+" || >>HP: "+LoadedCharacters.SelectedMonsterCreatures.get(0).HP+"<<");
    			if(damage>0) {
    				label3.setText(LoadedCharacters.PlayerCreatures.get(0).creatureName+" hit "+LoadedCharacters.SelectedMonsterCreatures.get(0).creatureName+" for "+damage+" damage.");
    			}
    			else {
    				label3.setText(LoadedCharacters.PlayerCreatures.get(0).creatureName+" missed "+LoadedCharacters.SelectedMonsterCreatures.get(0).creatureName+".");
    			}
    			LoadedCharacters.SelectedMonsterCreatures.get(0).setisDead();
				
    			if(LoadedCharacters.SelectedMonsterCreatures.get(0).getisDead() == 0) {
	    			int mdamage = LoadedCharacters.SelectedMonsterCreatures.get(0).attack(LoadedCharacters.PlayerCreatures.get(0));
	    			Creature.takeDamage(mdamage, LoadedCharacters.PlayerCreatures.get(0));
	    			pInfo3.setText(">> Player HP: "+LoadedCharacters.PlayerCreatures.get(0).HP+" <<");
	    			if(mdamage>0) {
	    				label1.setText(LoadedCharacters.SelectedMonsterCreatures.get(0).creatureName+" hit "+LoadedCharacters.PlayerCreatures.get(0).creatureName+" for "+mdamage+" damage.");
	    				
	    			}
	    			else {
	    				label1.setText(LoadedCharacters.SelectedMonsterCreatures.get(0).creatureName+" missed "+LoadedCharacters.PlayerCreatures.get(0).creatureName+".");
	    			}
	    			GridMovement.Monster1Movement();
    			}
    			else {
    				setMonster1IcononGrid();
    			}
    		}
    		else {
    			label3.setText(null);
    			label1.setText(null);
    		}
    		
    		
    		int inRangem2 = GridMovement.isMonster2inPlayerRange();
    		if(inRangem2 == 1) {
    			int damage = LoadedCharacters.PlayerCreatures.get(0).attack(LoadedCharacters.SelectedMonsterCreatures.get(1));
    			Creature.takeDamage(damage, LoadedCharacters.SelectedMonsterCreatures.get(1));
    			m2Info1.setText(LoadedCharacters.SelectedMonsterCreatures.get(1).creatureName+" || "+LoadedCharacters.SelectedMonsterCreatures.get(1).monstertype+" || >>HP: "+LoadedCharacters.SelectedMonsterCreatures.get(1).HP+"<<");
    			if(damage>0) {
    				label4.setText(LoadedCharacters.PlayerCreatures.get(0).creatureName+" hit "+LoadedCharacters.SelectedMonsterCreatures.get(1).creatureName+" for "+damage+" damage.");
    			}
    			else {
    				label4.setText(LoadedCharacters.PlayerCreatures.get(0).creatureName+" missed "+LoadedCharacters.SelectedMonsterCreatures.get(1).creatureName+".");
    			}
    			LoadedCharacters.SelectedMonsterCreatures.get(1).setisDead();
    			
				if(LoadedCharacters.SelectedMonsterCreatures.get(1).getisDead() == 0) {
	    			int mdamage = LoadedCharacters.SelectedMonsterCreatures.get(1).attack(LoadedCharacters.PlayerCreatures.get(0));
	    			Creature.takeDamage(mdamage, LoadedCharacters.PlayerCreatures.get(0));
	    			pInfo3.setText(">> Player HP: "+LoadedCharacters.PlayerCreatures.get(0).HP+" <<");
	    			if(mdamage>0) {
	    				label2.setText(LoadedCharacters.SelectedMonsterCreatures.get(1).creatureName+" hit "+LoadedCharacters.PlayerCreatures.get(0).creatureName+" for "+mdamage+" damage.");
	    			}
	    			else {
	    				label2.setText(LoadedCharacters.SelectedMonsterCreatures.get(1).creatureName+" missed "+LoadedCharacters.PlayerCreatures.get(0).creatureName+".");
	    			}
	    			GridMovement.Monster2Movement();
				}
				else {
					setMonster2IcononGrid();
				}
    		}
    		else {
    			label4.setText(null);
    			label2.setText(null);
    		}
    		
    		
    		WinorLoseGameEnd();
    		int winorcontinue = hasWonGame();
    		if(winorcontinue==0||winorcontinue==1) {
	 	    	new MainMenu();
				LoadedCharacters.SelectedMonsterCreatures.clear();
				for(int i=0; i<30;i++) {
					GButton.get(i).setIcon(null);
				}
				LoadedCharacters.PlayerCreatures.get(0).HP = Modifiers.HPwithModifier(LoadedCharacters.PlayerCreatures.get(0).CON);
	 	        dispose();
    		}
    	}
    	
    	if(action.getSource()==button2) {//Disarm
    		int inRangem1 = GridMovement.isMonster1inPlayerRange();
    		if(inRangem1 == 1) {
    			label3.setText(null);
    			if(timerDone == 1) {
    				timer(5,0);
    				label5.setText(LoadedCharacters.SelectedMonsterCreatures.get(0).creatureName+" disarmed for 5 seconds!");
    				GridMovement.Monster1Movement();
    			}
    		}
    		
    		
    		int inRangem2 = GridMovement.isMonster2inPlayerRange();
    		if(inRangem2 == 1) {
    			label4.setText(null);
    			if(timerDone == 1) {
    				timer(5,1);
    				label5.setText(LoadedCharacters.SelectedMonsterCreatures.get(1).creatureName+" disarmed for 5 seconds!");
    				GridMovement.Monster2Movement();
    			}
    		}
    		
    	}
    	   	
    }
    
    public static void setplayerIcononGrid() {
		int pos = LoadedCharacters.PlayerCreatures.get(0).getBGridpos();
		
		String avadirec = "Phase3/Playerimg/" + LoadedCharacters.PlayerCreatures.get(0).AvatarNo;
		ImageIcon icon1 = new ImageIcon(avadirec);
		Image i1 = icon1.getImage();
        Image new_image1 = i1.getScaledInstance(110,110,Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(new_image1);
        
		GButton.get(pos).setIcon(icon1);
		GButton.get(pos).setToolTipText(LoadedCharacters.PlayerCreatures.get(0).creatureName);
	}
    
    public static void setMonster1IcononGrid() {
    	int pos1  = LoadedCharacters.SelectedMonsterCreatures.get(0).getBGridpos();
    	if(LoadedCharacters.SelectedMonsterCreatures.get(0).getisDead() == 0) {
        	String avadirec = "Phase3/Monsterimg/" + LoadedCharacters.SelectedMonsterCreatures.get(0).AvatarNo;
        	ImageIcon icon1 = new ImageIcon(avadirec);
    		Image i1 = icon1.getImage();
            Image new_image1 = i1.getScaledInstance(110,110,Image.SCALE_SMOOTH);
            icon1 = new ImageIcon(new_image1);
    		GButton.get(pos1).setIcon(icon1);
    		GButton.get(pos1).setToolTipText(LoadedCharacters.SelectedMonsterCreatures.get(0).creatureName);
    	}
    	else { //isDead == 1
    		GButton.get(pos1).setIcon(null);
    		GButton.get(pos1).setToolTipText(null);
    		LoadedCharacters.SelectedMonsterCreatures.set(0,null);
    	}
    	
    }
    
    public static void setMonster2IcononGrid() {
    	int pos2  = LoadedCharacters.SelectedMonsterCreatures.get(1).getBGridpos();
    	if(LoadedCharacters.SelectedMonsterCreatures.get(1).getisDead() == 0) {
			String avadirec2 = "Phase3/Monsterimg/" + LoadedCharacters.SelectedMonsterCreatures.get(1).AvatarNo;
			ImageIcon icon2 = new ImageIcon(avadirec2);
			Image i2 = icon2.getImage();
		    Image new_image2 = i2.getScaledInstance(110,110,Image.SCALE_SMOOTH);
		    icon2 = new ImageIcon(new_image2);
			GButton.get(pos2).setIcon(icon2);
			GButton.get(pos2).setToolTipText(LoadedCharacters.SelectedMonsterCreatures.get(1).creatureName);
    	}
    	else { //isDead == 1
    		GButton.get(pos2).setIcon(null);
    		GButton.get(pos2).setToolTipText(null);
    		LoadedCharacters.SelectedMonsterCreatures.set(1,null);
    	}
    }
    
    public static int hasWonGame() {
    	int PHp = LoadedCharacters.PlayerCreatures.get(0).HP;
    	//int m1Hp = LoadedCharacters.SelectedMonsterCreatures.get(0).HP;
    	//int m2Hp = LoadedCharacters.SelectedMonsterCreatures.get(1).HP;
    	if(PHp==0) {
    		return 0; //lost
    	}
    	else if(LoadedCharacters.SelectedMonsterCreatures.get(0) == null && LoadedCharacters.SelectedMonsterCreatures.get(1) == null) {
    		return 1; //win
    	}
    	else {
    		return 2; //not win or lose
    	}
    	
    }
    
    public static void WinorLoseGameEnd() {
    	int haswin = hasWonGame();
    	JFrame frame1 = new JFrame();
    	if(haswin == 0) { //lost
			String message = "Player "+LoadedCharacters.PlayerCreatures.get(0).creatureName+" has LOST!";
			JOptionPane.showMessageDialog(frame1, message);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}
    	if(haswin == 1) { //win
    		String message = "Player "+LoadedCharacters.PlayerCreatures.get(0).creatureName+" has WON!";
    		JOptionPane.showMessageDialog(frame1, message);
    		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}
    	
    }
    
    public static void timer(int seconds, int monsterno) {
	  TimerTask task = new TimerTask() {
	    public void run() {
	      timerDone = 1;
	      LoadedCharacters.SelectedMonsterCreatures.get(monsterno).setisDisarmed(0);
	      label5.setText(null);	
	    }
	  };
	  java.util.Timer timer = new java.util.Timer();
	  timerDone = 0;
      LoadedCharacters.SelectedMonsterCreatures.get(monsterno).setisDisarmed(1);
	  timer.schedule(task, seconds * 1000);
	}

}
