package com.nis.Client.repository;

import com.nis.Client.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICertificateRepository extends JpaRepository<Certificate,Long> {
     default Certificate addCertificate(Certificate certificate){
        return save(certificate);
    }

    default Certificate updateCertificate(Certificate certificate){
         return save(certificate);
    }
    default Optional<Certificate> searchCertificate(long id){
         return findById(id);
    }
    default void deleteCertificate(long id){
         deleteById(id);
    }
}
