package com.avinelson.bookservice.mapper;

import com.avinelson.bookservice.entity.Author;
import com.avinelson.bookservice.dto.AuthorDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author dtoToEntity(AuthorDto authorDto);

    AuthorDto entityToDto(Author author);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Author updateAuthorEntityFromAuthorDto(AuthorDto authorDto, @MappingTarget Author author);
}
