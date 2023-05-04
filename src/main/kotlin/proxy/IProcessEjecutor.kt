package proxy

interface IProcessEjecutor {
    @Throws(Exception::class)
    fun ejecuteProcess(idProcess: Int, user: String?, password: String?)
}
//Interface que define la estructura de los ejecutores de procesos así como de los Proxys