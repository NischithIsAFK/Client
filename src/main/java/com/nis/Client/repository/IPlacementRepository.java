package com.nis.Client.repository;

import com.nis.Client.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPlacementRepository extends JpaRepository<Placement,Long> {
    default Placement addPlacement(Placement placement){
        return save(placement);
    }
    default Placement updatePlacement(Placement placement) {
        return save(placement);
    }
    default Optional<Placement> searchPlacement(long id){
        return findById(id);
    }
}
