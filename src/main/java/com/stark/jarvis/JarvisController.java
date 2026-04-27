package com.stark.jarvis;

import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JarvisController {

    private final OllamaChatClient chatModel;
    private final JarvisActions jarvisActions;

    public JarvisController(OllamaChatClient chatModel, JarvisActions jarvisActions) {
        this.chatModel = chatModel;
        this.jarvisActions = jarvisActions;
    }

    @GetMapping("/jarvis/chat")
    public String falarComJarvis(@RequestParam(value = "comando") String comando) {
        String comandoLower = comando.toLowerCase();

        if (comandoLower.contains("horas") || comandoLower.contains("hora atual")) {
            return jarvisActions.obterHoraAtual();
        }

        if (comandoLower.contains("agendar")) {
            return jarvisActions.agendarAtividade(comando);
        }


        if (comandoLower.contains("agenda") || comandoLower.contains("compromissos")) {
            return jarvisActions.listarAgenda();
        }

    
        String personalidade = "Você é o Jarvis, assistente do Tony Stark. Responda em português de forma curta, elegante e prestativa. ";
        
        
        return chatModel.call(personalidade + "Pergunta do usuário: " + comando);
    }
}