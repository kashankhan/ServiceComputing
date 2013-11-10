//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.10 at 07:08:26 PM CET 
//


package org.example.hoteldb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rooms" type="{http://www.example.org/HotelDB}RoomList"/>
 *         &lt;element name="bookings" type="{http://www.example.org/HotelDB}BookingList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfo", propOrder = {
    "rooms",
    "bookings"
})
public class HotelInfo {

    @XmlElement(required = true)
    protected RoomList rooms;
    @XmlElement(required = true)
    protected BookingList bookings;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link RoomList }
     *     
     */
    public RoomList getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomList }
     *     
     */
    public void setRooms(RoomList value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the bookings property.
     * 
     * @return
     *     possible object is
     *     {@link BookingList }
     *     
     */
    public BookingList getBookings() {
        return bookings;
    }

    /**
     * Sets the value of the bookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingList }
     *     
     */
    public void setBookings(BookingList value) {
        this.bookings = value;
    }

}