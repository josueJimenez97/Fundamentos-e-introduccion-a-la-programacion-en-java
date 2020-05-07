public class DiasSemanaSwitch{
    public String diasSemana(int n){
        String res;
        switch(n){
            case 1: res = "Lunes"; break;
            case 2: res = "Martes"; break;
            case 3: res = "Miercoles"; break;
            case 4: res = "Jueves"; break;
            case 5: res = "Viernes"; break;
            case 6: res = "Sabado"; break;
            case 7: res = "Domingo"; break;
            default: res = "El numero indicado no corresponde a nada";
        }
        return res;
    }
}
