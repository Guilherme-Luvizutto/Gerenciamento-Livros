package com.books.GerenciamentoLivros.Repositories;

import com.books.GerenciamentoLivros.Models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository <LivroModel, Long> {
}
