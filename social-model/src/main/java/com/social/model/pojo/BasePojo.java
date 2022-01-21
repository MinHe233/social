package com.social.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class BasePojo implements Serializable {

    private Date created;

    private Date updated;

}
