public class Jogador {
    
    private String NOME;
    private int xp;
    private int hp;
    private boolean envenenado;

    public Jogador(){
    
    }
    public String getNOME() {
        return NOME;
    }

    public Jogador(String nome){
        this.NOME = nome;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void receberDano(int pontos){
        this.xp -= (pontos);
    }
    public void receberCura(int pontos){
        this.hp += (pontos);
    }

    public void ganharExperiencia(int pontos){
        this.xp += (pontos); 
    }
    
    public void receberAntidoto(){
        
        if(this.envenenado == true){
            this.envenenado = false;
    }else{
        this.envenenado = true;
    }
        


    }
    



}
