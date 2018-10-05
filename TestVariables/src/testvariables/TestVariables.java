package testvariables;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


public class TestVariables {

    public static void testParametresPrimitiu(final double a, double b, double ...items){
        //a++;
        b++;
        for (double d:items){
            d=d+5;
        }
    }
    public static void testParametresObjectes(final Double a, Double b, Double ...items){
        //a++;
        b++;
        for (Double d:items){
            d=d+5;
        }
    }
    public static void main(String[] args) {


        System.out.println(new Date());
        
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        
        
        int [][] playersScores = new int[10][];
        for (int j=0;j<playersScores.length;j++) {
        	playersScores[j]=new int[(int)(Math.random()*10)];
        	for (int k=0;k<playersScores[j].length;k++) {
        		playersScores[j][k]=(int)(Math.random()*10);
        	}
        }
        
        
    }

}
