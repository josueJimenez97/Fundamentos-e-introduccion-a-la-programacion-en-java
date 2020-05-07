public class Robot{
    private int energiaMax,energia;
    public Robot(int energiaMax){
        this.energiaMax=energiaMax;
        energia=0;
    }
    public void cargarEnergia(){
        energia=energiaMax;
    }
    public int cantVueltas(int perimetro){
        int vueltas=0;
        int energiaNecesito=perimetro;
        while(energia>=energiaNecesito){
            energia=energia-energiaNecesito;
            vueltas++;
            energiaNecesito=energiaNecesito+perimetro;
            
        }
        return vueltas;
    }
    public int cantVueltas2(int perimetro){
        int vueltas=0;
        for(int energiaNecesito=perimetro;energia>=energiaNecesito;energiaNecesito+=perimetro){
            energia=energia-energiaNecesito;
            vueltas++;
        }
        return vueltas;
    }
}
