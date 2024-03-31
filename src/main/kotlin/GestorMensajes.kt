/**
 * Clase que gestiona los mensajes de la aplicación, permitiendo registrar logs y errores.
 */
class GestorMensajes {
    companion object {
        /**
         * Registra un mensaje de log.
         * @param texto El texto del mensaje.
         */
        fun log(texto: String) {
            println("[LOG] $texto")
        }

        /**
         * Registra un mensaje de error.
         * @param texto El texto del mensaje.
         */
        fun error(texto: String) {
            println("[ERROR] $texto")
        }
    }
}