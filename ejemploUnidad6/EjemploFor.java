public class EjemploFor{
    
    public int calcularGastoEnergia(int perimetro, int cantVueltas){
        int res=0;
        int factor = 1;
        for(int i=0; i<cantVueltas; i++){
            res = res+(perimetro*factor);
            factor = factor+1;
        }
        return res;
    }
    public int calcularGastoEnergiaWhile(int perimetro, int cantVueltas){
        int res=0;
        int factor = 1;
        int i=0;
        while(i<cantVueltas){
            res = res+(perimetro*factor);
            factor = factor+1;
            i++;
        }
        return res;
    }
}
