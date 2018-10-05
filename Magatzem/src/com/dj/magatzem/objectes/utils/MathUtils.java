package com.dj.magatzem.objectes.utils;


public class MathUtils {

    public static int getRandomInt(int from, int to){
        final double randomNum=Math.random();
        
        double resultat=(to-from)*randomNum;
        
        return from+(int)resultat;
    }
    public static double sum(final double valor1,final double valor2, final double ...valorsAdicional){
        double result=valor1+valor2;
        if(valorsAdicional!=null)
            for (double valor:valorsAdicional)
                result+=valor;
        
        return result;
    }
   public static int max(int a, int b){
        Logger.getInstance().debug("al de dos ints");
        return a>b?a:b;
   }
   public static int max(int a, Integer b){
        Logger.getInstance().debug("al int i un Integer");
        return a>b?a:b;
   }
   public static double max(int a, double b){
        Logger.getInstance().debug("al de un int i un double");
        return a>b?a:b;
   }
   public static double max(double a, double b){
        Logger.getInstance().debug("al de dos doubles");
        return a>b?a:b;
   }
    
    @SuppressWarnings("unused")
	public static void main(String ...args){
        
        Logger.getInstance().debug(MathUtils.getRandomInt(20, 25));
        
        Logger.getInstance().error(MathUtils.sum(1, 2, 3));
        
        int j=3, k=4;
        float l=2.2F,m=3.5F;
        double n=9,o=6.5F;
        
        max(l,k);
        max(k,l);
        
        max(j,n);
        
        Integer myInteger=5;
        Integer myInteger2=2;
        
        myInteger=max(j,myInteger);
        
        //max(myInteger,myInteger2);
    }
}

