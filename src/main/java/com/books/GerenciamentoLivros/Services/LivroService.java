package com.books.GerenciamentoLivros.Services;

import com.books.GerenciamentoLivros.Models.LivroModel;
import com.books.GerenciamentoLivros.Repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public LivroModel createLivro(LivroModel livroModel) {
        return repository.save(livroModel);
    }

    public List<LivroModel> findAll() {
        return repository.findAll();
    }

    public LivroModel getById(Long id) {
        return repository.findById(id).get();
    }

    public void delete(LivroModel livroModel) {
        repository.delete(livroModel);
    }

}
