public class App {
    public static void main(String[] args) throws Exception {
        //Se crean 3 celulares
        Celular cell1= new Celular("223", "47186719", "Vivo");
        Celular cell2= new Celular("113", "47186747", "Motorola");
        Celular cell3= new Celular("453", "89686719", "Samsung");
        //Se crean 3 clientes
        Cliente c1 = new Cliente("22987567-3", "Nayadeth Perez", 31, 'F', cell1);
        Cliente c2 = new Cliente("25258000-k", "Cristian Hernandez", 32, 'M', cell2);
        Cliente c3 = new Cliente("16098713-3", "Jorge Castro", 52, 'M', cell3);
        //Se crea una nueva compañía y se agregan 3 clientes
        Compania comp = new Compania("Wom", 50);
        comp.agregaCliente(c1);
        comp.agregaCliente(c2);
        comp.agregaCliente(c3); 
        // Se listan los clientes
        comp.listarClientes();
        //Se modifica el cliente segun su rut
        comp.modificarCliente("25258000-k", "12345668");
        //Se busca a cliente segun su Rut
        System.out.println(comp.buscarCliente("25258000-k"));

    }
}
