# Jogo de Adivinhação (Guessing Game) com Java e RMI

Este é um simples jogo de adivinhação implementado em Java utilizando a tecnologia RMI (Remote Method Invocation). O jogo permite que os jogadores tentem adivinhar um número secreto gerado aleatoriamente pelo servidor.

## Como Jogar

O objetivo do jogo é adivinhar o número secreto, que está entre 1 e 100, inclusive. O servidor gera um número aleatório no início de cada novo jogo. Os jogadores, através de seus clientes, podem enviar um palpite para o servidor. O servidor responde com "O número é maior que " se o palpite for maior que o número secreto, "O número é menor que " se o palpite for menor que o número secreto e "Parabéns! Você acertou!" se o palpite for igual ao número secreto.

### Regras

1. Cada jogador pode fazer uma tentativa de adivinhação por vez, enviando um número entre 1 e 100.
2. Não há limite de tentativas, mas os jogadores são encorajados a usar o mínimo possível de tentativas para adivinhar o número.
3. O jogo suporta múltiplos jogadores simultaneamente. Cada jogador compete para ser o primeiro a adivinhar o número correto.
4. Assim que o número é adivinhado corretamente, o servidor informa todos os jogadores que o jogo terminou e um novo número é gerado para começar outro jogo.
5. O jogador que acertar o número é anunciado vencedor daquela rodada.
6. Jogadores podem entrar ou sair do jogo a qualquer momento.

## Configuração e Execução

Para executar o jogo, você precisará ter o Java JDK instalado em seu sistema. Siga estas etapas:

1. Compile os arquivos Java:
   ```bash
   javac GuessingGameInterface.java GuessingGameServer.java GuessingGameClient.java
2. Execute o servidor:
   ```bash
   java -Djava.security.policy=security.policy Advinhacao.GuessingGameServer
3. Execute o cliente em uma nova janela ou terminal:
   ```bash
   java -Djava.security.policy=security.policy Advinhacao.GuessingGameClient
Siga as instruções exibidas no cliente para interagir com o jogo e divirta-se!
