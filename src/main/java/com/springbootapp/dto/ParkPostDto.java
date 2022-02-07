package com.springbootapp.dto;

/**
 * The Park dto class.
 * @author pause
 */
public class ParkPostDto {

    private Integer id;

    private Integer customerId;

    private Long customerIdp;

    private Integer parkingId;

    private Integer parkingLotId;

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

    @Override
    public String toString() {
        return "ParkPostDto{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", customerIdp=" + customerIdp +
                ", parkingId=" + parkingId +
                ", parkingLotId=" + parkingLotId +
                '}';
    }
}
