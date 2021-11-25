package com.hackathon.playground.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Shop {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_idx")
    private Long itemIdx;

    @Column(name = "item_name")
    @Size(max = 45)
    private String itemName;

    @Column(name = "item_price")
    private Long itemPrice;
}
