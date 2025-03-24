//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() { // Função que vai executar o código
    println("Exercício 1") // Exibe o texto "Exercício 1"
    ex1() // Chama a função do exercício 1
    println() // Não exibe nada, usado para pular linha

    println("Exercício 2") // Exibe o texto "Exercício 2"
    ex2() // Chama a função do exercício 2
    println() // Não exibe nada, usado para pular linha

    println("Exercício 3") // Exibe o texto "Exercício 3"
    ex3() // Chama a função do exercício 3
    println() // Não exibe nada, usado para pular linha

    println("Exercício 4") // Exibe o texto "Exercício 4"
    ex4() // Chama a função do exercício 4
    println() // Não exibe nada, usado para pular linha

    println("Exercício 5") // Exibe o texto "Exercício 5"
    ex5() // Chama a função do exercício 5
    println() // Não exibe nada, usado para pular linha

    println("Exercício 6") // Exibe o texto "Exercício 6"
    ex6() // Chama a função do exercício 6
    println() // Não exibe nada, usado para pular linha

    println("Exercício 7") // Exibe o texto "Exercício 7"
    ex7() // Chama a função do exercício 7
    println() // Não exibe nada, usado para pular linha

    println("Exercício 8") // Exibe o texto "Exercício 8"
    ex8() // Chama a função do exercício 8
    println() // Não exibe nada, usado para pular linha

    println("Exercício 9") // Exibe o texto "Exercício 9"
    ex9() // Chama a função do exercício 9
    println() // Não exibe nada, usado para pular linha

    println("Exercício 10") // Exibe o texto "Exercício 10"
    ex10() // Chama a função do exercício 10
    println() // Não exibe nada, usado para pular linha

}

// Exercício 1
fun ex1() { // Função do exercício 1
    val nome = "João" // Cria uma variável imutável do tipo String ( ainda que não especificada )
    if (nome == "João") { // Se o nome for igual a "João"
        println("Meu nome é $nome") // Exibe "Meu nome é $nome"
    } else { // Se não
        println("Meu nome não é $nome") // Exibe Meu nome não é $nome
    }
}

// Exercício 2
fun ex2() { // Função do exercício 2
    val a = 4 // Cria uma variável imutável do tipo Int ( ainda que não especificada )
    when (a) { // Quando "a"
        1 -> println("a = 1") // For igual a 1, exibe "a = 1"
        2 -> println("a = 2") // For igual a 2, exibe "a = 2"
        3 -> println("a = 3") // For igual a 3, exibe "a = 3"
        4 -> println("a = 4") // For igual a 4, exibe "a = 4"

        else -> { // Se não
            println("a possui outro valor") // Exibe "a possui outro valor"
        }
    }

}

// Exercício 3
fun ex3() { // Função do exercício 3
    for (i in 1..7) // Para i entre 1 e 7
        println("Corinthians tem $i Brasileirão(ões)") // Exibe "Corinthians tem $i Brasileirão(ões)"
}

// Exercício 4
fun ex4() { // Função do exercício 4
    val array: Array<String> = // Cria um array do tipo String ( especificado )
        arrayOf("Paulista", "CDB", "Supercopa", "Copínha", "Brasileirão", "Libertadores", "Mundial") // Usa o arrayOf para inicializar o array e especifica os itens
    for (i in array) { // Para i no array ( na variável array )
        println("Corinthians tem: $i") // Exibe "Corinthians tem: $i"
    }
}

// Exercício 5
fun ex5() { // Função do exercício 5
    val array2 = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // Cria um array do tipo Int ( ainda que não especificado ) e usa o arrayOf para inicializar o array e especifica os itens
    val exibiarray = array2[6] // Cria uma variável para exibir o elemento na 6° posição do array ( equivalente ao 7º elemento. Porque sempre começa na posição 0 )
    println(exibiarray) // Exibe essa variável que exibe a 6° posição do array
}

// Exercício 6
fun ex6() { // Função do exercício 6
    var idade = 1 // Cria uma variável mutável ( porque seu valor vai ser alterado ) do tipo Int ( ainda que não especificada )
    while (idade <= 16) { // Enquanto o valor de idade for menor ou igual a 16
        println("Eu tenho $idade ano(s)") // Exibe "Eu tenho $idade ano(s)"
        idade++ // Incrementar o valor de uma variável, aumenta o valor da variável "idade" em 1.
    }

}

// Exercício 7
fun ex7() { // Função do exercício 7
    val so1 = 27 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) definindo o 1° número da soma
    val so2 = 16 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) definindo o 2° número da soma
    val soma = so1 + so2 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) calculando a soma
    println(soma) // Exibe a variável que faz o cálculo "soma"
}

// Exercício 8
fun ex8() { // Função do exercício 8
    val su1 = 50 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) definindo o 1° número da subtração
    val su2 = 25 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) definindo o 2° número da subtração
    val subtracao = su1 - su2 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) calculando a subtração
    println(subtracao) // Exibe a variável que faz o cálculo "subtracao"
}

// Exercício 9
fun ex9() { // Função do exercício 9
    val mult1 = 5 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) definindo o 1° número da multiplicação
    val mult2 = 2 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) definindo o 2° número da multiplicação
    val multiplicacao = mult1 * mult2 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) calculando a multiplicação
    println(multiplicacao) // Exibe a variável que faz o cálculo "multiplicacao"
}

// Exercício 10
fun ex10() { // Função do exercício 10
    val div1 = 200 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) definindo o 1° número da divisão
    val div2 = 100 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) definindo o 2° número da divisão
    val divisao = div1 / div2 // Cria uma variável imutável do tipo Int ( ainda que não especificada ) calculando a divisão
    println(divisao) // Exibe a variável que faz o cálculo "divisao"
}