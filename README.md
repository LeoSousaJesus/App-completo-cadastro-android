# Sistema de Cadastro

Este é um aplicativo Android simples desenvolvido em Java para realizar o cadastro e a listagem de usuários. O projeto foi construído utilizando as bibliotecas padrão do Android e tem como objetivo demonstrar a navegação entre telas (`Activity`), captura de entrada de dados do usuário e persistência simples em memória utilizando listas (`ArrayList`).

## 📱 Funcionalidades

O aplicativo possui três telas principais com as seguintes funcionalidades:

1.  **Tela Inicial (`MainActivity`)**:
    *   **Cadastrar Usuário**: Um botão que redireciona o usuário para a tela de cadastro.
    *   **Listar Usuários**: Um botão que redireciona para a tela de listagem de usuários cadastrados. Caso não exista nenhum usuário cadastrado, exibe um alerta informando ao usuário.

2.  **Tela de Cadastro (`CadastroActivity`)**:
    *   Permite a entrada de dados do usuário: **Nome**, **Endereço** e **Telefone**.
    *   **Botão Cadastrar**: Ao clicar, solicita confirmação e, em seguida, salva os dados na memória (utilizando a classe `RegistrosManager`).
    *   **Botão Cancelar**: Retorna à tela inicial sem salvar os dados.

3.  **Tela de Listagem (`ListagemActivity`)**:
    *   Exibe os dados (Nome, Telefone e Endereço) dos usuários cadastrados de forma individual.
    *   **Botão Anterior / Próximo**: Permite navegar entre os usuários cadastrados.
    *   **Status do Registro**: Mostra a posição atual na lista (ex: "Registros: 1/3").
    *   **Botão Fechar**: Retorna à tela inicial.

## 🛠️ Tecnologias Utilizadas

*   **Java**: Linguagem de programação principal utilizada no desenvolvimento do app.
*   **Android SDK**: Framework para desenvolvimento Android (Target SDK 34 / Min SDK 23).
*   **XML**: Utilizado para a construção das interfaces de usuário (layouts).
*   **Android Studio / Gradle**: Ambiente de desenvolvimento integrado (IDE) e sistema de build.

## 📂 Estrutura do Projeto

O código-fonte principal está localizado em `app/src/main/java/com/example/sistemadecadastro/`:

*   `MainActivity.java`: Controla a tela inicial e a navegação principal.
*   `CadastroActivity.java`: Controla o formulário de cadastro de novos usuários.
*   `ListagemActivity.java`: Controla a visualização dos dados cadastrados, permitindo navegação entre os registros.
*   `Registro.java`: Classe de modelo (`Model`) que representa um usuário (contendo Nome, Endereço e Telefone).
*   `RegistrosManager.java`: Classe gerenciadora que utiliza o padrão Singleton com um `ArrayList` estático para armazenar os registros em memória enquanto o aplicativo está em execução.

Os layouts em XML estão em `app/src/main/res/layout/`:
*   `activity_main.xml`
*   `activity_cadastro.xml`
*   `activity_listagem.xml`

## 🚀 Como Executar o Projeto

1.  **Pré-requisitos**: Certifique-se de ter o [Android Studio](https://developer.android.com/studio) instalado na sua máquina.
2.  **Clone o Repositório**:
    ```bash
    git clone https://github.com/LeoSousaJesus/App-completo-cadastro-android
    ```
3.  **Abra o Projeto**:
    *   Abra o Android Studio.
    *   Selecione **"Open"** e navegue até a pasta onde você clonou o repositório.
    *   Aguarde o Gradle sincronizar as dependências do projeto.
4.  **Execute o Aplicativo**:
    *   Conecte um dispositivo Android físico via USB (com a depuração USB ativada) ou inicie um Emulador Android (AVD).
    *   Clique no botão **"Run"** (ícone de play verde) na barra de ferramentas superior do Android Studio.

## ⚠️ Observações Importantes

*   **Persistência de Dados**: Atualmente, o aplicativo salva os dados em memória (em um `ArrayList` estático dentro da classe `RegistrosManager`). Isso significa que **todos os dados cadastrados serão perdidos assim que o aplicativo for fechado**. Para manter os dados permanentemente, seria necessário implementar uma solução de banco de dados (como SQLite ou Room) ou armazenamento em nuvem (como Firebase).
*   Existe uma `Cadastro2Activity` no projeto que não está sendo utilizada diretamente no fluxo principal demonstrado acima.
