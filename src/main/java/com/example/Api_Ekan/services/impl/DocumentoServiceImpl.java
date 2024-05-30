package com.example.Api_Ekan.services.impl;

import org.springframework.stereotype.Service;
import com.example.Api_Ekan.model.Documento;
import com.example.Api_Ekan.enums.TipoDocumento;
import com.example.Api_Ekan.exception.RegraNegocioException;
import com.example.Api_Ekan.services.DocumentoService;




@Service
public class DocumentoServiceImpl implements DocumentoService {
    @Override
    public void validarDoc(Documento doc) {

        if (doc.getTipoDocumento() == null ||
                (doc.getTipoDocumento() != TipoDocumento.CNPJ && doc.getTipoDocumento() != TipoDocumento.CPF)) {
            throw new RegraNegocioException("Informe um tipo de documento válido (CNPJ ou CPF).");
        }

        if (doc.getDescricao() == null || doc.getDescricao().trim().isEmpty()) {
            throw new RegraNegocioException("Informe á Descrição do Documento.");
        }

    }
}
