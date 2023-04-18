package com.stc.petlove.service.TaiKhoan;

import com.stc.petlove.dtos.taikhoan.TaiKhoanDto;
import com.stc.petlove.entities.TaiKhoan;

public interface TaiKhoanService {
    public TaiKhoan getTaiKhoan(String id);
    public TaiKhoan create (TaiKhoanDto dto);

    public TaiKhoan update (String id, TaiKhoanDto dto);

   public String delete (String id);
}
