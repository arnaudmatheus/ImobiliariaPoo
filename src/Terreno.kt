class Terreno(
    nome:String,
    contato:String,
    endereco: Endereco,
    areaTotal:Double,
    tipoNegocio:Int,
    valor:Double,
):Imovel(
    nome = nome,
    contato = contato,
    endereco = endereco
) {
}