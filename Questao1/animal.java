package Questao1;

public abstract class animal {
    
    private String Nome;
    
    public abstract void talk();
    
    public animal(String n){
    
        this.setNome(n);
    }
    public String getNome(){
    
        return this.Nome;
    }
    public void setNome(String n){
    
        this.Nome = n;
    }
     public void imprime(){
     
         System.out.println(this.getNome());
     
     
     }
}