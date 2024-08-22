package dio.postgres.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dio.postgres.model.Alunos;
import dio.postgres.repository.AlunosRepository;

@RestController
@RequestMapping("/alunos")
public class AlunosController {
    @Autowired
    AlunosRepository repository;

    @GetMapping
    public List<Alunos> getAlunos(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Alunos> getAlunoById(@PathVariable("id") Integer id){
        return repository.findById(id);
    }
    @GetMapping("/buscar")
    public List<Alunos> getAlunosByNome(@RequestParam("nome") String nome){
        return repository.findByNome(nome);
    }
    @DeleteMapping()
    public void deleteAlunos(){
        repository.deleteAll();
    }
    @DeleteMapping("/{id}")
    public void deleteALunoById(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PutMapping
    public void updateAluno(@RequestBody Alunos aluno){
        repository.save(aluno);
    }
    @PostMapping()
    public void postAluno(@RequestBody Alunos aluno){
        repository.save(aluno);
    }
}
