package io.gonzo.jpa.app.domain.basic;

import io.gonzo.jpa.app.domain.base.DomainEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "PRODUCT_TYPE")
public class ProductType extends DomainEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(mappedBy = "productType")
    private List<Product> products;

    public ProductType(String name) {
        this.name = name;
    }

}
