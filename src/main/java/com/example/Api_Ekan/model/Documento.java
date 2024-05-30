package com.example.Api_Ekan.model;
import jakarta.persistence.*;
import java.util.Date;
import com.example.Api_Ekan.enums.TipoDocumento;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.print.Doc;


@Entity
@Table(name = "tb_documento")
@Data
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    @NotNull
    @Column(nullable = false)
    private String descricao;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataInclusao;

    @Temporal(TemporalType.DATE)
    private Date dataAtualizacao;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "beneficiario_id",  nullable = false)
    @JsonIgnore
    private Beneficiario beneficiario;

    public void setDataAtualizacaoVazia() {
        this.dataAtualizacao = null;
    }
}



