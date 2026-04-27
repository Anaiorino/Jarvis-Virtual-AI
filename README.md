
# JARVIS  | Virtual Assistant Interface

![Status](https://img.shields.io/badge/Status-Operational-00d4ff?style=for-the-badge)
![Tech](https://img.shields.io/badge/Built%20With-Java%20%7C%20JS%20%7C%20HTML5-blue?style=for-the-badge)

Uma interface de assistente virtual, inspirada no sistema **JARVIS** dos filmes do Homen de ferro.

---
⚠️ Status do Desenvolvimento
O sistema de reconhecimento de voz está em fase de implementação. Atualmente, o programa identifica o microfone, mas o processamento de áudio para transcrição de texto ainda está em desenvolvimento.

Após a conclusão, o módulo contará com os seguintes requisitos:

## 🛠️ Funcionalidades Principais

### 🎙️ Interação por Voz (Speech-to-Text)
* **Escuta Inteligente:** Conversão de fala em texto em tempo real via *Web Speech API*.
* **Processamento Intermediário:** O Jarvis exibe o que está a ouvir enquanto o utilizador fala, permitindo uma correção visual imediata.
* **Feedback Sonoro:** Ativação de sistemas com confirmação por áudio ("bip"), simulando a experiência do cinema.

### 📊 Telemetria Visual (Osciloscópio Linear)
* **Monitorização em Tempo Real:** Uma linha de frequência neon (Canvas) que vibra de acordo com a amplitude da voz.
* **Indicador de Conectividade:** Feedback visual instantâneo para garantir que o microfone está a captar áudio corretamente.

### 🧠 Cérebro Híbrido (Processamento)
* **Modo Texto:** Campo de input minimalista para comandos via teclado em ambientes silenciosos.
* **Integração Backend:** Comunicação assíncrona com um servidor **Java** para processamento lógico de comandos.

### 🗣️ Síntese de Voz (Text-to-Speech)
* **Voz Personalizada:** Respostas vocais elegantes com ajustes de *pitch* e *rate* para simular a voz do JARVIS.
* **Design Holográfico:** Estética com animações de *flicker* e brilho neon integrados.

---

## 🚀 Tecnologias

### **Frontend**
* **HTML5 & CSS3 Avançado:** Uso de Flexbox, Keyframes para animações de cintilação e filtros de brilho ciano.
* **Vanilla JavaScript:** Lógica de interface pura para garantir latência zero.
* **Web Speech API:** Motores de reconhecimento e síntese de voz nativos.
* **Web Audio API & Canvas:** Captura de frequências e renderização gráfica do osciloscópio.

### **Backend**
* **Java:** Responsável pela lógica de negócio e motor de inteligência do assistente.
* **Fetch API:** Protocolo para comunicação rápida entre a interface e o servidor.

---

## 🏗️ Arquitetura do Sistema

O fluxo de dados foi desenhado para ser circular e eficiente:

1.  **Input:** O utilizador ativa o microfone ou digita um comando.
2.  **Monitorização:** A linha de áudio vibra no ecrã confirmando a captação.
3.  **Conversão:** O áudio é traduzido para texto localmente no browser.
4.  **Processamento:** O comando é enviado para o servidor Java via requisição HTTP.
5.  **Output:** O JARVIS projeta a resposta visualmente e executa a síntese de voz.

---

## 🔧 Configuração e Instalação

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/seu-usuario/jarvis-interface.git
    ```
2.  **Configure o Backend:**
    Certifique-se de que o seu servidor Java está a correr e a aceitar pedidos no endpoint `/jarvis/chat`.
3.  **Recursos de Mídia:**
    Certifique-se de que os ficheiros `jarvis-hologram.gif` e `bip.mp3` estão na raiz do projeto.
4.  **Execução:**
    Abra o `index.html` num navegador moderno (Chrome ou Brave recomendados).

---
