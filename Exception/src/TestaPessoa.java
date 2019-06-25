public class TestaPessoa {
    
    public static void main(String[] args) {
        
        try {
            
            Pessoa p1 = new Pessoa("Thiago" , 21);
            
        } 
        
        catch (IdadeInvalidaException th) {
            
            System.out.println("Erro!");
            
        }
}
    
}
