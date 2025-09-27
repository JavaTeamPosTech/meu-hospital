package com.postechfiap.meu_hospital.infrastructure.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "enderecos")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name =  "id", columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer numero;
    private String complemento;
    private String cep;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    public EnderecoEntity(String estado, String cidade, String bairro, String rua, Integer numero, String complemento,
                          String cep, UsuarioEntity usuario) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.usuario = usuario;
    }
}
