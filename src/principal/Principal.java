
package principal;

import model.Trabajador;
import model.Funcionario;
import model.Conserje;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conserje t1 = new Conserje();
        
        t1.setIdTrabajador(1);
        t1.setNombre("luis");
        t1.setApellido("snhacez");
        t1.setAntiguedad(15);
        t1.setHorasTrabajadas(150);
                
         Funcionario t2 = new Funcionario(2,"carlas","rocal",20,160);
         
          System.out.println(t1);
          System.out.println("sueldo t1 " + t1.sueldo());
          System.out.println(t2);
          System.out.println("sueldo t2 " + t2.sueldo());
    }// fin main
    
}
