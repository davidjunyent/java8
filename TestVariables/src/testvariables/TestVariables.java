package testvariables;

import java.math.BigDecimal;


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


       /* System.out.println(new Date());
        
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
        }*/

        Double a = 0.02;
        Double b = 0.03;
        double c = b - a;
        
        System.out.println(b);
        
        System.out.println(c);

        BigDecimal bigA = new BigDecimal(a);
        BigDecimal bigB = new BigDecimal(b);
        
        c= bigB.subtract(bigA).doubleValue();
               
        System.out.println(c);

        
        
    }

}
