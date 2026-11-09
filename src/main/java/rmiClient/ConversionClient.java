package rmiClient;

import rmiService.IConversion;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ConversionClient {

    public static void main(String[] args){
        try{
            Context ctx=new InitialContext();
            IConversion conv=(IConversion)ctx.lookup("rmi://localhost:1099/conversion");
            double res=conv.convertirMontant(200);
            System.out.println("resultat: "+res);
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
