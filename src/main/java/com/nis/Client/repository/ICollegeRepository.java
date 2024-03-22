package com.nis.Client.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nis.Client.entity.College;
@Repository
public interface ICollegeRepository extends JpaRepository<College, Long> {
    public  College addCollege(College college);
    public College updateCollege(College college);
    public College searchCollege(long id);
    public College deleteCollege(long id);
}

