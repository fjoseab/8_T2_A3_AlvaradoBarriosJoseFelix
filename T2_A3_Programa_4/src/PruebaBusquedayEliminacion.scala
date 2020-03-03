

object Prueba {
    def main(args: Array[String]): Unit = {
      var lista=List("Hola","Este","Es","Un","Programa","Que","Busca","Palabras")
      var lista2=List("Hola","Este","Es")
      var aux: Int=0;
      for(e<-lista){
        for(f<-lista2){
          if(f.equalsIgnoreCase(e)){
            lista=lista.updated(aux, "")
          }
          aux+=1
        }
        aux=0
      }
      for(e<-lista){
        print(e+" ")
      }
    }
}