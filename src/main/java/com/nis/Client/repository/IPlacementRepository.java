package com.nis.Client.repository;

import com.nis.Client.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlacementRepository extends JpaRepository<Placement,Long> {
    public  Placement addPlacement(Placement placement);
    public  Placement updatePlacement(Placement placement);
    public  Placement searchPlacement(long id);
}
