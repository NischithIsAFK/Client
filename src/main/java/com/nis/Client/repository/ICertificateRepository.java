package com.nis.Client.repository;

import com.nis.Client.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICertificateRepository extends JpaRepository<Certificate,Long> {
    public  Certificate addCertificate(Certificate certificate);
    public  Certificate updateCertificate(Certificate certificate);
    public  Certificate searchCertificate(long id);
    public Boolean deleteCertificate(long id);
}
