package com.soft1851.spring.orm.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Post {
  private Integer postId;
  private Integer forumId;
  private String title;
  private String content;
  private String thumbnail;
  private Integer createTime;

}
