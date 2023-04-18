package com.stc.petlove.service.LoaiThuCung;

import com.stc.petlove.dtos.loaithucung.LoaiThuCungDto;
import com.stc.petlove.entities.LoaiThuCung;

public interface LoaiThuCungService {
    public LoaiThuCung getLoaiThuCung(String id);
    public LoaiThuCung create (LoaiThuCungDto dto);

    public LoaiThuCung update (String id, LoaiThuCungDto dto);

    public String delete (String id);
}
