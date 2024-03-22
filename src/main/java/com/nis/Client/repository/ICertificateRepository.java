package com.nis.Client.repository;

import com.nis.Client.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.Optional;

@Repository
public interface ICertificateRepository extends JpaRepository<Certificate,Long> {
     default Certificate addCertificate(Certificate certificate){
         Assert.isNull(certificate.getId(),"Certif ID should be null");
        return save(certificate);
    }

    default Certificate updateCertificate(Certificate certificate){
        Assert.notNull(certificate.getId(),"Certif ID should not be null");
         return save(certificate);
    }
    default Optional<Certificate> searchCertificate(Long id){
         Assert.notNull(id,"Certf ID should not be null");
         return findById(id);
    }
    default void deleteCertificate(Long id){
        Assert.notNull(id,"Certf ID should not be null");
         deleteById(id);
    }
}
