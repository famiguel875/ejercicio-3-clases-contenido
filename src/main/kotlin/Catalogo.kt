/**
 * Clase que representa un catálogo de la biblioteca, proporcionando métodos para generar informes
 * sobre los libros disponibles, prestados y detallados.
 * @property[inventario] El gestor de la biblioteca que contiene los libros y su información.
 */
class Catalogo(private val inventario: GestorBiblioteca) {
    /**
     * Genera un informe detallado de todos los libros en el catálogo.
     */
    fun catalogoLibrosCompleto() {
        GestorMensajes.log("\nInforme Detallado Completo de la Biblioteca:")
        inventario.listarTodosLosLibros().forEach { libro ->
            GestorMensajes.log("- ${libro.titulo} (UUID: ${libro.id}) - Titulo: ${libro.titulo} - Autor: ${libro.autor} - Año de publicación: ${libro.anioPublicacion} - Tematica: ${libro.tematica} - Estado: ${libro.estado}")
        }
    }

    /**
     * Genera un informe de los libros disponibles para préstamo.
     */
    fun catalogoLibrosDisponibles() {
        GestorMensajes.log("\nInforme de Libros Disponibles para Préstamo:")
        inventario.listarLibrosDisponibles().forEach { libro ->
            GestorMensajes.log("- ${libro.titulo} (UUID: ${libro.id}) - Titulo: ${libro.titulo} - Autor: ${libro.autor} - Año de publicación: ${libro.anioPublicacion} - Tematica: ${libro.tematica} - Estado: ${libro.estado}")
        }
    }

    /**
     * Genera un informe de los libros actualmente prestados.
     */
    fun catalogoLibrosPrestados() {
        GestorMensajes.log("\nInforme de Libros Actualmente Prestados:")
        inventario.listarLibrosPrestados().forEach { libro ->
            GestorMensajes.log("- ${libro.titulo} (UUID: ${libro.id}) - Titulo: ${libro.titulo} - Autor: ${libro.autor} - Año de publicación: ${libro.anioPublicacion} - Tematica: ${libro.tematica} - Estado: ${libro.estado}")
        }
    }
}