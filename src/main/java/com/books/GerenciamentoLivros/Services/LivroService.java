package com.books.GerenciamentoLivros.Services;

import com.books.GerenciamentoLivros.Models.LivroModel;
import com.books.GerenciamentoLivros.Repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public LivroModel createLivro(LivroModel livroModel) {
        return livroRepository.save(livroModel);
    }

    public List<LivroModel> findAll() {
        return livroRepository.findAll();
    }

    public LivroModel getById(Long id) {
        return livroRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        livroRepository.deleteById(id);
    }

}
