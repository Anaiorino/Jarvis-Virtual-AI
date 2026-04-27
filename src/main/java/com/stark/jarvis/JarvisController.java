package com.stark.jarvis;

// Importação específica para a versão que você está usando
import org.springframework.ai.ollama.OllamaChatClient; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JarvisController {

    private final OllamaChatClient chatModel; // Alterado para OllamaChatClient
    private final JarvisActions jarvisActions;

    public JarvisController(OllamaChatClient chatModel, JarvisActions jarvisActions) {
        this.chatModel = chatModel;
        this.jarvisActions = jarvisActions;
    }

    @GetMapping("/jarvis/chat")
    public String falarComJarvis(@RequestParam(value = "comando") String comando) {
        String comandoLower = comando.toLowerCase();

        // 1. Verificação de Horas
        if (comandoLower.contains("horas") || comandoLower.contains("hora atual")) {
            return jarvisActions.obterHoraAtual();
        }

        // 2. Verificação de Agendamento
        if (comandoLower.contains("agendar")) {
            return jarvisActions.agendarAtividade(comando);
        }

        // 3. Verificação de Lista de Compromissos
        if (comandoLower.contains("agenda") || comandoLower.contains("compromissos")) {
            return jarvisActions.listarAgenda();
        }

        // 4. Conversa por IA
        String personalidade = "Você é o Jarvis, assistente do Tony Stark. Responda em português de forma curta, elegante e prestativa. ";
        
        // Na sua versão, o método pode ser .call(String) ou .generate(String)
        return chatModel.call(personalidade + "Pergunta do usuário: " + comando);
    }
}