package com.soft1851.spring.web.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rank {
    private Integer id;
    private String pic;
    private String title;
    private String author;
    private String duration;
}
