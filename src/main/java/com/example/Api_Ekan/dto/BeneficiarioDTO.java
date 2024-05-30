package com.example.Api_Ekan.dto;

import com.example.Api_Ekan.model.Beneficiario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiarioDTO {

    private Long id;
    private String nome;
    private String telefone;
    private Date dataNascimento;
    private List<DocumentoDTO> documentos;

    public static BeneficiarioDTO converter(Beneficiario benef) {
        BeneficiarioDTO dto = new BeneficiarioDTO();
        dto.setId(benef.getId());
        dto.setNome(benef.getNome());
        dto.setTelefone(benef.getTelefone());
        dto.setDataNascimento(benef.getDataNascimento());

        return dto;
    }
}
