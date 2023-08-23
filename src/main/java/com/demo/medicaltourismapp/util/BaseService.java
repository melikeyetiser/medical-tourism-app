package com.demo.medicaltourismapp.util;

import com.demo.medicaltourismapp.model.PageDTO;
import com.demo.medicaltourismapp.model.requestDTO.BaseFilterRequestDTO;
import com.demo.medicaltourismapp.util.dbutil.BaseEntity;
import com.demo.medicaltourismapp.util.dbutil.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.UUID;

public abstract class BaseService<Entity extends BaseEntity,
        DTO extends BaseDTO, RequestDTO extends BaseDTO,
        Mapper extends BaseMapper<Entity, DTO, RequestDTO>,
        Repository extends BaseRepository<Entity>> {

    protected abstract Mapper getMapper();

    protected abstract Repository getRepository();


    public DTO save(RequestDTO requestDTO) {
        Entity entity = getMapper().requestDtoToEntity(requestDTO);
        getRepository().save(entity);
        return getMapper().entityToDto(entity);
    }

    public List<DTO> getAll() {
        List<Entity> entityList = getRepository().findAll();
        return getMapper().entityListToDtoList(entityList);
    }

    public DTO update(UUID uuid, RequestDTO requestDTO) {
        Entity entity = getRepository().findByUuid(uuid).orElse(null);
        if (entity != null) {
            entity = getMapper().requestDtoToExistEntity(requestDTO, entity);
            getRepository().save(entity);
            return getMapper().entityToDto(entity);
        } else {
            return null;
        }
    }

    public PageDTO<DTO> getAllByPageable(BaseFilterRequestDTO baseFilterRequestDTO) {


        Pageable pageable;
        if (baseFilterRequestDTO.getSortDTO() != null) {
            if (baseFilterRequestDTO.getSortDTO().getDirectionEnum() == Sort.Direction.ASC) {
                pageable = PageRequest.of(baseFilterRequestDTO.getPageNumber(),baseFilterRequestDTO.getPageSize(),
                        Sort.by(baseFilterRequestDTO.getSortDTO().getColumnName()).ascending());
            } else {
                pageable = PageRequest.of(baseFilterRequestDTO.getPageNumber(),baseFilterRequestDTO.getPageSize(),
                        Sort.by(baseFilterRequestDTO.getSortDTO().getColumnName()).descending());
            }
        } else {
            pageable = PageRequest.of(baseFilterRequestDTO.getPageNumber(),baseFilterRequestDTO.getPageSize(),
                    Sort.by("id").ascending());
        }

        Page<Entity> entityPage = getRepository().findAll(pageable);
        return getMapper().pageEntityToPageDTO(entityPage);
    }

    public DTO getByUUID(UUID uuid) {
        Entity entity = getRepository().findByUuid(uuid).orElse(null);
        if (entity != null) {
            return getMapper().entityToDto(entity);
        } else {
            return null;
        }
    }

    public Boolean deleteByUUID(UUID uuid) {
        Entity entity = getRepository().findByUuid(uuid).orElse(null);
        if (entity != null) {
            getRepository().delete(entity);
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}
