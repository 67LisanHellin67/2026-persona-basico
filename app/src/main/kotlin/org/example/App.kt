package org.example

class Persona (private var nom: String, private var ape: String, private var eda: Int=67){

    override fun toString():String{
        return "(Persona: ${nom}, Apellido: ${ape}, Edad: ${eda})"
    }
}
fun main(){
    val bro= Persona("Tung Tung","Sahur")
    println(bro)
}
