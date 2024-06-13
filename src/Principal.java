public class Principal {
    public static void main(String[] args) {
        ConsultaCEP newCep = new ConsultaCEP();
        Endereco novoEndereco = newCep.buscaEndereco("1");
        System.out.println(novoEndereco);
    }
}
