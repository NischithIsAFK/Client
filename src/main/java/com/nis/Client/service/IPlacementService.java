package com.nis.Client.service;

import com.nis.Client.entity.Placement;

public interface IPlacementService {
    public Placement addPlacement(Placement placement);
    public Placement updatePlacement(Placement placement);
    public Placement searchPlacement(Long id);
    public Boolean cancelPlacement(Long id);
}
