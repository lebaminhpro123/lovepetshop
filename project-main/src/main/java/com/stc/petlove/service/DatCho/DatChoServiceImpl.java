package com.stc.petlove.service.DatCho;

import com.stc.petlove.dtos.datcho.DatChoDto;
import com.stc.petlove.entities.DatCho;
import com.stc.petlove.exception.InvalidException;
import com.stc.petlove.exception.NotFoundException;
import com.stc.petlove.repositories.DatChoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
@Slf4j
@Service
public class DatChoServiceImpl implements DatChoService{

    private DatChoRepository datChoRepository;
    public DatChoServiceImpl(DatChoRepository datChoRepository) {
        this.datChoRepository = datChoRepository;
    }
    @Override
    public DatCho getDatCho(String id) {
        return datChoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Đặt chỗ có id %s không tồn tại", id)));
    }

    @Override
    public DatCho create(DatChoDto datChoDto) {
        DatCho datCho = new DatCho();
        if (ObjectUtils.isEmpty(datChoDto.getEmail())) {
            throw new InvalidException("Email không được bỏ trống");
        }
        if (ObjectUtils.isEmpty(datChoDto.getThongTinDatChos())) {
            throw new InvalidException("Thông chỗ không được bỏ trống");
        }
        if (ObjectUtils.isEmpty(datChoDto.getThoiGian())) {
            throw new InvalidException("Thời gian không được bỏ trống");
        }
        if (ObjectUtils.isEmpty(datChoDto.getCanDan())) {
            throw new InvalidException("Căn dặn không được bỏ trống");
        }
        if (ObjectUtils.isEmpty(datChoDto.getTrangThaiDatCho())) {
            throw new InvalidException("Trạng thái không được bỏ trống");
        }

        datCho.setEmail(datChoDto.getEmail().trim());
        datCho.setThongTinDatChos(datChoDto.getThongTinDatChos());
        datCho.setThoiGian(datChoDto.getThoiGian());
        datCho.setCanDan(datChoDto.getCanDan().trim());
        datCho.setTrangThaiDatCho(datChoDto.getTrangThaiDatCho().trim());
        datChoRepository.save(datCho);
        return datCho;
    }

    @Override
    public DatCho update(String id, DatChoDto datChoDto) {
        DatCho datCho = getDatCho(id);
        if (ObjectUtils.isEmpty(datChoDto.getEmail())) {
            throw new InvalidException("Email không được bỏ trống");
        }
        if (ObjectUtils.isEmpty(datChoDto.getThongTinDatChos())) {
            throw new InvalidException("Thông tin không được bỏ trống");
        }
        if (ObjectUtils.isEmpty(datChoDto.getThoiGian())) {
            throw new InvalidException("Thời gian không được bỏ trống");
        }
        if (ObjectUtils.isEmpty(datChoDto.getCanDan())) {
            throw new InvalidException("Căn dặn không được bỏ trống");
        }
        if (ObjectUtils.isEmpty(datChoDto.getTrangThaiDatCho())) {
            throw new InvalidException("Trạng thái không được bỏ trống");
        }

        datCho.setEmail(datChoDto.getEmail().trim());
        datCho.setThongTinDatChos(datChoDto.getThongTinDatChos());
        datCho.setThoiGian(datChoDto.getThoiGian());
        datCho.setCanDan(datChoDto.getCanDan().trim());
        datCho.setTrangThaiDatCho(datChoDto.getTrangThaiDatCho().trim());
        datChoRepository.save(datCho);
        return datCho;
    }

    @Override
    public String delete(String id) {
        DatCho datCho = getDatCho(id);
        datChoRepository.delete(datCho);
        return String.format("Người dùng đặt chỗ có id %s đã xóa", id);
    }
}
