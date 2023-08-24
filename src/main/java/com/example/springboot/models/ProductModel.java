package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
@Getter
@Setter
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    //numero de controle de versão das classes que forem serializadas
    private static final long serialVerisonUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //UUID é muito usado quando tem uma arquitetura muito distribuida , como microservice,evita conflitos ids universais
    private UUID idProduct;

    private String name;

    private BigDecimal value;
}
