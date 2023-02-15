//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.Controller;

public class Modifiers{
    public static int HPwithModifier(int CONval){
        int CON_modifier=0;
        if(CONval<5){
            CON_modifier = CONval-1;
        }
        if(CONval>=5){
            CON_modifier = CONval+1;
        }
        return (50 + CON_modifier);
    }

    public static int ACwithModifier(int DEXval){
        int DEX_modifier=0;
        if(DEXval<5){
            DEX_modifier = DEXval-1;
        }
        if(DEXval>=5){
            DEX_modifier = DEXval+1;
        }
        return (15 + DEX_modifier);
    }

    public static int CON_mod(int CONval){
        int CON_modifier=0;
        if(CONval<5){
            CON_modifier = CONval-1;
        }
        else if(CONval>=5){
            CON_modifier = CONval+1; 
        }
        return CON_modifier;
    }

    public static int DEX_mod(int DEXval){
        int DEX_modifier=0;
        if(DEXval<5){
            DEX_modifier = DEXval-1;
        }
        else if(DEXval>=5){
            DEX_modifier = DEXval+1;
        }
        return DEX_modifier;
    }

    public static int STR_mod(int STRval){
        int STR_modifier1=0;
        if(STRval<5){
            STR_modifier1 = STRval-1;
        }
        else if(STRval>=5){
            STR_modifier1 = STRval+1;
        }
        return STR_modifier1;
    }



}