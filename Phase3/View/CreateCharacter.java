//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.View;
import Phase3.Controller.FileIO;

import Phase3.Controller.Modifiers;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.ArithmeticException;

public class CreateCharacter extends JFrame implements ActionListener{
	private static final long serialVersionUID = 6340574883330304471L;
	Label label1,label2,label3,label4,label5,exlabel;
	JLabel label6;
	public static JLabel char_label,weapon_label;
    TextField text1,text2,text3,text4;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18; 
    public static String PpweaponNameList,PpweaponDamageList; 
    public static int PpbonusDamageList;
    public static String avaNo,Name,cdate;
    public static int STR,DEX,CON,HP,AC;

    public CreateCharacter(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel p = new JPanel();
        label1 = new Label("Choose Avatar: ");
        ImageIcon icon1 = new ImageIcon("Phase3/Playerimg/1.png");
        ImageIcon icon2 = new ImageIcon("Phase3/Playerimg/2.png");
        ImageIcon icon3 = new ImageIcon("Phase3/Playerimg/3.png");
        ImageIcon icon4 = new ImageIcon("Phase3/Playerimg/4.png");
        ImageIcon icon5 = new ImageIcon("Phase3/Playerimg/5.png");
        ImageIcon icon6 = new ImageIcon("Phase3/Playerimg/6.png");
        ImageIcon icon7 = new ImageIcon("Phase3/Playerimg/7.png");
        ImageIcon icon8 = new ImageIcon("Phase3/Playerimg/8.png");
        ImageIcon icon9 = new ImageIcon("Phase3/Playerimg/9.png");
        ImageIcon icon10 = new ImageIcon("Phase3/Playerimg/10.png");
        ImageIcon icon11 = new ImageIcon("Phase3/Playerimg/11.png");
        ImageIcon icon12 = new ImageIcon("Phase3/Playerimg/12.png");
        ImageIcon icon13 = new ImageIcon("Phase3/Playerimg/13.png");
        ImageIcon icon14 = new ImageIcon("Phase3/Playerimg/14.png");
        ImageIcon icon15 = new ImageIcon("Phase3/Playerimg/15.png");
        
        Image i1 = icon1.getImage();
        Image new_image1 = i1.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(new_image1);
        Image i2 = icon2.getImage();
        Image new_image2 = i2.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(new_image2);
        Image i3 = icon3.getImage();
        Image new_image3 = i3.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(new_image3);
        Image i4 = icon4.getImage();
        Image new_image4 = i4.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(new_image4);
        Image i5 = icon5.getImage();
        Image new_image5 = i5.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon5 = new ImageIcon(new_image5);
        Image i6 = icon6.getImage();
        Image new_image6 = i6.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon6 = new ImageIcon(new_image6);
        Image i7 = icon7.getImage();
        Image new_image7 = i7.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon7 = new ImageIcon(new_image7);
        Image i8 = icon8.getImage();
        Image new_image8 = i8.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon8 = new ImageIcon(new_image8);
        Image i9 = icon9.getImage();
        Image new_image9 = i9.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon9 = new ImageIcon(new_image9);
        Image i10 = icon10.getImage();
        Image new_image10 = i10.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon10 = new ImageIcon(new_image10);
        Image i11 = icon11.getImage();
        Image new_image11 = i11.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon11 = new ImageIcon(new_image11);
        Image i12 = icon12.getImage();
        Image new_image12 = i12.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon12 = new ImageIcon(new_image12);
        Image i13 = icon13.getImage();
        Image new_image13 = i13.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon13 = new ImageIcon(new_image13);
        Image i14 = icon14.getImage();
        Image new_image14 = i14.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon14 = new ImageIcon(new_image14);
        Image i15 = icon15.getImage();
        Image new_image15 = i15.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon15 = new ImageIcon(new_image15);
        
        button1 = new JButton(icon1);
        button2 = new JButton(icon2);
        button3 = new JButton(icon3);
        button4 = new JButton(icon4);
        button5 = new JButton(icon5);
        button6 = new JButton(icon6);
        button7 = new JButton(icon7);
        button8 = new JButton(icon8);
        button9 = new JButton(icon9);
        button10 = new JButton(icon10);
        button11 = new JButton(icon11);
        button12 = new JButton(icon12);
        button13 = new JButton(icon13);
        button14 = new JButton(icon14);
        button15 = new JButton(icon15);
        button1.setPreferredSize(new Dimension(100, 100));
        button2.setPreferredSize(new Dimension(100, 100));
        button3.setPreferredSize(new Dimension(100, 100));
        button4.setPreferredSize(new Dimension(100, 100));
        button5.setPreferredSize(new Dimension(100, 100));
        button6.setPreferredSize(new Dimension(100, 100));
        button7.setPreferredSize(new Dimension(100, 100));
        button8.setPreferredSize(new Dimension(100, 100));
        button9.setPreferredSize(new Dimension(100, 100));
        button10.setPreferredSize(new Dimension(100, 100));
        button11.setPreferredSize(new Dimension(100, 100));
        button12.setPreferredSize(new Dimension(100, 100));
        button13.setPreferredSize(new Dimension(100, 100));
        button14.setPreferredSize(new Dimension(100, 100));
        button15.setPreferredSize(new Dimension(100, 100));
        p.add(label1, BorderLayout.NORTH);
        p.add(button1, BorderLayout.NORTH);
        p.add(button2, BorderLayout.NORTH);
        p.add(button3, BorderLayout.NORTH);
        p.add(button4, BorderLayout.NORTH);
        p.add(button5, BorderLayout.NORTH);
        p.add(button6, BorderLayout.NORTH);
        p.add(button7, BorderLayout.NORTH);
        p.add(button8, BorderLayout.NORTH);
        p.add(button9, BorderLayout.NORTH);
        p.add(button10, BorderLayout.NORTH);
        p.add(button11, BorderLayout.NORTH);
        p.add(button12, BorderLayout.NORTH);
        p.add(button13, BorderLayout.NORTH);
        p.add(button14, BorderLayout.NORTH);
        p.add(button15, BorderLayout.NORTH);
        add(p);

        label2 = new Label("Add STR: ");
        label3 = new Label("Add DEX: ");
        label4 = new Label("Add CON: ");
        label5 = new Label("Enter Name: ");
        label6  = new JLabel("No Player Created Yet!");
        button17 = new JButton("CREATE");
        button17.setPreferredSize(new Dimension(100, 100));
        button17.setFont(new Font("Courier", Font.BOLD, 10));
        button18 = new JButton("SELECT WEAPON");
        button18.setPreferredSize(new Dimension(150, 150));
        button18.setFont(new Font("Courier", Font.BOLD, 10));
        
        text1 = new TextField(20);
        text2 = new TextField(20);
        text3 = new TextField(20);
        text4 = new TextField(20);

        JPanel P2 = new JPanel();
        P2.add(label5,BorderLayout.CENTER);
        P2.add(text4,BorderLayout.CENTER);
        P2.add(label2,BorderLayout.CENTER);
        P2.add(text1,BorderLayout.CENTER);
        P2.add(label3,BorderLayout.CENTER);
        P2.add(text2,BorderLayout.CENTER);
        P2.add(label4,BorderLayout.CENTER);
        P2.add(text3,BorderLayout.CENTER);
        P2.add(button18,BorderLayout.CENTER);
        P2.add(button17,BorderLayout.CENTER);
        add(P2);

        JPanel P3 = new JPanel();
        button16 = new JButton("Back");
        button16.setPreferredSize(new Dimension(100, 100));
        button16.setFont(new Font("Courier", Font.BOLD, 10));
        P3.add(button16, BorderLayout.SOUTH);
        label6.setFont(new Font("Verdana", Font.PLAIN, 14));
        label6.setHorizontalAlignment(JLabel.CENTER);
        label6.setPreferredSize(new Dimension(450, 50));
        Border border = BorderFactory.createLineBorder(Color.BLUE);
        label6.setBorder(border);
        P3.add(label6,BorderLayout.NORTH);
        
        char_label = new JLabel();
        weapon_label = new JLabel();
        P3.add(char_label,BorderLayout.NORTH);
        P3.add(weapon_label,BorderLayout.SOUTH);
        
        add(P3);
        
        setTitle("CREATE CHARACTER");
        Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
        setSize(screenSize.width,screenSize.height);
        setVisible(true);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        button18.addActionListener(this);

    }

