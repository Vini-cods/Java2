package com.senai.briches.Controller;

import com.senai.briches.Model.Aluno;
import com.senai.briches.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService service) {
        this.alunoService = service;
    }

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.buscarAlunos();
    }

    @PostMapping
    public Aluno salvarNovoAluno(@RequestBody Aluno aluno) {
        return alunoService.criarAluno(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) {
        return alunoService.buscarAlunoPorId(id);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno novoAluno) {
        Aluno alunoExistente = alunoService.buscarAlunoPorId(id);
        if (alunoExistente == null) return null;

        alunoExistente.setNome(novoAluno.getNome());
        alunoExistente.setEmail(novoAluno.getEmail());
        alunoExistente.setTelefone(novoAluno.getTelefone());
        return alunoService.criarAluno(alunoExistente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletarAluno(id);
    }
}
