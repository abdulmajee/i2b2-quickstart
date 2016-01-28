//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 08:49:50 PM UTC 
//


package edu.harvard.i2b2.workplace.datavo.wdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for folderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="folderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protected_access" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="share_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parent_index" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entry_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="change_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visual_attributes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tooltip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="work_xml" type="{http://www.i2b2.org/xsd/cell/work/1.1/}xml_valueType"/>
 *         &lt;element name="work_xml_schema" type="{http://www.i2b2.org/xsd/cell/work/1.1/}xml_valueType"/>
 *         &lt;element name="work_xml_i2b2_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "folderType", propOrder = {
    "name",
    "userId",
    "groupId",
    "protectedAccess",
    "shareId",
    "index",
    "parentIndex",
    "entryDate",
    "changeDate",
    "statusCd",
    "visualAttributes",
    "tooltip",
    "workXml",
    "workXmlSchema",
    "workXmlI2B2Type"
})
public class FolderType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "user_id", required = true)
    protected String userId;
    @XmlElement(name = "group_id", required = true)
    protected String groupId;
    @XmlElement(name = "protected_access", required = true)
    protected String protectedAccess;
    @XmlElement(name = "share_id", required = true)
    protected String shareId;
    @XmlElement(required = true)
    protected String index;
    @XmlElement(name = "parent_index", required = true)
    protected String parentIndex;
    @XmlElement(name = "entry_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "change_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlElement(name = "status_cd", required = true)
    protected String statusCd;
    @XmlElement(name = "visual_attributes", required = true)
    protected String visualAttributes;
    @XmlElement(required = true)
    protected String tooltip;
    @XmlElement(name = "work_xml", required = true)
    protected XmlValueType workXml;
    @XmlElement(name = "work_xml_schema", required = true)
    protected XmlValueType workXmlSchema;
    @XmlElement(name = "work_xml_i2b2_type", required = true)
    protected String workXmlI2B2Type;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the protectedAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedAccess() {
        return protectedAccess;
    }

    /**
     * Sets the value of the protectedAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedAccess(String value) {
        this.protectedAccess = value;
    }

    /**
     * Gets the value of the shareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareId() {
        return shareId;
    }

    /**
     * Sets the value of the shareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareId(String value) {
        this.shareId = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the parentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentIndex() {
        return parentIndex;
    }

    /**
     * Sets the value of the parentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentIndex(String value) {
        this.parentIndex = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the statusCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCd() {
        return statusCd;
    }

    /**
     * Sets the value of the statusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCd(String value) {
        this.statusCd = value;
    }

    /**
     * Gets the value of the visualAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualAttributes() {
        return visualAttributes;
    }

    /**
     * Sets the value of the visualAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualAttributes(String value) {
        this.visualAttributes = value;
    }

    /**
     * Gets the value of the tooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Sets the value of the tooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
    }

    /**
     * Gets the value of the workXml property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValueType }
     *     
     */
    public XmlValueType getWorkXml() {
        return workXml;
    }

    /**
     * Sets the value of the workXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValueType }
     *     
     */
    public void setWorkXml(XmlValueType value) {
        this.workXml = value;
    }

    /**
     * Gets the value of the workXmlSchema property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValueType }
     *     
     */
    public XmlValueType getWorkXmlSchema() {
        return workXmlSchema;
    }

    /**
     * Sets the value of the workXmlSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValueType }
     *     
     */
    public void setWorkXmlSchema(XmlValueType value) {
        this.workXmlSchema = value;
    }

    /**
     * Gets the value of the workXmlI2B2Type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkXmlI2B2Type() {
        return workXmlI2B2Type;
    }

    /**
     * Sets the value of the workXmlI2B2Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkXmlI2B2Type(String value) {
        this.workXmlI2B2Type = value;
    }

}
