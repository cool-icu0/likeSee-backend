package com.cool.likeSee.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用删除请求
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -3589539456711731838L;
    private long id;
}