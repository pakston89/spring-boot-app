package com.springbootapp.dto;

/**
 * The Park dto class.
 * @author pause
 */
public class ParkGetDto {

    private Integer id;

    private Integer customerId;

    private Long customerIdp;

    private Integer parkingId;

    private Integer parkingLotId;

    private Long startDate;

    private Long endDate;

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
}
