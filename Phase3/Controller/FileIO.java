//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.Controller;
import java.util.*;
import java.io.*;

public class FileIO{
    public static ArrayList <String> weaponNameList = new ArrayList<String>();
    public static ArrayList <String> weaponDamageList = new ArrayList<String>();
    public static ArrayList <Integer> bonusDamageList = new ArrayList<Integer>();
    public static void read_weaponinfo(String filename){ //.csv file
        weaponNameList.clear();
        weaponDamageList.clear();
        bonusDamageList.clear();
        try{
            File file = new File(filename);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                String[] arr = new String[data.length()];
                arr = data.split(",",data.length());
                weaponNameList.add(arr[0]);
                weaponDamageList.add(arr[1]);
                int val = Integer.parseInt(arr[2]);
                bonusDamageList.add(val);
            }
            scan.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File could not be found!!\n");
        }
    }

    public static ArrayList <String> pDates = new ArrayList<String>();
    public static ArrayList <String> pNames = new ArrayList<String>();
    public static ArrayList <Integer> pSTR = new ArrayList<Integer>();
    public static ArrayList <Integer> pDEX = new ArrayList<Integer>();
    public static ArrayList <Integer> pCON = new ArrayList<Integer>();
    public static ArrayList <Integer> pHP = new ArrayList<Integer>();
    public static ArrayList <Integer> pAC = new ArrayList<Integer>();
    public static ArrayList <String> pAvatarNo = new ArrayList<String>();
    public static ArrayList <String> pweaponNameList = new ArrayList<String>();
    public static ArrayList <String> pweaponDamageList = new ArrayList<String>();
    public static ArrayList <Integer> pbonusDamageList = new ArrayList<Integer>();

    public static void saveCreatedCharacterinArrayList(String avaNo, String chardate,String charname,int str,int dex,int con,int hp,int ac,String weaponNameList,String weaponDamageList,int bonusDamageList){
        pDates.add(chardate);
        pNames.add(charname);
        pSTR.add(str);
        pDEX.add(dex);
        pCON.add(con);
        pHP.add(hp);
        pAC.add(ac);
        pAvatarNo.add(avaNo);
        pweaponNameList.add(weaponNameList);
        pweaponDamageList.add(weaponDamageList);
        pbonusDamageList.add(bonusDamageList);
    }

    public static void write_playercharacterinfo(String avaNo,String weaponName, String weapondamage, int bonusDamage, String filename,String chardate,String charname,int str,int dex,int con,int hp,int ac) throws IOException{ //.csv file
        File myObj = new File(filename);
        if(myObj.createNewFile()){
            FileWriter myWriter = new FileWriter(filename);
            //format : creation_date,character_name,STR,DEX,CON,HP,AC
            myWriter.write(avaNo+","+chardate+","+charname+","+str+","+dex+","+con+","+hp+","+ac+","+weaponName+","+weapondamage+","+bonusDamage+"\n");
            myWriter.close();
        }  
        int i=0;
        for(i=0;i<pNames.size();i++){
            if(charname.equals(pNames.get(i))){
                pDates.remove(i);
                pNames.remove(i);
                pSTR.remove(i);
                pDEX.remove(i);
                pCON.remove(i);
                pHP.remove(i);
                pAC.remove(i);
                pAvatarNo.remove(i);
                pweaponNameList.remove(i);
                pweaponDamageList.remove(i);
                pbonusDamageList.remove(i);
                break;
            }
        }      
    }
    
    public static void write_playercharacterinfo_all(String avaNo,String weaponName, String weapondamage, int bonusDamage, String filename,String chardate,String charname,int str,int dex,int con,int hp,int ac) throws IOException{ //.csv file
        File myObj = new File(filename);
        if(myObj.createNewFile()){
            FileWriter myWriter = new FileWriter(filename);
            //format : creation_date,character_name,STR,DEX,CON,HP,AC
            myWriter.write(avaNo+","+chardate+","+charname+","+str+","+dex+","+con+","+hp+","+ac+","+weaponName+","+weapondamage+","+bonusDamage+"\n");
            myWriter.close();
        }  
            
    }

   
}




































