import java.time.LocalDateTime

/**
 * Data class que representa un préstamo de un libro a un usuario en un momento específico.
 * @property[usuario] El usuario que ha tomado prestado el libro.
 * @property[libro] El libro que ha sido prestado.
 * @property[fechaPrestamo] La fecha en la que se realizó el préstamo (en formato de cadena).
 */

data class Prestamo(val usuario: Usuario, val libro: Libro, val fechaPrestamo: String = LocalDateTime.now().toString())