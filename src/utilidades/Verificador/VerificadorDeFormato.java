
package utilidades.Verificador;

import javax.swing.JOptionPane;


public class VerificadorDeFormato {
    
    private static Verificador verificador;
    
    
    public static boolean verificarCampoNumerico(Object campoPorVerificar, String mensaje){
        if(!verificador.verificar(campoPorVerificar, TipoValidacion.NO_NULO,TipoValidacion.NUMERICO)){
            JOptionPane.showMessageDialog(null, mensaje);
            return false;
        }
        return true;
    }
    
     public static boolean verificarCampoTexto(Object campoPorVerificar, String mensaje){
        if(!verificador.verificar(campoPorVerificar,TipoValidacion.NO_NULO,TipoValidacion.CADENA_TEXTO_VALIDA)){
            JOptionPane.showMessageDialog(null, mensaje);
            return false;
        }
        return true;
    }


}
