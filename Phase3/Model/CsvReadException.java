//Name : Mubtasim Ahmed Rakheen
//UTA ID: 1001848135
//CSE 1325 PROF ALEX DILLHOF
package Phase3.Model;

public class CsvReadException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String data;
    public CsvReadException(String data){
        this.data = data;
    }

    public String toString(){
        return "CsvReadException"+"  "+this.data;
    }

}