package br.com.developer.ediaristas.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.developer.ediaristas.core.exceptions.ServicoNaoEncontradoException;
import br.com.developer.ediaristas.core.models.Servico;
import br.com.developer.ediaristas.core.repositories.ServicoRepository;
import br.com.developer.ediaristas.web.dtos.ServicoForm;
import br.com.developer.ediaristas.web.mappers.WebServicoMapper;

@Service
public class WebServicoService {

    @Autowired
    private ServicoRepository repository;

    @Autowired
    private WebServicoMapper mapper;

    public List<Servico> buscarTodos() {
        return repository.findAll();
    }

    public Servico cadastrar(ServicoForm form) {
        var model = mapper.toModel(form);

        return repository.save(model);
    }

    public Servico buscarPorId(Long id) {
        var servicoEncontrado = repository.findById(id);
        if (servicoEncontrado.isPresent()) {
            return servicoEncontrado.get();
        }
        var messagem = String.format("Serviço com ID %d não encontrado", id);
        throw new ServicoNaoEncontradoException(messagem);
    }

    public Servico editar(ServicoForm form, Long id) {
        var servicoEncontrado = buscarPorId(id);

        var model = mapper.toModel(form);
        model.setId(servicoEncontrado.getId());

        return repository.save(model);
    }

    public void excluirPorId(Long id) {
        var servicoEncontrado = buscarPorId(id);

        repository.delete(servicoEncontrado);
    }
}
