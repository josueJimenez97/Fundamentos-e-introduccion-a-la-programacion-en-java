public class Ejercicios{
    public int cantVocales(String nomb){
        int contador=0;
        nomb=nomb.toLowerCase();
        for(int i=0;i<nomb.length();i++){
            char x=nomb.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                contador++;
            }
        }
        return contador;
    }
    
    public String inverir(String cad){
        String res="";
        for(int i=0;i<cad.length();i++){
            res= cad.charAt(i)+res;
        }
        return res;
    }
    public String codificar(String cad){
        String res="";
        for(int i=0;i<cad.length();i++){
            char x=cad.charAt(i);
            if(x=='z'){
                x='a';
            }else{
                x++;
            }
            res=res+x;
        }
        return res;
    }
     public String decodificar(String cad){
        String res="";
        for(int i=0;i<cad.length();i++){
            char x=cad.charAt(i);
            if(x=='a'){
                x='z';
            }else{
                x--;
            }
            res=res+x;
        }
        return res;
    }
}
