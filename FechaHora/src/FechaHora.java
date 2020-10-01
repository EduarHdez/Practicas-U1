

import java.util.Date;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class FechaHora {
    private int dia;
    private int mes;
    private int año;
    private int hora;
    private int minuto;

    public void Hoy(){
        
        Date Fecha= new Date();
            dia= Fecha.getDate();
            mes = Fecha.getMonth();
            mes++;
            año = Fecha.getYear();
            año+=1900;
            hora = Fecha.getHours();
            minuto = Fecha.getMinutes();
            System.out.print(dia);
    }
    
    public String FechaLarga(){
        String cadena="";
        switch(mes){
            case 1: cadena=dia+" De Enero del "+año; break;
            case 2: cadena=dia+" De Febrero del "+año;break;
            case 3: cadena=dia+" De Marzo del "+año;break;
            case 4: cadena=dia+" De Abril del "+año;break;
            case 5: cadena=dia+" De Mayo del "+año;break;
            case 6: cadena=dia+" De Junio del "+año;break;
            case 7: cadena=dia+" De Julio del "+año;break;
            case 8: cadena=dia+" De Agosto del "+año;break;
            case 9: cadena=dia+" De Septiembre del "+año;break;
            case 10: cadena=dia+" De Octubre del "+año;break;
            case 11: cadena=dia+" De Noviembre del "+año;break;
            case 12: cadena=dia+" De Diciembre del "+año;break;
            default: cadena="¡ERROR!, Facha incorrecta";
            
        }
        return cadena;
        
    }
    
    public String FechaCorta(){
        
        String cadena=dia+"/"+mes+"/"+año;    
        return cadena;
    }
    
    public String Formato12(){
        String cadena="";
        if(hora<12){
            cadena=hora+":"+minuto+"am";
        }else if(hora==13){
            hora=1;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==14){
            hora=2;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==15){
            hora=3;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==16){
            hora=4;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==17){
            hora=5;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==18){
            hora=6;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==19){
            hora=7;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==20){
            hora=8;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==21){
            hora=9;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==22){
            hora=10;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==23){
            hora=11;
            cadena=hora+":"+minuto+"pm";
        }else if(hora==24){
            hora=12;
            cadena=hora+":"+minuto+"am";
        }else{
            cadena="ERROR";
        }
        return cadena;
    }
    
    public String Formato24(){
        String cadena=hora+":"+minuto+" Horas";
        return cadena;
    }
    
}
