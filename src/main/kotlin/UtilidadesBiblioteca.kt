import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Objeto que proporciona utilidades para la biblioteca, como la generación de identificadores únicos.
 */
object UtilidadesBiblioteca {
    private var contadorLibros = 1 // Contador para generar identificadores únicos

    /**
     * Genera un identificador único para un libro.
     * @return El identificador único generado.
     */
    fun generarIdentificadorUnico(): String {
        // Se puede combinar la fecha y hora actual con un contador para obtener un identificador único
        val fechaHoraActual = LocalDateTime.now()
        val formato = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")
        val fechaHoraFormateada = fechaHoraActual.format(formato)
        return "L$fechaHoraFormateada${contadorLibros++}"
    }
}