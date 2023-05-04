package proxy

class SecurityService {

    fun authorization(user: String, password: String): Boolean {
        return if (user == "Uriel" && password == "1234") {
            println("Usuario $user autorizado")
            true
        } else {
            println("Usuario $user NO autorizado")
            false
        }
    }
}
//intenta simular un servicio de seguridad y proporciona un método de autorización
// donde el único usuario válido es oblancarte con el password 1234,
// el servicio regresa true en caso de que la autorización se lleve a cabo con éxito y false en caso contrario.