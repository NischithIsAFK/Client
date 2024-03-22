package com.nis.Client.service;

import com.nis.Client.entity.Placement;

public interface IPlacementService {
    public Placement addPlacement(Placement placement);
    public Placement updatePlacement(Placement placement);
    public Placement searchPlacement(long id);
    public Boolean cancelPlacement(long id);
}
