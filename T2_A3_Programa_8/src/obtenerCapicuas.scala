

object obtenerCapicuas {
  def obtenerCapicuas(list:List[String]): Unit ={
    for(e <- 0 to list.length-1){
      if(list(e).reverse.equals(list(e))){
        print(list(e)+" ")
      }  
    }
  }
  def main(args: Array[String]): Unit = {
    var lista=List("10","11","12","22","33","44","1881","12","111")
    obtenerCapicuas(lista)
  }
}