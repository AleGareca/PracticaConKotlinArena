package model

object DigitalWalletFactory {
    fun get(): DigitalWallet {
        val s1 = Usuario("Pedro", "Garcia", "PedroGarcia@hotail.com")
        val s2 = Usuario("Pablo", "Perez", "PabloPerez@gmail.com")
        val s3 = Usuario("Pepe", "Martinez", "PepeMartinez@gmail.com")
        return DigitalWallet(mutableListOf(s1,s2,s3))
    }
}