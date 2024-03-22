package com.nis.Client.repository;

import com.nis.Client.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.Optional;

@Repository
public interface IPlacementRepository extends JpaRepository<Placement,Long> {
    default Placement addPlacement(Placement placement){
        Assert.isNull(placement.getId(),"Placement ID should be null");
        return save(placement);
    }
    default Placement updatePlacement(Placement placement) {
        Assert.notNull(placement.getId(),"Placement ID should not be null");
        return save(placement);
    }
    default Optional<Placement> searchPlacement(Long id){
        Assert.notNull(id,"Placement ID should not be null");
        return findById(id);
    }
}
