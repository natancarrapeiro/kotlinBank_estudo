 interface Autenticavel{
     fun autentica(senha: Int): Boolean

}

 /* em casos onde tem que ser uma propidade sencivel é
 aconselhavel nao ser usado assim pois nao é uma
  senha privada de acessos */

// interface Autenticavel {
//     val senha:Int
//     fun autentica(senha: Int): Boolean {
//         //println("autentica pela interface")
//         if (this.senha == senha) {
//             return true
//         } else return false
//     }
// }

