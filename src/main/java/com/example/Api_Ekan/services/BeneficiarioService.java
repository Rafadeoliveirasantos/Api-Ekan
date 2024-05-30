package com.example.Api_Ekan.services;

import com.example.Api_Ekan.dto.BeneficiarioDTO;
import com.example.Api_Ekan.model.Beneficiario;
import com.example.Api_Ekan.model.Documento;


import java.util.List;

public interface BeneficiarioService {

    Beneficiario cadastrarBeneficiarioComDocumentos(BeneficiarioDTO beneficiarioDTO);

    List<Beneficiario> listarBeneficiarios();

    Documento listarDocumentosBenef(Long id);

    Beneficiario getBenefById(Long id);

    void excluirBeneficiario(Long id);

    void validarBenef(Beneficiario benef);


}
