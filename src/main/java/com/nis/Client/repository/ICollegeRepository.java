package com.nis.Client.repository;

import com.nis.Client.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.Optional;

@Repository
public interface ICollegeRepository extends JpaRepository<College, Long> {
    default College addCollege(College college) {
        Assert.isNull(college.getId(), "College ID for new college should be null");
        return save(college);
    }
    default College updateCollege(College college) {
        Assert.notNull(college.getId(), "College ID for update college should not be null");
        return save(college);
    }
    default Optional<College> searchCollege(Long id) {
        Assert.notNull(id, "College ID for search should not be null");
        return findById(id);
    }
    default void deleteCollege(Long id) {
        Assert.notNull(id, "College ID should not be null");
        deleteById(id);
    }
}

