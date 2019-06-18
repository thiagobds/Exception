package Questao1;

public abstract class mamifero extends animal {
    
    private int Patas;
    
    public mamifero(String n, int p){
    
        super(n);
        this.setPatas(p);
    }
    public int getPatas(){
    
        return this.Patas;
    }
    public void setPatas(int p){
    
        this.Patas = p;
    }
  public abstract void talk();
  
  
}
