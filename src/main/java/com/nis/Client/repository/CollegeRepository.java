package com.nis.Client.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nis.Client.entity.College;
@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
}
