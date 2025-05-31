package com.senai.briches.Service;

import com.senai.briches.Interface.AlunoRepository;
import com.senai.briches.Model.Aluno;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
    public List<Aluno> buscarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno criarAluno(Aluno alunos) {
        return alunoRepository.save(alunos);
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }

    public Aluno buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }



}