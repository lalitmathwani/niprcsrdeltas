package org.csr.domain;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 
 * <!ELEMENT License (LOA*)>
 * 
 * <!ATTLIST License State_Code CDATA #REQUIRED
 * 
 * License_Number CDATA #REQUIRED
 * 
 * State_ID CDATA #REQUIRED License_Class CDATA #IMPLIED
 * 
 * License_Status CDATA #IMPLIED License_Class_Code CDATA #IMPLIED
 * 
 * Date_Status_Effective CDATA #IMPLIED
 * 
 * Resident_Indicator CDATA #IMPLIED
 * 
 * License_Issue_Date CDATA #IMPLIED
 * 
 * License_Expiration_Date CDATA #IMPLIED>
 * 
 * @author lalit
 *
 */
public class License extends AbstractDomainObject {

	private String licenseStateCode;
	private String licenseNumber;
	private String stateId;
	private String licenseClass;
	private String licenseStatus;
	private String licenseClassCode;
	private String dateStatusEffective;
	private String residentIndicator;
	private String licenseIssueDate;
	private String licenseExpirationDate;
	private List<LOA> loas;

	public String getLicenseStateCode() {
		return licenseStateCode;
	}

	public void setLicenseStateCode(String licenseStateCode) {
		this.licenseStateCode = licenseStateCode;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getLicenseClass() {
		return licenseClass;
	}

	public void setLicenseClass(String licenseClass) {
		this.licenseClass = licenseClass;
	}

	public String getLicenseStatus() {
		return licenseStatus;
	}

	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}

	public String getLicenseClassCode() {
		return licenseClassCode;
	}

	public void setLicenseClassCode(String licenseClassCode) {
		this.licenseClassCode = licenseClassCode;
	}

	public String getDateStatusEffective() {
		return dateStatusEffective;
	}

	public void setDateStatusEffective(String dateStatusEffective) {
		this.dateStatusEffective = dateStatusEffective;
	}

	public String getResidentIndicator() {
		return residentIndicator;
	}

	public void setResidentIndicator(String residentIndicator) {
		this.residentIndicator = residentIndicator;
	}

	public String getLicenseIssueDate() {
		return licenseIssueDate;
	}

	public void setLicenseIssueDate(String licenseIssueDate) {
		this.licenseIssueDate = licenseIssueDate;
	}

	public String getLicenseExpirationDate() {
		return licenseExpirationDate;
	}

	public void setLicenseExpirationDate(String licenseExpirationDate) {
		this.licenseExpirationDate = licenseExpirationDate;
	}

	public List<LOA> getLoas() {
		return loas;
	}

	public void setLoas(List<LOA> loas) {
		this.loas = loas;
	}

	@Override
	protected EqualsBuilder requiredEqualsCheck(Object obj) {
		License license = (License) obj;
		return new EqualsBuilder().append(getLicenseStateCode(), license.getLicenseStateCode())
				.append(getDateStatusEffective(), license.getDateStatusEffective())
				.append(getLicenseClass(), license.getLicenseClass())
				.append(getLicenseClassCode(), license.getLicenseClassCode())
				.append(getLicenseExpirationDate(), license.getLicenseExpirationDate())
				.append(getLicenseIssueDate(), license.getLicenseIssueDate())
				.append(getLicenseNumber(), license.getLicenseNumber())
				.append(getLicenseStatus(), license.getLicenseStatus()).append(getLoas(), license.getLoas())
				.append(getResidentIndicator(), license.getResidentIndicator())
				.append(getStateId(), license.getStateId());
	}

	@Override
	protected HashCodeBuilder requiredHashCode() {

		return new HashCodeBuilder().append(getLicenseStateCode()).append(getDateStatusEffective())
				.append(getLicenseClass()).append(getLicenseClassCode()).append(getLicenseExpirationDate())
				.append(getLicenseIssueDate()).append(getLicenseNumber()).append(getLicenseStatus()).append(getLoas())
				.append(getResidentIndicator()).append(getStateId());
	}

}
