package Escuela;

public class MiPrimerProyectoJava2 {

     public static void main(String[] args) {
      
      //Creo objeto en base a la clase

              Alumno alum1=new Alumno("0014-0201", "Van Wilder", "Masculino", "2do");
              Alumno alum2=new Alumno("0014-0202", "Wilkito Shadler", "Masculino", "2do");
              Alumno alum3=new Alumno("0014-0203", "Sandy Wish", "Masculino", "2do");
              Alumno alum4=new Alumno("0014-0204", "Guevara Linda", "Feminino", "2do");

    
      
      
        System.out.println(alum1.getMatricula());
        System.out.println(alum1.getNombre());
        System.out.println(alum1.getSexo());
        System.out.println(alum1.getCurso());
       
        
        System.out.println(alum2.getMatricula());
        System.out.println(alum2.getNombre());
        System.out.println(alum2.getSexo());
        System.out.println(alum2.getCurso());
        
        System.out.println(alum3.getMatricula());
        System.out.println(alum3.getNombre());
        System.out.println(alum3.getSexo());
        System.out.println(alum3.getCurso());
        
        System.out.println(alum4.getMatricula());
        System.out.println(alum4.getNombre());
        System.out.println(alum4.getSexo());
        System.out.println(alum4.getCurso());
    }
    
}