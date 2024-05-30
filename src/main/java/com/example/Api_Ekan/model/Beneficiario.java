package com.example.Api_Ekan.model;

import jakarta.persistence.*;


import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;


@Entity
@Table(name = "tb_beneficiarios")
@Data
public class Beneficiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String nome;

    @NotNull
    @Column(nullable = false)
    private String telefone;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataInclusao;

    @Temporal(TemporalType.DATE)
    private Date dataAtualizacao;

    @NotNull
    @Column(nullable = false)
    @OneToMany(mappedBy = "beneficiario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude

    private List<Documento> documentos;
}
