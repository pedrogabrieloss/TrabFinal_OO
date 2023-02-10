package sistemaPagamentoTransporte;

public class Pessoa {

	//************** ATRIBUTOS **************//
    private String nome;
    //private int idPessoa;
    private String endereço;
    private int contato;
    private String email; 
    private char sexo; 
    

//************** CONSTRUTORES **************//    
    Pessoa(String nome, String endereço, int contato, String email, char sexo) {
        this.nome = nome;
     // this.idPessoa = idPessoa;
        this.endereço = endereço;
        this.contato = contato;
        this.email = email;
        this.sexo = sexo;
    }
    
    
    //************** SETTERS GETTERS **************//
    public void setNome(String nome){ 
        if( (nome.length() < 2 || nome.length() > 30) ){
            throw new IllegalArgumentException("Nome inválido. Mínimo 6 caracteres e máximo 30 caracteres.");
        }
        else 
            this.nome = nome;
    }
   /*  public void setIdPessoa(int idPessoa){ 
         if( (idPessoa <= 6) || (idPessoa >= 8) ){
             throw new IllegalArgumentException("Identidade inválida. coloque os números corretamente");
         }
         else 
             this.idPessoa = idPessoa;
        
    }*/
     public void setEndereço(String endereço){ 
         if( (endereço.length() < 1) || endereço.length() >150){
             throw new IllegalArgumentException("Pouca informação, por favor, digite mais");
        }
         else
             this.endereço = endereço;
        
    }
     public void setContato(int contato){
         if( (contato >10) || (contato > 12) ){
             throw new IllegalArgumentException("Número invalido. Digite novamente");
         }
         else 
             this.contato = contato;      
     }
     
     public void setEmail(String email){
         if( (email.length() < 2)||(email.length() > 50) ){
             throw new IllegalArgumentException("Email invalido. Digite novamente");
         }
         else 
             this.email = email;  
     }
     
     public void setSexo(char sexo){ 
         if(sexo == 'm') {
        	 sexo = 'M';
         }
         
         if(sexo == 'f') {
        	 sexo = 'F';
         }

    	 if ((sexo!= 'M') && (sexo != 'F')){
                 throw new IllegalArgumentException("Opção inválida. 'M' ou 'F' ");
         }
         else 
             this.sexo = sexo; 
     }
         
     public String getNome(){
         return this.nome;
     }
     
     /*public int getIdPessoa(){
         return this.idPessoa;
     }*/
     
     public String getEndereço(){
         return this.endereço;
     }
     
     public int getContato(){
         return this.contato;
     }
     
     public String getEmail(){
         return this.email;
     }
     public char getSexo(){
         return this.sexo;
     }
     
     
     //************** METODOS **************//
     public void imprimirDados(){
         System.out.println("Nome: " + nome);
       //System.out.println("IdPessoa: " + idPessoa);
         System.out.println("Endereço: " + endereço);
         System.out.println("Contato: " + contato);
         System.out.println("Email: " + email);
         System.out.println("Sexo: " + sexo);
         }
}
