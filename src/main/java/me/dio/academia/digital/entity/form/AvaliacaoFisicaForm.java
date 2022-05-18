package me.dio.academia.digital.entity.form;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

	@NotNull(message = "Informe um Id de um aluno.")
	@Positive(message = "O Id de um aluno precisa ser positivo.")
	private Long alunoId;

	@NotNull(message = "O campo peso precisa ser preenchido.")
	@Positive(message = "O peso de um aluno precisa ser positivo.")
	private double peso;

	@NotNull(message = "O campo altura precisa ser preenchido.")
	@Positive(message = "A altura de um aluno precisa ser positiva.")
	@DecimalMin(value = "140", message = "A altura precisa ser de no mínimo {value}cm.")
	private double altura;
}
