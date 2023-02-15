//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.View;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.border.EmptyBorder;

import Phase3.Controller.LoadedCharacters;

public class MainMenu extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7246164370672164201L;
	JButton button1,button2,button3,button4,button5;
    JMenuItem startItem,createItem,loadItem,saveItem,quitItem;
    // create a GUI with a menu, some buttons, and a drawing window of size width-by-height
    public MainMenu(){
    	try {
			LoadedCharacters.readMonsterData("Phase3/Model/monsters.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Configure layout
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Configure and add information label

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create first menu
        JMenu file = new JMenu("Menu");
        startItem = new JMenuItem("Start Game");
        createItem = new JMenuItem("Create Character");
        loadItem = new JMenuItem("Load Character");
        saveItem = new JMenuItem("Save Character");
        quitItem = new JMenuItem("EXIT");

        // Add listeners
        startItem.addActionListener(this);
        createItem.addActionListener(this);
        saveItem.addActionListener(this);
        loadItem.addActionListener(this);
        quitItem.addActionListener(this);

        // Add to JMenu
        file.add(startItem);
        file.add(createItem);
        file.add(loadItem);
        file.add(saveItem);
        file.add(quitItem);

        menuBar.add(file);

        //Center Panel
        JPanel center = new JPanel();
        center.setBorder(new EmptyBorder(10, 10, 10, 10));
        center.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

        add(new JLabel("<html><h1><strong><i>MONSTER DICE RPG</i></strong></h1><hr></html>"), gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JPanel buttons = new JPanel(new GridBagLayout());
        button1 = new JButton("Start Game");
        button2 = new JButton("Create Character");
        button3 = new JButton("Load Character");
        button4 = new JButton("Save Character");
        button5 = new JButton("Exit");
        
        buttons.add(button1, gbc);
        buttons.add(button2, gbc);
        buttons.add(button3, gbc);
        buttons.add(button4, gbc);
        buttons.add(button5, gbc);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        gbc.weighty = 1;
        add(buttons, gbc);

        // Frame configuration
        setTitle("MONSTER DICE RPG");
        add(center);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        pack();
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent action){
        if(action.getSource()==button1 || action.getSource()==startItem){
        	if(LoadedCharacters.PlayerCreatures.size()==0) {
        		JFrame frame2 = new JFrame();
        		String message = "No Player Character Loaded!";
    			JOptionPane.showMessageDialog(frame2, message);
    			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	}
        	else {
				new StartGame();
	            dispose();
        	}
        }
        if(action.getSource()==button2 || action.getSource()==createItem){
        	new CreateCharacter();
            dispose();
        }
        if(action.getSource()==button3 || action.getSource()==loadItem){
        	new LoadCharacter();
            dispose();
        }
        if(action.getSource()==button4 || action.getSource()==saveItem){
        	new SaveCharacter();
            dispose();
        }
        if(action.getSource()==button5 || action.getSource()==quitItem){
        	System.out.print("\033[H\033[2J");
            System.out.flush();
            dispose();
        	System.exit(0);
        }
        

    }
   
}