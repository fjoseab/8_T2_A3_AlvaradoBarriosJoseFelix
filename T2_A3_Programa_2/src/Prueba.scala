

object Prueba {
  def main(args: Array[String]): Unit = {
    var lista=List("Hola","Este","Es","Un","Programa","Que","Busca","Palabras")
    var busqueda="Hola"
    var actualizacion ="Jose"
    var aux: Int=0;
    for(e<-lista){
      if(e.equalsIgnoreCase(busqueda)){
        lista=lista.updated(aux, actualizacion)
      }
      aux+=1
    }
    for(e<-lista){
      print(" "+e)
    }
  }
}