package com.stark.jarvis;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JarvisActions {

    private final CompromissoRepository repository;

    public JarvisActions(CompromissoRepository repository) {
        this.repository = repository;
    }

    public String obterHoraAtual() {
        ZonedDateTime agora = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        return "Agora são exatamente " + agora.format(DateTimeFormatter.ofPattern("HH:mm")) + ", senhor.";
    }

    public String agendarAtividade(String atividade) {
        String texto = atividade.toLowerCase().replace("agendar", "").replace("jarvis", "").trim();
        
        Compromisso novo = new Compromisso();
        novo.setDescricao(texto);
        repository.save(novo); // Salva no arquivo jarvisdb
        
        return "Com certeza, senhor. Registrei '" + texto + "' no banco de dados.";
    }

    public String listarAgenda() {
        List<Compromisso> todos = repository.findAll();
        if (todos.isEmpty()) return "Sua agenda está limpa no banco de dados, senhor.";
        
        String lista = todos.stream()
                            .map(Compromisso::getDescricao)
                            .collect(Collectors.joining(", "));
        return "Aqui estão seus compromissos salvos: " + lista;
    }
}