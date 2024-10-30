Projeto utilizando Java, com uma classe se referindo ao Funcionario, outra para o funcionarioAssalariado, outra para funcionarioHorista e a outra como Principal para executar o projeto.

🚀 Tema: Sistema de Gestão de Funcionários

Imagine que você está desenvolvendo um sistema de gestão para uma empresa. Esse sistema precisa lidar com diferentes tipos de funcionários, cada um com uma forma distinta de cálculo de bônus. Queremos garantir que todos os tipos de funcionários tenham uma forma de calcular seu bônus anual, mas o cálculo varia de acordo com a categoria do funcionário.

Enunciado:

Crie uma interface chamada Funcionario que defina um método calcularBonus(). Em seguida, crie duas classes que implementem essa interface:

FuncionarioAssalariado: o bônus é um valor fixo de R$ 5.000,00.

FuncionarioHorista: o bônus é calculado como 10% do total anual recebido pelo funcionário.

Após criar as classes, implemente uma classe principal (Main) que crie instâncias dos dois tipos de funcionários e invoque o método calcularBonus() para mostrar o valor do bônus de cada funcionário.
📋 Pré-requisitos

jdk - 17.0.11_windows Eclipse IDE for Java Developers - 2024 -12

Dar exemplos 🔧 1. Instalar o download do JDK 17 2. Instalar o Elipse IDE for Java Developers 3. Abrir o Eclipse 4. Ir até window -> Preferences -> Java -> Installed JREs 5. Adicionar JDK 17a lista de ambientes JRE

Explicação de como deve ser utilizado o projeto 🛠️ Utiliza a Classe Funcionario utilizando o método calcular bonus com o double, depois usa-se a classe FuncionarioAssalariado onde se coloca o valor que irá receber o bonus com o double BONUS_FIXO, após isso, cria-se a classe FuncionarioHorista para colocar o salario por hora recebido e as horas trabalhadas do funcionario, colocando 0.10 de bunus anual. Depois se cria a classe Principal para rodar o programa.

![Diagrama UML Interface](https://github.com/user-attachments/assets/a886f4ce-0bc0-4924-94de-d96d39352b19)


Ferramentas utilizadas e bibliotecas

IDE Eclipse 📌 Versão Eclipse IDE for Java Developers - 2024-12

Versão 1.0 caso seja atualizado manter a descrição inicial e inserir uma nova linha com descrição da atualização. Versão 1.1 - Fatoração data 09/09/24 ✒️ Autores

Alexandre Campos - Etapa Interface - Atividade individual Lista de Exercícios - Etapa Interface
