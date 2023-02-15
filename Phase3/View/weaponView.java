//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.View;
import Phase3.Controller.FileIO;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class weaponView extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3067896508981322343L;
	public ArrayList<JButton> buttons = new ArrayList<JButton>();
    public weaponView(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel P = new JPanel();
        FileIO.read_weaponinfo("Phase3/Model/weapons.csv");
        int i=0;
        int x=0;
        ImageIcon icon;
        Image ii,newimage;
        for(i=0;i<FileIO.weaponNameList.size();i++){
        	x = i+1;
        	String img = "Phase3/Weaponimg/"+Integer.toString(x)+".png";
        	icon = new ImageIcon(img);
        	ii = icon.getImage();
            newimage = ii.getScaledInstance(100,100,Image.SCALE_SMOOTH);
            icon = new ImageIcon(newimage);
            String string = FileIO.weaponNameList.get(i)+" | "+"Damage: "+FileIO.weaponDamageList.get(i)+" | "+"Bonus: "+Integer.toString(FileIO.bonusDamageList.get(i));
            buttons.add(new JButton(icon));
            buttons.get(i).setText(string);
            buttons.get(i).setPreferredSize(new Dimension(289,150));
            buttons.get(i).setFont(new Font("Courier", Font.BOLD, 14));
            buttons.get(i).setVerticalTextPosition(JButton.TOP);
            buttons.get(i).setHorizontalTextPosition(JButton.CENTER);
            P.add(buttons.get(i));
            buttons.get(i).addActionListener(this);
        }

        setTitle("SELECT WEAPON");
        add(P);
        setLocationRelativeTo(null);
        setSize(1000,1000);
        pack();
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent action) {
        int j=0;
        int y=0;
        for(j=0;j<FileIO.weaponNameList.size();j++){
            if(action.getSource()==buttons.get(j)){
                CreateCharacter.PpweaponNameList = FileIO.weaponNameList.get(j);
                CreateCharacter.PpweaponDamageList = FileIO.weaponDamageList.get(j);
                CreateCharacter.PpbonusDamageList = FileIO.bonusDamageList.get(j);
                y=j+1;
                String img = "Phase3/Weaponimg/"+Integer.toString(y)+".png";
                ImageIcon iconW = new ImageIcon(img);
                Image ic = iconW.getImage();
                Image new_image1 = ic.getScaledInstance(260,260,Image.SCALE_SMOOTH);
                iconW = new ImageIcon(new_image1);
                CreateCharacter.weapon_label.setIcon(iconW);
                break;
            }  
        }
        dispose();
    }
	



}