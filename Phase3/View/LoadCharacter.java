//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.View;
import Phase3.Controller.LoadedCharacters;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.filechooser.*;

public class LoadCharacter extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8520351690757000594L;
	JLabel l,l2,l3;
    public LoadCharacter(){
        setTitle("LOAD CHARACTER");

        setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton button1 = new JButton("LOAD");

        JButton button2 = new JButton("OPEN");
        
        JButton button3 = new JButton("Back");
        

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        JPanel p = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        l2 = new JLabel("Player character files are saved at Phase3/Model/players");

        p.add(l2,BorderLayout.NORTH);
        p.add(button1,BorderLayout.CENTER);
        p.add(button2,BorderLayout.CENTER);
        p2.add(button3,BorderLayout.CENTER);
        l = new JLabel("no file selected");
        l3 = new JLabel();
        
        
        if(LoadedCharacters.PlayerCreatures.size()==1) {
		    String l3str = "Player: "+LoadedCharacters.PlayerCreatures.get(0).creatureName+"  ||  Weapon: "+LoadedCharacters.PlayerCreatures.get(0).getWeaponName();
			l3.setText(l3str);
			String istr = "Phase3/Playerimg/"+LoadedCharacters.PlayerCreatures.get(0).AvatarNo;
		    ImageIcon iconc = new ImageIcon(istr);
		    Image ic = iconc.getImage();
		    Image new_imagec = ic.getScaledInstance(300,300,Image.SCALE_SMOOTH);
		    iconc = new ImageIcon(new_imagec);
			l3.setIcon(iconc);
        }
        
        p.add(l,BorderLayout.CENTER);
        p.add(p2,BorderLayout.NORTH);
        add(p);
        
        p3.add(l3,BorderLayout.NORTH);
        add(p3);
        
        
        Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
        setSize(screenSize.width,screenSize.height);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent evt)
    {
        String com = evt.getActionCommand();
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        String filename="";
        if (com.equals("LOAD")) {
        	
            l.setText("no file selected");
            
            if(LoadedCharacters.PlayerCreatures.size()==1) {
		    	String l3str = "Player: "+LoadedCharacters.PlayerCreatures.get(0).creatureName+"  ||  Weapon: "+LoadedCharacters.PlayerCreatures.get(0).getWeaponName();
		    	l3.setFont(new Font("Verdana", Font.PLAIN, 14));
		    	l3.setText(l3str);
		    	String istr = "Phase3/Playerimg/"+LoadedCharacters.PlayerCreatures.get(0).AvatarNo;
		        ImageIcon iconc = new ImageIcon(istr);
		        Image ic = iconc.getImage();
		        Image new_imagec = ic.getScaledInstance(300,300,Image.SCALE_SMOOTH);
		        iconc = new ImageIcon(new_imagec);
		    	l3.setIcon(iconc);
            }
           
        }
        
        else if(com.equals("Back")) {
        	new MainMenu();
            dispose();
        }
 
        // if the user presses the open dialog show the open dialog
        else {
            // invoke the showsOpenDialog function to show the save dialog
            int r = j.showOpenDialog(null);
            // if the user selects a file
            if (r == JFileChooser.APPROVE_OPTION)
            {
                // set the label to the path of the selected file
                l.setText(j.getSelectedFile().getAbsolutePath());
                filename = j.getSelectedFile().getAbsolutePath();
                try {
    				LoadedCharacters.readSpecific_playercharacterinfo(filename);
    			} catch (FileNotFoundException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
            }
            // if the user cancelled the operation
            else{
                l.setText("no file selected");
            }
        
        }
        
    }
     

}
