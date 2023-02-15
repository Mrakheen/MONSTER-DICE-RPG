//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.View;
import Phase3.Controller.FileIO;
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveCharacter extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1863066398030135640L;
	JFrame frame;
	public static ArrayList<JButton> buttons = new ArrayList<JButton>();
    JButton buttonSall,bexit;
    JPanel P = new JPanel(new BorderLayout());
    JPanel P2 = new JPanel();
    JPanel P3 =  new JPanel();
    JPanel btnPanel;
    JPanel layout;
    JLabel label2;
    public SaveCharacter(){
    	frame = new JFrame();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        if(FileIO.pNames.size()==0){
            JLabel label = new JLabel("NO PLAYER IS CREATED!!");
            bexit = new JButton("Back");
            bexit.setPreferredSize(new Dimension(100,100));
            P3.add(label);
            P3.add(bexit); 
            bexit.addActionListener(this);
        }
        else{
        	label2 = new JLabel("NO PLAYER SAVED YET!!");
            P.setBorder(new EmptyBorder(2, 3, 2, 3));
            layout = new JPanel(new GridBagLayout());
            layout.setBorder(new EmptyBorder(5, 5, 5, 5));
            btnPanel = new JPanel(new GridLayout(10, 1, 10, 5));
            int i=0;
            for(i=0;i<FileIO.pNames.size();i++){
                String string = "SAVE PLAYER:  "+FileIO.pNames.get(i)+" | "+"STR: "+FileIO.pSTR.get(i)+" | "+"DEX: "+FileIO.pDEX.get(i)+" | "+"CON: "+FileIO.pCON.get(i)+" | "+"Weapon: "+FileIO.pweaponNameList.get(i);
                String istr = "Phase3/Playerimg/"+FileIO.pAvatarNo.get(i);
                ImageIcon iconc = new ImageIcon(istr);
                Image ic = iconc.getImage();
                Image new_imagec = ic.getScaledInstance(100,100,Image.SCALE_SMOOTH);
                iconc = new ImageIcon(new_imagec);
                buttons.add(new JButton(iconc));
                buttons.get(i).setText(string);
                buttons.get(i).setPreferredSize(new Dimension(600,100));
                btnPanel.add(buttons.get(i));
                buttons.get(i).addActionListener(this);

            }
            layout.add(btnPanel);
            P.add(layout, BorderLayout.CENTER);
            
            buttonSall = new JButton("SAVE ALL");
            buttonSall.setPreferredSize(new Dimension(100,100));
            P2.add(buttonSall);
            buttonSall.addActionListener(this);
            
            bexit = new JButton("Back");
            bexit.setPreferredSize(new Dimension(100,100));
            P2.add(bexit,BorderLayout.NORTH); 
            bexit.addActionListener(this);
            
            label2.setFont(new Font("Verdana", Font.PLAIN, 14));
            label2.setHorizontalAlignment(JLabel.CENTER);
            label2.setPreferredSize(new Dimension(350, 50));
            Border border = BorderFactory.createLineBorder(Color.BLUE);
            label2.setBorder(border);
            P2.add(label2,BorderLayout.SOUTH);
            
        }
        
     
        setTitle("SAVE CHARACTER");
        add(P3);
        add(P);
        add(P2);
        Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
        setSize(screenSize.width,screenSize.height);
        setVisible(true);
    }

	public void actionPerformed(ActionEvent action) {
        int j=0;
        
        if(action.getSource()==bexit){
        	if(FileIO.pNames.size()!=0) {
        		ImageIcon e = new ImageIcon("Phase3/Icons/exclaim.png");
            	Image ie = e.getImage();
                Image ec = ie.getScaledInstance(40,40,Image.SCALE_SMOOTH);
                e = new ImageIcon(ec);
    	    	 int a=JOptionPane.showConfirmDialog(frame,"All created characters will be removed!","SAVE CHARACTER", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,e);  
    	    	 if(a==JOptionPane.OK_OPTION){ 
    	    		FileIO.pDates.clear();
 	         		FileIO.pNames.clear();
 	         		FileIO.pSTR.clear();
 	         		FileIO.pDEX.clear();
 	         		FileIO.pCON.clear();
 	         		FileIO.pHP.clear();
 	         		FileIO.pAC.clear();
 	         		FileIO.pAvatarNo.clear();
 	         		FileIO.pweaponNameList.clear();
 	         		FileIO.pweaponDamageList.clear();
 	         		FileIO.pbonusDamageList.clear();
 	         		buttons.clear();
    	    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    	    System.out.print("\033[H\033[2J");
    	 	        System.out.flush();
    	 	    	new MainMenu();
    	 	        dispose();
    	    	 }
    	    	 if(a==JOptionPane.CANCEL_OPTION){  }
        	}
        	else {
        		System.out.print("\033[H\033[2J");
	 	         System.out.flush();
	 	    	 new MainMenu();
	 	         dispose();
        	}
	    	 
        }
        j=0;
        for(j=0;j<FileIO.pNames.size();j++){
            if(action.getSource()==buttons.get(j)){
                String filename = "Phase3/Model/players/"+FileIO.pNames.get(j)+".csv";
                try {
                	String lstr = "Player "+FileIO.pNames.get(j)+" has been saved!";
					label2.setText(lstr);
					FileIO.write_playercharacterinfo(FileIO.pAvatarNo.get(j),FileIO.pweaponNameList.get(j),FileIO.pweaponDamageList.get(j),FileIO.pbonusDamageList.get(j),filename,FileIO.pDates.get(j),FileIO.pNames.get(j),FileIO.pSTR.get(j),FileIO.pDEX.get(j),FileIO.pCON.get(j),FileIO.pHP.get(j),FileIO.pAC.get(j));
					buttons.get(j).setVisible(false);
					P.remove(buttons.get(j));
					buttons.remove(j);
					
                } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                break;
            }
        }
        if(action.getSource()==buttonSall){
            int k=0;
            try {
            	for(k=0;k<FileIO.pNames.size();k++){
                    String filename = "Phase3/Model/players/"+FileIO.pNames.get(k)+".csv";
					FileIO.write_playercharacterinfo_all(FileIO.pAvatarNo.get(k),FileIO.pweaponNameList.get(k),FileIO.pweaponDamageList.get(k),FileIO.pbonusDamageList.get(k),filename,FileIO.pDates.get(k),FileIO.pNames.get(k),FileIO.pSTR.get(k),FileIO.pDEX.get(k),FileIO.pCON.get(k),FileIO.pHP.get(k),FileIO.pAC.get(k));
					label2.setText("All created players have been saved!");
					buttons.get(k).setVisible(false);
					P.remove(buttons.get(k));
            	}
            	FileIO.pDates.clear();
          		FileIO.pNames.clear();
          		FileIO.pSTR.clear();
          		FileIO.pDEX.clear();
          		FileIO.pCON.clear();
          		FileIO.pHP.clear();
          		FileIO.pAC.clear();
          		FileIO.pAvatarNo.clear();
          		FileIO.pweaponNameList.clear();
          		FileIO.pweaponDamageList.clear();
          		FileIO.pbonusDamageList.clear();
          		buttons.clear();
				
            }catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
        }
        
    }





}