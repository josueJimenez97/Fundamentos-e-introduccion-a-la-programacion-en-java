public class Lote{
    private String propietario;
    private int cantPersonas;
    public Lote(int cant,String prop ){
        propietario=prop;
        cantPersonas=cant;
    }
    public String mostrarDatos(){
        return "("+cantPersonas+","+propietario+")";
    }
    public String getPropietario(){
        return propietario;
    }
    public int getCantPersonas(){
        return cantPersonas;
    }
    public void setPropietario(String prop){
        propietario=prop;
    }
    public void setCantPersonas(int cant){
        cantPersonas=cant;
    }
}
