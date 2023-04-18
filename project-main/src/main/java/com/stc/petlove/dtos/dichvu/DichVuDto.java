package com.stc.petlove.dtos.dichvu;

import com.stc.petlove.entities.embedded.GiaDichVu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DichVuDto {
    private String maDichVu;

    private String tenDichVu;

    private String noiDung;

    private List<GiaDichVu> giaDichVus = new ArrayList<>();
}
