package com.nis.Client.service;


import com.nis.Client.entity.College;
import com.nis.Client.entity.Placement;

public interface ICollegeService {
    public College addCollege(College college);
    public College updateCollege(College college);
    public College searchCollege(Long id);
    public Boolean deleteCollege(Long id);
    public Boolean schedulePlacement(Placement placement);
}
