package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

	/**
	 * @param bairro bairro de residência dos alunos buscados.
	 * @return lista de alunos residentes no bairro informado.
	 */

	List<Matricula> findByAlunoBairro(String bairro);

}
