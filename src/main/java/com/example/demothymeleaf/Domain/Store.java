package com.example.demothymeleaf.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "store")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @Column(name = "store_id")
    private int storeId;

    @OneToOne
    @JoinColumn(name = "manager_staff_id")
    private Staff managerStaff;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}
