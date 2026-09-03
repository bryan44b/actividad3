public class tv {

 private int canal;
 private int volumen;
 private boolean estado;

 public tv(int canal, int volumen, boolean estado){
     this.canal = canal;
     this.volumen = volumen;
     this.estado = estado;
 }

 public boolean encender(){
   if (!this.estado){
       System.out.println("La tv se ha encendido");
       return estado = true;
     }else{
       System.out.println("\nLa tele ya esta encendida");
   }


     return estado = true;
 }

    public boolean apagar(){
        if (this.estado){
            System.out.println("\nLa tv se ha apagado");
            return false;
        }
            else{
            System.out.println("\nLa tv ya esta apagada");
        }
        return false;
    }

    public void setcanal(int nuevoCanal){
     if(this.estado){
         this.canal = nuevoCanal;
     }else{
         System.out.println("\nLa tv esta apagada");
     }

    }

    public void upCanal(){
     if(this.estado){
         this.canal +=1;
         System.out.printf("\nEl canal es: %n"+ this.canal);
     }
     else{
         System.out.println("\nLa tv esta apagada");
     }


    }

    public void downCanal(){
        if(this.estado){
            this.canal -=1;
            System.out.printf("\nEl canal es: %n"+ this.canal);
        }
        else{
            System.out.println("\nLa tv esta apagada");
        }

    }

    public void upVolumen(){
        if(this.estado){
            this.volumen +=1;
            System.out.printf("\nEl volumen es: %n"+ this.volumen);
        }
        else{
            System.out.println("\nLa tv esta apagada");
        }
    }
    public void downVolumen(){
        if(this.estado){
            this.volumen -=1;
            System.out.printf("\nEl volumen es: %n"+ this.volumen);
        }
        else{
            System.out.println("\nLa tv esta apagada");
        }
    }




}
