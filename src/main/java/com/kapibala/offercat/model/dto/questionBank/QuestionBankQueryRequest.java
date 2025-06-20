package com.kapibala.offercat.model.dto.questionBank;

import com.kapibala.offercat.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 查询题库请求
 *

 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionBankQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;


    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片
     */

    private String picture;



    /**
     * 创建用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}