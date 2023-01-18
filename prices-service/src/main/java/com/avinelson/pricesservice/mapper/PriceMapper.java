package com.avinelson.pricesservice.mapper;

import com.avinelson.pricesservice.dto.PriceDto;
import com.avinelson.pricesservice.entity.Price;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    Price dtoToEntity(PriceDto priceDto);

    PriceDto entityToDto(Price price);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Price updatePriceFromPriceDto(PriceDto priceDto, @MappingTarget Price price);
}
