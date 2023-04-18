package com.stc.petlove.service.DatCho;

import com.stc.petlove.dtos.datcho.DatChoDto;
import com.stc.petlove.entities.DatCho;

public interface DatChoService {
    public DatCho getDatCho(String id);

    public DatCho create (DatChoDto datChoDto);

    public DatCho update (String id, DatChoDto datChoDto);

    public String delete (String id);
}
