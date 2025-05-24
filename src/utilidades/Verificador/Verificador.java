package utilidades.Verificador;

public class Verificador {

    public boolean verificar(Object valor, TipoValidacion... validaciones) {
        for (TipoValidacion validacion : validaciones) {
            switch (validacion) {
                case NO_NULO:
                    if (valor == null) {
                        return false;
                    }
                    break;
                case NUMERICO:
                    if (!esNumerico(valor)) {
                        return false;
                    }
                    break;
                case CADENA_TEXTO_VALIDA:
                    if (!esCadenaTextoValida(valor)) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
     
    private boolean esNumerico(Object valor) {
        if (valor == null) return false;
        try {
            Double.valueOf(valor.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean esCadenaTextoValida(Object valor) {
        if (valor == null) return false;
        String texto = valor.toString().trim();
        return !texto.isEmpty();
    }
    
    
}