 import kotlin.io.println as println

    fun main(args: Array<String>) {


        var soma:Int=0
        var maior:Int=0
        var menor:Int=0
        var count:Int=0
        do{

            println("Informe um numero ou 0 para finalizar")

            var numero= readLine()!!.toInt()
            if(count==0){
                menor=numero
                maior=numero
            }
            if(menor>numero && numero!= 0){
                menor=numero
            }
            if(maior<numero){
                maior=numero
            }

            soma += numero
            count++



        }while(numero!=0)
        var  media:Float= (soma/(count-1)).toFloat()
        println("A quantidade de numeros inseridos foram $count \n " +
                "A media deles é igual a $media " +
                "\n A soma deles é igual a $soma" +
                "\n O maior deles é o $maior" +
                "\n O menor é $menor")
    }