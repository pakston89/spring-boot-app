package com.springbootapp.model;

import com.springbootapp.util.TableNames;
import javax.persistence.*;

/**
 * The Park entity class.
 * @author pause
 */
@Entity
@Table(name = TableNames.PARKS)
public class Park {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_idp")
    private Long customerIdp;

    @Column(name = "parking_id")
    private Integer parkingId;

    @Column(name = "parking_lot_id")
    private Integer parkingLotId;

    @Column(name = "start_date")
    private Long startDate;

    @Column(name = "end_date")
    private Long endDate;

    public Park() {

    }

    public Park(Integer id, Integer customerId, Long customerIdp, Integer parkingId, Integer parkingLotId, Long startDate, Long endDate) {
        this.id = id;
        this.customerId = customerId;
        this.customerIdp = customerIdp;
        this.parkingId = parkingId;
        this.parkingLotId = parkingLotId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerIdp() {
        return customerIdp;
    }

    public void setCustomerIdp(Long customerIdp) {
        this.customerIdp = customerIdp;
    }

    public Integer getParkingId() {
        return parkingId;
    }

    public void setParkingId(Integer parkingId) {
        this.parkingId = parkingId;
    }

    public Integer getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Integer parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", customerIdp=" + customerIdp +
                ", parkingId=" + parkingId +
                ", parkingLotId=" + parkingLotId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
