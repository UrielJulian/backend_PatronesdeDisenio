package proxy

object ServiceFactory {
    fun createProcessEjecutor(): IProcessEjecutor {
        return ProcessEjecutorProxy()
    }
}
//Clase utilizada como Factory, la cual en vez de regresar la clase DefaltProcessEjector regresa una instancia
// de la clase ProcessEjecutorProxy que en realidad es un proxy.