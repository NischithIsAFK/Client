package com.nis.Client.service;


import com.nis.Client.entity.College;
import com.nis.Client.entity.Placement;

public interface ICollegeService {
    public College addCollege(College college);
    public College updateCollege(College college);
    public College searchCollege(long id);
    public Boolean deleteCollege(long id);
    public Boolean schedulePlacement(Placement placement);
}
