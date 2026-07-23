package com.clinica.back_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Entity
@Table(name = "enderecos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 9)
    @Column(nullable = false, length = 9)
    private String cep;

    @NotBlank
    @Size(max = 150)
    @Column(nullable = false, length = 150)
    private String logradouro;

    @NotBlank
    @Size(max = 10)
    @Column(nullable = false, length = 10)
    private String numero;

    @Size(max = 100)
    @Column(length = 100)
    private String complemento;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String bairro;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String cidade;

    @NotBlank
    @Size(max = 2)
    @Column(nullable = false, length = 2)
    private String estado;
}