    public void actionPerformed(ActionEvent action){
        
        try{
            if(action.getSource()==button1){
                avaNo="1.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/1.png"));
            }
            if(action.getSource()==button2){
                avaNo="2.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/2.png"));
            }
            if(action.getSource()==button3){
                avaNo="3.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/3.png"));
            }
            if(action.getSource()==button4){
                avaNo="4.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/4.png"));
            }
            if(action.getSource()==button5){
                avaNo="5.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/5.png"));
            }
            if(action.getSource()==button6){
                avaNo="6.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/6.png"));
            }
            if(action.getSource()==button7){
                avaNo="7.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/7.png"));
            }
            if(action.getSource()==button8){
                avaNo="8.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/8.png"));
            }
            if(action.getSource()==button9){
                avaNo="9.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/9.png"));
            }
            if(action.getSource()==button10){
                avaNo="10.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/10.png"));
            }
            if(action.getSource()==button11){
                avaNo="11.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/11.png"));
            }
            if(action.getSource()==button12){
                avaNo="12.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/12.png"));
            }
            if(action.getSource()==button13){
                avaNo="13.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/13.png"));
            }
            if(action.getSource()==button14){
                avaNo="14.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/14.png"));
            }
            if(action.getSource()==button15){
                avaNo="15.png";
                char_label.setIcon(new ImageIcon("Phase3/Playerimg/15.png"));
            }
            if(action.getSource()==button18){
                new weaponView();
            }
            if(action.getSource()==button17){
            	if(FileIO.pNames.size()>4) {
            		label6.setText("More than 4 unsaved players cannot be created!");
            	}
            	else {
           
		            Name = text4.getText();
		            STR = Integer.parseInt(text1.getText());
		            DEX = Integer.parseInt(text2.getText());
		            CON = Integer.parseInt(text3.getText());
		            String LD_PATTERN = "MM/dd/yyyy";
		            DateTimeFormatter LD_FORMATTER = DateTimeFormatter.ofPattern(LD_PATTERN);
		            cdate = LD_FORMATTER.format(LocalDateTime.now());
		            HP = Modifiers.HPwithModifier(CON);
		            AC = Modifiers.ACwithModifier(DEX);
		            if(STR==-1||DEX==-1||CON==-1||HP==-1||AC==-1||PpbonusDamageList==-1){ 
		                throw new InputMismatchException("All entries not inputed");
		            }
		            if(PpweaponNameList.equals(" ")||PpweaponDamageList.equals(" ")||avaNo.equals(" ")||Name.equals(" ")||cdate.equals(" ")){
		                throw new InputMismatchException("All entries not inputed");
		            }
		            if((STR+DEX+CON)>15){
		                throw new ArithmeticException("Total of STR, CON and DEX cannot exceed 15!");
		            }
		            Pattern p3 = Pattern.compile("[\\]`\"\\[~{}\\\\$&+,:;=?@#|'<>.^*()%!-]");
		            Matcher m3 = p3.matcher(Name);
		            if(m3.find()) {
		            	throw new IllegalStateException("Special characters in player name is not allowed.");
		            }
		            Pattern p2 = Pattern.compile("[0-9]");
		            Matcher m2 = p2.matcher(Name);
		            if(m2.find()) {
		            	throw new IllegalArgumentException("Player name cannot be only numerical.");
		            }
		            if(Name.length()>7) {
		            	throw new ArithmeticException("Player Name cannot exceed more than 7 characters!");
		            }
		            FileIO.saveCreatedCharacterinArrayList(avaNo,cdate,Name,STR,DEX,CON,HP,AC,PpweaponNameList,PpweaponDamageList,PpbonusDamageList);
		            String lstr = Name+" Player has been Created!";
		            label6.setText(lstr);
		            text1.setText(null);
		            text2.setText(null);
		            text3.setText(null);
		            text4.setText(null);
		            char_label.setIcon(null);
		            weapon_label.setIcon(null);
		            PpweaponNameList=" "; 
		            PpweaponDamageList=" "; 
		            PpbonusDamageList=-1;
		            avaNo=" ";
		            Name=" ";
		            cdate=" ";
		            STR=-1;
		            DEX=-1;
		            CON=-1;
		            HP=-1;
		            AC=-1;
            	}
            }
            if(action.getSource()==button16){
            	PpweaponNameList=" "; 
                PpweaponDamageList=" "; 
                PpbonusDamageList=-1;
                avaNo=" ";
                Name=" ";
                cdate=" ";
                STR=-1;
                DEX=-1;
                CON=-1;
                HP=-1;
                AC=-1;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                new MainMenu();
                dispose();
            }
    
        }
        catch(NumberFormatException e){
            label6.setText("All entries not inputed or Invalid input!");

        }
        catch(InputMismatchException e){
            label6.setText("All entries not inputed or Invalid input!");

        }
        catch(ArithmeticException e){
            String str = e.toString();
            String str2 = str.replace("java.lang.ArithmeticException: ","");
        	label6.setText(str2);

        }
        catch(IllegalArgumentException e) {
        	label6.setText("Player name cannot be only numerical!");
        }
        catch(IllegalStateException e) {
        	label6.setText("Special characters in player name is not allowed!");
        }
        
        
    }



}






