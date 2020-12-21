package com.way.recruithelper.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class PostDetailListVo extends PostListVo implements Serializable {

        private static final long serialVersionUID = 1745335055429635385L;

        private String requirement;

}