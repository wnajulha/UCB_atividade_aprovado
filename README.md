Sistema de Provas Universitárias
Este projeto implementa um sistema simples para cálculo de médias de provas universitárias e verificação de aprovação de alunos, utilizando herança em Java.

Estrutura
ProvaUniversidade: Classe base que contém o método calcularMedia(), responsável por calcular a média das notas.

ProvaUCB e ProvaFafifo: Subclasses de ProvaUniversidade que utilizam o método de cálculo da média e aplicam suas próprias regras de aprovação para determinar se o aluno passou.

Aluno: Representa o aluno, armazenando suas notas e sendo avaliado pelas subclasses de prova.

Funcionalidade
Calcular Média: O método calcularMedia() é herdado e utilizado pelas subclasses para calcular a média de um aluno.

Verificar Aprovação: Cada subclasse possui regras específicas para verificar se o aluno passou com base na média.
