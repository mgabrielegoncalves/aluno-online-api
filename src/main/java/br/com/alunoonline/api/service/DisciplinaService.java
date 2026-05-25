package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Disciplina;
import br.com.alunoonline.api.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    // CREATE
    public void criarDisciplina(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }

    // READ - LISTAR TODAS
    public List<Disciplina> listarTodasDisciplinas() {
        return disciplinaRepository.findAll();
    }

    // READ - BUSCAR POR ID
    public Optional<Disciplina> buscarDisciplinaPorId(Long id) {
        return disciplinaRepository.findById(id);
    }

    // DELETE
    public void deletarDisciplinaPorId(Long id) {
        disciplinaRepository.deleteById(id);
    }

    // UPDATE
    public void atualizarDisciplinaPorId(Long id, Disciplina disciplinaEditada) {

        Disciplina disciplina = disciplinaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Disciplina não encontrada"));

        disciplina.setNome(disciplinaEditada.getNome());
        disciplina.setCargaHoraria(disciplinaEditada.getCargaHoraria());
        disciplina.setProfessor(disciplinaEditada.getProfessor());

        disciplinaRepository.save(disciplina);
    }
}