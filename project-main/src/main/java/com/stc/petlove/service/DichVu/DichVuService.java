package com.stc.petlove.service.DichVu;

import com.stc.petlove.dtos.dichvu.DichVuDto;
import com.stc.petlove.entities.DichVu;

public interface DichVuService {
    public DichVu getDichVu(String id);

    public DichVu create (DichVuDto dichVuDto);

    public DichVu update (String id, DichVuDto dichVuDto);

    public String delete (String id);
}
