🛒 Sistema de Gerenciamento de Pedidos em Java
Este pequeno projeto foi um exercício para reforçar o curso de Java do grande professor Nélio Alves.
Trata-se de um sistema simples de gerenciamento de pedidos desenvolvido em Java utilizando princípios de programação orientada a objetos. Ele permite o cadastro de clientes e produtos, bem como a criação de pedidos com múltiplos itens.

🎯 Objetivo
![image](https://github.com/user-attachments/assets/013ff145-c4a3-40c5-bc08-4ab51ce97da7)
![image](https://github.com/user-attachments/assets/1beaddb7-e1d7-4d3d-8f34-03378169555d)

📦 Funcionalidades
Cadastro de cliente (nome, e-mail, data de nascimento)

Cadastro de produto

Adição de itens a um pedido

Cálculo automático do preço total

Exibição formatada do resumo do pedido

🎯 Resultado Esperado
![image](https://github.com/user-attachments/assets/50ca7a5f-c0ea-4e4e-bfc8-753b15112795)

🎯 Resultado Obtido
![image](https://github.com/user-attachments/assets/44f9bd81-2de2-4830-b4e5-7fc856de2667)

🧱 Estrutura do Projeto
Main.java: ponto de entrada da aplicação

Order.java: representa o pedido, incluindo cliente, data, status e itens

OrderItem.java: representa um item do pedido (produto, quantidade e preço)

Product.java: representa o produto

Client.java: representa o cliente

OrderStatus.java: enum para o status do pedido (PENDING, PROCESSING, SHIPPED, DELIVERED)

🛠️ Tecnologias
Java 17+

Eclipse IDE (ou qualquer IDE compatível)

Formatação de datas com SimpleDateFormat

▶️ Como Executar
Clone o repositório

Compile os arquivos .java

Execute o Main.java

Insira os dados solicitados no terminal quando for pedido

💡 Este projeto é ótimo para praticar encapsulamento, composição de objetos e uso de enums em Java.

