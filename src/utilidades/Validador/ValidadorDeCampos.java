package utilidades.Validador;

public class ValidadorDeCampos {

    public static boolean validarCampo(Object valor, TipoValidacion... validaciones) {
        for (TipoValidacion validacion : validaciones) {
            switch (validacion) {
                case NO_NULO -> {
                    if (valor == null) {
                        return false;
                    }
                }
                case NUMERICO -> {
                    if (!esNumerico(valor)) {
                        return false;
                    }
                }
                case CADENA_TEXTO_VALIDA -> {
                    if (!esCadenaTextoValida(valor)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
     
    private static boolean esNumerico(Object valor) {
        if (valor == null) return false;
        try {
            Double.valueOf(valor.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean esCadenaTextoValida(Object valor) {
        if (valor == null) return false;
        String texto = valor.toString().trim();
        return !texto.isEmpty();
    }
    
    
}