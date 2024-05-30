package com.example.Api_Ekan.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Api_Ekan.model.Documento;
import java.util.List;
import com.example.Api_Ekan.model.Beneficiario;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

    List<Documento> findByBeneficiario(Beneficiario beneficiario);
}
