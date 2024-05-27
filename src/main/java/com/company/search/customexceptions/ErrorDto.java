package com.company.search.customexceptions;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorDto {
    private String errorCode;
    private String errorMessage;



}
