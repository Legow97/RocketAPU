package com.pxp.SQLite.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "RocketLogs")
@Data
@Builder
public class LogEntity {
    @Id
    private Integer id;

    private	Double	timeRegister;
    private	Double	altitude;
    private	Double	verticalVelocity;
    private	Double	verticalacceleration;
    private	Double	totalVelocity;
    private	Double	totalAcceleration;
    private	Double	latitude;
    private	Double	longitude;
    private	Double	gravitalAcceleration;
    private	Double	motorMass;
    private	Double	longitudinalMomentInertial;
    private	Double	rotationalMomentInertial;
    private	Double	frictionDrag;
    private	Double	pressureDrag;
    private	Double	baseDrag;
    private	Double	verticalOrientation;
    private	Double	lateralOrientation;
    private	Double	windVelocity;
    private	Double	airTemperature;
    private	Double	airPressure;

    public LogEntity(Integer id, Double timeRegister, Double altitude, Double verticalVelocity, Double verticalacceleration, Double totalVelocity, Double totalAcceleration, Double latitude, Double longitude, Double gravitalAcceleration, Double motorMass, Double longitudinalMomentInertial, Double rotationalMomentInertial, Double frictionDrag, Double pressureDrag, Double baseDrag, Double verticalOrientation, Double lateralOrientation, Double windVelocity, Double airTemperature, Double airPressure) {
        this.id = id;
        this.timeRegister = timeRegister;
        this.altitude = altitude;
        this.verticalVelocity = verticalVelocity;
        this.verticalacceleration = verticalacceleration;
        this.totalVelocity = totalVelocity;
        this.totalAcceleration = totalAcceleration;
        this.latitude = latitude;
        this.longitude = longitude;
        this.gravitalAcceleration = gravitalAcceleration;
        this.motorMass = motorMass;
        this.longitudinalMomentInertial = longitudinalMomentInertial;
        this.rotationalMomentInertial = rotationalMomentInertial;
        this.frictionDrag = frictionDrag;
        this.pressureDrag = pressureDrag;
        this.baseDrag = baseDrag;
        this.verticalOrientation = verticalOrientation;
        this.lateralOrientation = lateralOrientation;
        this.windVelocity = windVelocity;
        this.airTemperature = airTemperature;
        this.airPressure = airPressure;
    }

    public LogEntity(){

    }

    public Integer getId() {
        return id;
    }

    public Double getTimeRegister() {
        return timeRegister;
    }

    public Double getAltitude() {
        return altitude;
    }

    public Double getVerticalVelocity() {
        return verticalVelocity;
    }

    public Double getVerticalacceleration() {
        return verticalacceleration;
    }

    public Double getTotalVelocity() {
        return totalVelocity;
    }

    public Double getTotalAcceleration() {
        return totalAcceleration;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getGravitalAcceleration() {
        return gravitalAcceleration;
    }

    public Double getMotorMass() {
        return motorMass;
    }

    public Double getLongitudinalMomentInertial() {
        return longitudinalMomentInertial;
    }

    public Double getRotationalMomentInertial() {
        return rotationalMomentInertial;
    }

    public Double getFrictionDrag() {
        return frictionDrag;
    }

    public Double getPressureDrag() {
        return pressureDrag;
    }

    public Double getBaseDrag() {
        return baseDrag;
    }

    public Double getVerticalOrientation() {
        return verticalOrientation;
    }

    public Double getLateralOrientation() {
        return lateralOrientation;
    }

    public Double getWindVelocity() {
        return windVelocity;
    }

    public Double getAirTemperature() {
        return airTemperature;
    }

    public Double getAirPressure() {
        return airPressure;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTimeRegister(Double timeRegister) {
        this.timeRegister = timeRegister;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public void setVerticalVelocity(Double verticalVelocity) {
        this.verticalVelocity = verticalVelocity;
    }

    public void setVerticalacceleration(Double verticalacceleration) {
        this.verticalacceleration = verticalacceleration;
    }

    public void setTotalVelocity(Double totalVelocity) {
        this.totalVelocity = totalVelocity;
    }

    public void setTotalAcceleration(Double totalAcceleration) {
        this.totalAcceleration = totalAcceleration;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setGravitalAcceleration(Double gravitalAcceleration) {
        this.gravitalAcceleration = gravitalAcceleration;
    }

    public void setMotorMass(Double motorMass) {
        this.motorMass = motorMass;
    }

    public void setLongitudinalMomentInertial(Double longitudinalMomentInertial) {
        this.longitudinalMomentInertial = longitudinalMomentInertial;
    }

    public void setRotationalMomentInertial(Double rotationalMomentInertial) {
        this.rotationalMomentInertial = rotationalMomentInertial;
    }

    public void setFrictionDrag(Double frictionDrag) {
        this.frictionDrag = frictionDrag;
    }

    public void setPressureDrag(Double pressureDrag) {
        this.pressureDrag = pressureDrag;
    }

    public void setBaseDrag(Double baseDrag) {
        this.baseDrag = baseDrag;
    }

    public void setVerticalOrientation(Double verticalOrientation) {
        this.verticalOrientation = verticalOrientation;
    }

    public void setLateralOrientation(Double lateralOrientation) {
        this.lateralOrientation = lateralOrientation;
    }

    public void setWindVelocity(Double windVelocity) {
        this.windVelocity = windVelocity;
    }

    public void setAirTemperature(Double airTemperature) {
        this.airTemperature = airTemperature;
    }

    public void setAirPressure(Double airPressure) {
        this.airPressure = airPressure;
    }

    @Override
    public String toString() {
        return "LogEntity{" +
                "id=" + id +
                ", timeRegister=" + timeRegister +
                ", altitude=" + altitude +
                ", verticalVelocity=" + verticalVelocity +
                ", verticalacceleration=" + verticalacceleration +
                ", totalVelocity=" + totalVelocity +
                ", totalAcceleration=" + totalAcceleration +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", gravitalAcceleration=" + gravitalAcceleration +
                ", motorMass=" + motorMass +
                ", longitudinalMomentInitial=" + longitudinalMomentInertial +
                ", rotationalMomentInertial=" + rotationalMomentInertial +
                ", frictionDrag=" + frictionDrag +
                ", pressureDrag=" + pressureDrag +
                ", baseDrag=" + baseDrag +
                ", verticalOrientation=" + verticalOrientation +
                ", lateralOrientation=" + lateralOrientation +
                ", windVelocity=" + windVelocity +
                ", airTemperature=" + airTemperature +
                ", airPressure=" + airPressure +
                '}';
    }
}
