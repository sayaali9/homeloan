package com.SecureHome.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DocumentRequired {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;
	@Lob
	private byte[] adharcard;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] last3monthsalaryslip;
	@Lob
	private byte[] propertyDocument;
	@Lob
	private byte[] bankCheque;
	@Lob
	private byte[] passportsizePhoto;
	@Lob
	private byte[] last6monthbankStatement;

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public byte[] getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(byte[] adharcard) {
		this.adharcard = adharcard;
	}

	public byte[] getPancard() {
		return pancard;
	}

	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}

	public byte[] getLast3monthsalaryslip() {
		return last3monthsalaryslip;
	}

	public void setLast3monthsalaryslip(byte[] last3monthsalaryslip) {
		this.last3monthsalaryslip = last3monthsalaryslip;
	}

	public byte[] getPropertyDocument() {
		return propertyDocument;
	}

	public void setPropertyDocument(byte[] propertyDocument) {
		this.propertyDocument = propertyDocument;
	}

	public byte[] getBankCheque() {
		return bankCheque;
	}

	public void setBankCheque(byte[] bankCheque) {
		this.bankCheque = bankCheque;
	}

	public byte[] getPassportsizePhoto() {
		return passportsizePhoto;
	}

	public void setPassportsizePhoto(byte[] passportsizePhoto) {
		this.passportsizePhoto = passportsizePhoto;
	}

	public byte[] getLast6monthbankStatement() {
		return last6monthbankStatement;
	}

	public void setLast6monthbankStatement(byte[] last6monthbankStatement) {
		this.last6monthbankStatement = last6monthbankStatement;
	}

}
