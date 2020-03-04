

object PruebaEmpaquetado {
  def empaquetado(list: List[Int], c:Int, n:Int): Unit = {
    var lista=List.empty[Int]
    var aux1: Int=0
    var aux2: Int=0
    for(e <- 0 to list.length-1){
      if(list(e)==n){
        aux1+=1
        if(aux1==c){
          for(x <- 1 to aux1){
            lista=lista:+n
            aux2+=1
          }
          aux1=0
        }
      }else{
        aux1=0
      }
    }
    for(e<-lista){
      print(e)
    }
  }
  def main(args: Array[String]): Unit = {
    var lista=List(1,1,1,0,1,0,0,0,0,0,1,1,1)
    println("Lista original")
    for(e<-lista){
      print(e)
    }
    println()
    println("Lista con la secuencia encontrada")
    empaquetado(lista, 2, 1)
  }
}