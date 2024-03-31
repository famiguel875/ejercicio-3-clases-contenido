/**
 * Clase que representa un usuario de la biblioteca.
 * @property[id] El identificador único del usuario.
 * @property[nombre] El nombre del usuario.
 */
class Usuario(private val id: String, private val nombre: String) {
    private val librosPrestados = mutableListOf<Libro>()

    /**
     * Agrega un libro a la lista de libros prestados del usuario.
     * @param libro El libro a agregar.
     */
    fun agregarLibroPrestado(libro: Libro) {
        librosPrestados.add(libro)
    }

    /**
     * Quita un libro de la lista de libros prestados del usuario.
     * @param libro El libro a quitar.
     */
    fun quitarLibroPrestado(libro: Libro) {
        librosPrestados.remove(libro)
    }

    /**
     * Consulta los libros prestados por el usuario.
     * @return Lista de libros prestados por el usuario.
     */
    fun consultarLibrosPrestados(): List<Libro> {
        return librosPrestados.toList()
    }

    /**
     * Obtiene el ID del usuario.
     * @return El ID del usuario.
     */
    fun obtenerId(): String {
        return id
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    fun obtenerNombre(): String {
        return nombre
    }
}