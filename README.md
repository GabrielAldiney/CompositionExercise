# 🛒 Sistema de Pedidos em Java
Projeto desenvolvido como exercício do curso de Java do professor Nélio Alves. Um sistema simples de gerenciamento de pedidos, com foco em programação orientada a objetos.

## 🎯 Objetivo
Cadastrar clientes e produtos, criar pedidos com múltiplos itens e exibir um resumo com o total formatado.
![image](https://github.com/user-attachments/assets/013ff145-c4a3-40c5-bc08-4ab51ce97da7)
![image](https://github.com/user-attachments/assets/1beaddb7-e1d7-4d3d-8f34-03378169555d)

## 📦 Funcionalidades
Cadastro de cliente (nome, e-mail, data de nascimento)

Cadastro de produto

Adição de itens ao pedido

Cálculo automático do total

Resumo formatado do pedido

## 🎯 Resultado Esperado
![image](https://github.com/user-attachments/assets/50ca7a5f-c0ea-4e4e-bfc8-753b15112795)

## 🎯 Resultado Obtido
![image](https://github.com/user-attachments/assets/44f9bd81-2de2-4830-b4e5-7fc856de2667)

## 🧱 Estrutura
Main.java: ponto de entrada

Order.java: pedido (cliente, data, status, itens)

OrderItem.java: item do pedido (produto, quantidade, preço)

Product.java: produto

Client.java: cliente

OrderStatus.java: enum do status (PENDING, PROCESSING, SHIPPED, DELIVERED)

## 🛠️ Tecnologias
Java 17+

Eclipse (ou IDE compatível)

SimpleDateFormat para datas

## ▶️ Como Executar
Clone o repositório

Compile os arquivos .java

Execute Main.java

Insira os dados no terminal conforme solicitado

💡 Ótimo projeto para praticar encapsulamento, composição de objetos e enums em Java.
