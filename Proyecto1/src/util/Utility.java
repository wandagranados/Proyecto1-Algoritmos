/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Profesor Lic. Gilberth Chaves Avila
 */
public class Utility {

    public static int random(){
        return 1+(int) Math.floor(Math.random()*99); 
    }
    
    public static int random(int bound){
        //return 1+random.nextInt(bound);
        return 1+(int) Math.floor(Math.random()*bound); 
    }
    
    public static String format(double value){
        return new DecimalFormat("###,###,###,###.##")
                .format(value);
    }
    
    public static String $format(double value){
        return new DecimalFormat("$###,###,###,###.##")
                .format(value);
    }
     public static String perFormat(double value){
         //#,##0.00 '%'
        return new DecimalFormat("#,##0.00'%'")
                .format(value);
    }
     
    public static String dateFormat(Date value) {
        return new SimpleDateFormat("dd/MM/yyyy")
                .format(value);
    }

   public static boolean equals(Object a, Object b) {
        switch(instanceOf(a, b)){
            case "integer":
               Integer x =(Integer)a; Integer y = (Integer)b;
               return x.equals(y);
            case "string":
                String s1 =(String)a; String s2 = (String)b;
               //return s1.compareTo(s2)==0; //OPCION 1
               return s1.equalsIgnoreCase(s2); //OPCION 2
            case "person":
               // Person p1=(Person)a; Person p2=(Person)b;
               // return p1.getName().equals(p2.getName()) && p1.getMood().equals(p2.getMood());
            
           
                
        }
        return false; //en cualquier otro caso
    }

    public static String instanceOf(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer) return "integer";
        //if(a instanceof Person && b instanceof Person) return "person";
        return "unknown"; //desconocido
    }
    
     public static boolean lessT(Object a, Object b) {
        switch(instanceOf(a, b)){
            case "integer":
               Integer x =(Integer)a; Integer y = (Integer)b;
               return x<y;
            case "string":
                String s1 =(String)a; String s2 = (String)b;
               return s1.compareTo(s2)<0;
        }
        return false; //en cualquier otro caso
    }
     

    public static boolean greaterT(Object a, Object b) {
        switch(instanceOf(a, b)){
            case "integer":
               Integer x =(Integer)a; Integer y = (Integer)b;
               return x>y;
            case "string":
                String s1 =(String)a; String s2 = (String)b;
               return s1.compareTo(s2)>0;
        }
        return false; //en cualquier otro caso
    }


}
