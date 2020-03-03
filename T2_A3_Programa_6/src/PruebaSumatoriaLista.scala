

object PruebaSumatoriaLista {
  def main(args: Array[String]): Unit = {
      var lista=List(1,2,3,4,5,6,7,8,9,10)
      var aux: Int=0;
      for(e <- 0 to lista.length-1){
        if(e>0){
          lista=lista.updated(e, (lista(e-1)+lista(e)))
        }else{
          lista=lista.updated(e, lista(e))
        }
      }
      for(e<-lista){
        print(e+" ")
      }
    }
}