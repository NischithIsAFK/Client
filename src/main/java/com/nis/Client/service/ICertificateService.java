package com.nis.Client.service;

import com.nis.Client.entity.Certificate;

public interface ICertificateService {
    public Certificate addCertificate(Certificate certificate);
    public Certificate updateCertificate(Certificate certificate);
    public Certificate searchCertificate(long id);
    public  Certificate deleteCertificate(long id);

}
