package com.riwi.LibrosYa.api.dto.Errors;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ErrorsResponse extends BaseErrorResponse {
    private List<String> Errors;
}
