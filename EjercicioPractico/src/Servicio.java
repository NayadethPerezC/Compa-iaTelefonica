public class Servicio {
    private String codigo;
    private String tipo;

    public Servicio(String codigo, String tipo) throws Exception{
        if(!tipo.equals("celular") && !tipo.equals("tv-cable") && !tipo.equals("internet")){
            throw new Exception("El tipo debe ser 'celular', 'tv-cable' o 'internet'"); 
        } 
        this.codigo = codigo;
        this.tipo = tipo;
    }
}
