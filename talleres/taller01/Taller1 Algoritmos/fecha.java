public class fecha{
    int dia;
    int mes;
    int año;
    public fecha(int año, int mes,int dia){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    int dia() {return dia;}
    int mes() {return mes;}
    int año() {return año;}

    String ToString(fecha f) {return dia + "/"+ mes+"/"+ año;}


    boolean Comparariguales(fecha fecha1,fecha fecha2){
        int dia1=fecha1.dia();
        int mes1=fecha1.mes();
        int año1= fecha1.año();

        int dia2=fecha2.dia();
        int mes2=fecha2.mes();
        int año2= fecha2.año();
        if(dia1==dia2&&mes1==mes2&&año1==año2){
            return true;
        }else{
            return false;
        }
    }
 
    void Comparar(fecha fecha1,fecha fecha2){
        int dia1=fecha1.dia();
        int mes1=fecha1.mes();
        int año1= fecha1.año();

        int dia2=fecha2.dia();
        int mes2=fecha2.mes();
        int año2= fecha2.año();
        if(año1==año2){
            if(mes1==mes2){
                if(dia1==dia2){
                   System.out.print("la fechas son iguales");
                }else{
                     if(dia1<dia2){ System.out.print("la fecha " + dia1 +" / "+ mes1 +" / " + año1 +" es menor que "
                                   + dia2 +" / "+ mes2 + " / " + año2);
                     }else{
                                   System.out.print("la fecha " + dia1 +" / "+ mes1 +" / " +año1 +" es mayor que "
                                    + dia2 +" / "+ mes2 + " / " + año2);
                     }
                }   
          }else{
            if(mes1<mes2){ 
                     System.out.print("la fecha " + dia1 +" / "+ mes1 +" / " +año1 +" es menor que "
                     + dia2 +" / "+ mes2 + " / " + año2);
            }else{
                     System.out.print("la fecha " + dia1 +" / "+ mes1 +" / " +año1 +" es mayor que "
                      + dia2 +" / "+ mes2 + " / " + año2);
            }
          }   

    }else{if(año1<año2){ 
                     System.out.print("la fecha " + dia1 +" / "+ mes1 +" / " +año1 +" es menor que "
                     + dia2 +" / "+ mes2 + " / " + año2);
            }else{
                     System.out.print("la fecha " + dia1 +" / "+ mes1 +" / " +año1 +" es mayor que "
                      + dia2 +" / "+ mes2 + " / " + año2);
            }
    }
  }
}

