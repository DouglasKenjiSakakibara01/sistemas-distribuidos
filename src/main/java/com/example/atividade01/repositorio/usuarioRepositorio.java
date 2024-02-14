package com.example.atividade01.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.atividade01.entidade.usuario;;

public interface usuarioRepositorio extends JpaRepository<usuario, Long> {
    
}