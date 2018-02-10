package Escuela;

public class Alumno {
    private String matricula;
    private String nombre;
    private String sexo;
    private String curso;
    
    
    
    //Creacion de constructor por defecto
    
    public Alumno(){
        
    }
    
    //Constructor con dos parametros
    
  public Alumno(String mat, String nomb){
        this.matricula=mat;
        this.nombre=nomb;
    }  
  //Constructor con tres parametros
    
   public Alumno(String mat, String nomb, String sexo){
        this.matricula=mat;
        this.nombre=nomb;
        this.sexo=sexo;
    }
    //Constructor con cuatro parametros
    
   public Alumno(String mat, String nomb, String sexo, String curso){
        this.matricula=mat;
        this.nombre=nomb;
        this.sexo=sexo;
        this.curso=curso;
    }

   
   
   
   public void setMatricula(String matricula){
         this.matricula = matricula;   
    }
    
    public void setNombre(String nombre){
         this.nombre = nombre;    
    }
    
    public void setSexo(String sexo){
         this.sexo = sexo;    
    }
    
    public void setCurso(String curso){
         this.curso=curso;   
    }
    
    /* Metodo Get...*/
    public String getMatricula(){
         return matricula;
    }
         
       
    public String getNombre(){
         return nombre;
    }    
     
         
         
     public String getSexo(){
         return sexo;
     }
         
     public String getCurso(){
         return curso;
    
    }
}
