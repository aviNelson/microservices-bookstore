package com.avinelson.backenduser.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PriceDto implements Serializable {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer bookId;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private BookDto book;

    private BigDecimal price;
}
