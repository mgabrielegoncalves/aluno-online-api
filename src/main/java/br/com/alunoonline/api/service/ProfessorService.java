package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    // ✅ Criar
    public void criarProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    // ✅ Listar todos
    public List<Professor> listarTodosProfessores() {
        return professorRepository.findAll();
    }

    // ✅ Buscar por ID
    public Optional<Professor> buscarPorId(Long id) {
        return professorRepository.findById(id);
    }

    // ✅ Deletar
    public void deletarProfessorPorId(Long id) {
        professorRepository.deleteById(id);
    }

    // ✅ Atualizar
    public void atualizarProfessor(Long id, Professor professorAtualizado) {
        Optional<Professor> professorExistente = professorRepository.findById(id);

        if (professorExistente.isPresent()) {
            Professor professor = professorExistente.get();

            professor.setNome(professorAtualizado.getNome());
            professor.setEmail(professorAtualizado.getEmail());
            professor.setCpf(professorAtualizado.getCpf());

            professorRepository.save(professor);
        }
    }







}