# Atividade avaliativa - Unidade 1 (listas, filas e pilhas)
## Descrição
Você foi contratado para desenvolver um sistema de gerenciamento de tarefas para uma equipe de desenvolvimento de software na linguagem Java. 
O sistema deve permitir que os membros da equipe adicionem tarefas, removam tarefas concluídas e visualizem as próximas tarefas a serem realizadas.  
O sistema deve ser capaz de lidar com as seguintes operações:
- Adicionar uma nova tarefa à lista.
- Concluir uma tarefa, removendo-a da lista.
- Visualizar a próxima tarefa a ser realizada.

## Estrutura escolhida: Pilha
Visto que, nesse projeto, a primeira tarefa criada sempre terá que ser a primeira a ser concluída, escolhi o armazenamento de tarefas em pilhas. Essa
estrutura segue o padrão "FIFO" ("First-In, First-Out"), isto é, o primeiro elemento adicionado a lista sempre será o primeiro a ser removido, e assim
sucessivamente.

Além disso, essa estrutura de dados me permite facilmente adicionar, remover e visualizar elementos, sem a necessidade de se preocupar com o índice da posição ou ordem dos
objetos. As filas também são escaláveis e capazes de lidar com um grande número de elementos, tornando o sistema mais eficiente.
