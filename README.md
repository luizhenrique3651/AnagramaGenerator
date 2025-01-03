# Gerador de Anagramas em Java

Este projeto implementa um programa em Java que gera todos os anagramas possíveis a partir de uma string de entrada contendo letras distintas.

## Funcionalidades

- Geração de anagramas únicos de uma string de entrada.
- Validação de entrada para garantir que apenas strings não nulas, não vazias e contendo somente letras sejam processadas.
- Uso de backtracking para explorar todas as combinações possíveis de caracteres.

## Estrutura do Código

1. **Validação de Entrada**: Antes de gerar anagramas, a string fornecida é verificada para garantir que:
   - Não seja nula ou vazia.
   - Contenha apenas caracteres alfabéticos.

2. **Geração Recursiva de Permutações**:
   - O método `permute` utiliza um índice para iterar sobre os caracteres, gerando combinações possíveis por meio de trocas.
   - O método aplica backtracking para explorar todas as permutações possíveis de forma sistemática.

3. **Troca de Caracteres**:
   - O método `swap` realiza a troca de dois caracteres no array, facilitando o processo de permutação.

4. **Interface com o Usuário**:
   - O programa solicita que o usuário insira uma string válida e exibe todos os anagramas gerados.

## Requisitos do Sistema

- **Java**: Versão 8 ou superior.

## Como Executar

1. Clone este repositório:
   ```bash
   git clone <link-do-repositorio>
   ```

2. Compile o programa:
   ```bash
   javac AnagramaGenerator.java
   ```

3. Execute o programa:
   ```bash
   java AnagramaGenerator
   ```

4. Insira uma string válida quando solicitado.

## Exemplo de Uso

### Entrada:
```text
Digite uma string válida:
abc
```

### Saída:
```text
Anagramas de: 'abc': [abc, acb, bac, bca, cab, cba]
```

## Testes Unitários

Os testes podem ser adicionados para validar diferentes casos de entrada, como:
- Entrada válida com várias letras.
- Entrada com uma única letra.
- Entrada inválida (nula, vazia ou com caracteres não alfabéticos).

## Documentação do Código

### Métodos Principais

- **`generateAnagrams(String input)`**: Valida a entrada e inicia a geração de anagramas.
- **`permute(char[] chars, int index, List<String> results)`**: Implementa a lógica de backtracking para gerar permutações.
- **`swap(char[] chars, int i, int j)`**: Troca dois caracteres no array fornecido.

## Contribuição

Sinta-se à vontade para contribuir com melhorias no código ou documentação.

## Licença

Este projeto é distribuído sob a licença MIT.



