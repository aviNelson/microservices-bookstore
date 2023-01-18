package com.avinelson.bookservice.mapper;

import com.avinelson.bookservice.dto.BookDto;
import com.avinelson.bookservice.entity.Book;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book dtoToEntity(BookDto bookDto);

    BookDto entityToDto(Book book);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Book updateBookEntityFromBookDto(BookDto bookDto, @MappingTarget Book book);
}
