package com.hackathon.playground.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class InventoryID implements Serializable {
    private Long user_idx;

    private Long shop_idx;
}
