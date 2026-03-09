# Desafio-API-DIO

Explorando Padrões de Projeto na Prática com Java
Este repositório contém a implementação de três dos principais padrões de projeto definidos pelo "Gang of Four" (GoF), desenvolvidos durante o Lab da Digital Innovation One (DIO). O objetivo é demonstrar a aplicação prática de soluções arquiteturais para problemas comuns no desenvolvimento de software.

🚀 Sobre o Projeto
O projeto foi estruturado em uma implementação de Java Puro, focando na clareza do código e na demonstração técnica de cada padrão. Para garantir a portabilidade e facilitar a execução em diferentes ambientes de desenvolvimento, as lógicas foram consolidadas de forma modular.

🛠️ Padrões de Projeto Implementados
1. Singleton (Creational)
Propósito: Garantir que uma classe tenha apenas uma instância durante todo o ciclo de vida da aplicação.

Implementação: Utilizado o modelo Lazy Holder, que é thread-safe e otimizado para o consumo de memória.

2. Strategy (Behavioral)
Propósito: Definir uma família de algoritmos e torná-los intercambiáveis.

Implementação: Simulação de um Robô que pode alterar seu comportamento de movimentação (Normal ou Agressivo) em tempo de execução sem alterar sua estrutura base.

3. Facade (Structural)
Propósito: Prover uma interface simplificada para um subsistema complexo.

Implementação: Criação de uma interface única para gerenciar a interação entre um sistema de CRM e uma API de busca de CEP, abstraindo a complexidade interna dos subsistemas.
