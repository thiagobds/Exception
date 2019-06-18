package Questao1;

public abstract class ave extends animal{
    
    private boolean Voa;
    
    public abstract void talk(); 
    
    public ave(String n, boolean v){
    
        super(n);
        this.setVoa(v);
    }
    public boolean getVoa(){
    
        return this.Voa;
    }
    public void setVoa(boolean v){
  
        this.Voa = v;
    }
  
    
  
    
}