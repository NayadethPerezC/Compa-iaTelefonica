public class Celular extends Servicio {

    private String numero;
    private String marca;
    
    public Celular(String codigo, String numero, String marca) throws Exception{
        super(codigo, "celular");
        if(numero.length() != 8){
            throw new Exception("El largo del numero debe ser 8");
        }

        this.numero= numero;
        this.marca=marca;

    }


    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String toString(){
        return "Marca= "+ marca + "/ Numero= " + numero;
    }
}
