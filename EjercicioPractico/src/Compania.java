import java.util.ArrayList;

public class Compania {
    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static private int cantClientes= 0;
    private int capMaxima;



    public Compania(String nombre, int capMaxima) {
        this.nombre = nombre;
        this.capMaxima = capMaxima;
    }
    

    public void agregaCliente(Cliente cliente){
        clientes.add(cliente);

    }

    public Cliente buscarCliente(String rut) throws Exception{
        for(Cliente c : this.clientes){
            if(rut.equals(c.getRut())){
                return c;
            }
        }
        throw new Exception("Cliente no existe");
    }

    public void listarClientes(){
        for(Cliente c : this.clientes){
            System.out.println(c);
        }
    }

    public void modificarCliente(String rut, String numero) throws Exception{
        Cliente c = buscarCliente(rut);
        c.modificarCelular(numero);
    }

        // String[] palabras = {"we","fgh","kl"};
        // for (String palabra: palabras) {
        //     System.out.println(palabra);
        // }
    


}
