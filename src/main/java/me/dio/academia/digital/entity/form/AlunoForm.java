package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

	@NotBlank(message = "O nome precisa ser preenchido.")
	@Size(min = 3, max = 50, message = "Nome precisa conter entre {min} e {max} caracteres.")
	private String nome;

	@NotBlank(message = "O campo cpf precisa ser preenchido.")
	@CPF(message = "O cpf '${validatedValue}' é inválido.")
	private String cpf;

	@NotBlank(message = "O campo bairro precisa ser preenchido.")
	@Size(min = 3, max = 50, message = "Bairro precisa conter entre {min} e {max} caracteres.")
	private String bairro;

	@NotNull(message = "O campo data precisa ser preenchido.")
	@Past(message = "A data '${validatedValue}' é inválida.")
	private LocalDate dataDeNascimento;

}
