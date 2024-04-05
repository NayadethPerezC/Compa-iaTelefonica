public class Cliente {
    private String rut;
    private String nombre;
    private int edad;
    private char sexo;
    private Celular celular;


    public Cliente(String rut, String nombre, int edad, char sexo, Celular celular) throws Exception{
        if(edad<18){
            throw new Exception("El cliente debe ser mayor de edad");
        }
        if(rut.length()!= 10){
            throw new Exception("El largo del rut debe ser de 10");
        }

        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.celular = celular;
    }


    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public String toString(){
        String retorno = "Los datos del cliente son:\n Rut: %s\n Nombre: %s\n Edad: %s\n Sexo: %s\n Celular:%s ".formatted(this.rut, this.nombre, 
        this.edad, this.sexo, this.celular);
        return retorno;
    }

    public void modificarCelular(String nuevoNum){
        this.celular.setNumero(nuevoNum);
    }
}