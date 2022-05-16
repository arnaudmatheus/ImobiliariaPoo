object Controller{
    private val listaImoveis: MutableList<Imovel> = arrayListOf()

    fun criaEndereco(rua:String,cep:String,referecia:String):Endereco{
        return Endereco(rua,cep,referecia)
    }

    fun criaApartamento(nome:String,contato:String,
                        area:Double, quartos:Int,
                        vagaGaragem:Int, tipoNegocio:Int,valor:Double,
                        endereco: Endereco){

        listaImoveis.add(Apartamento(nome,contato,endereco,area,quartos,vagaGaragem,tipoNegocio,valor))
    }
    fun criaCasa(nome: String,contato: String,
                 endereco: Endereco,areaConstruida:Double,
                 areaTotal:Double,quartos: Int,tipoNegocio: Int){
        listaImoveis.add(Casa(nome,contato,endereco, areaConstruida,areaTotal,quartos,tipoNegocio ))
    }

    fun criaTerreno(nome:String,contato: String,endereco: Endereco,
                    areaTotal: Double,tipoNegocio: Int,valor: Double){
        listaImoveis.add(Terreno(nome, contato, endereco, areaTotal, tipoNegocio, valor))
    }
    fun view(){
        println("lista de imoveis $listaImoveis")
    }


}