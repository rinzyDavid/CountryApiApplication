package com.agpay.test.controller.dto;

import com.agpay.test.data.model.Page;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class ResponseDto {

    private Page data;
    private int status;


}
