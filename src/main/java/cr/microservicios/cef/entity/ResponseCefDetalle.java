package cr.microservicios.cef.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseCefDetalle {

	@JsonProperty("codeID")
	private String codeID;

	@JsonProperty("codeTypeEEFF")
	private String codeTypeEEFF;

	@JsonProperty("typeEEFF")
	private String typeEEFF;

	@JsonProperty("dateEEFF")
	private String dateEEFF;

	@JsonProperty("currencyCode")
	private String currencyCode;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("netSales")
	private String netSales;

	@JsonProperty("EBITDA")
	private String ebitda;

	@JsonProperty("heritage")
	private String heritage;

	@JsonProperty("currentAssets")
	private String currentAssets;

	@JsonProperty("currentPasives")
	private String currentPasives;

	@JsonProperty("salesExpenses")
	private String salesExpenses;

	@JsonProperty("admExpenses")
	private String admExpenses;

	@JsonProperty("financialExpenses")
	private String financialExpenses;

	@JsonProperty("depreciation")
	private String depreciation;

	@JsonProperty("amortization")
	private String amortization;

	@JsonProperty("banksCashier")
	private String banksCashier;

	@JsonProperty("bankDebtOverdraft")
	private String bankDebtOverdraft;

	@JsonProperty("partCteLongTermDebt")
	private String partCteLongTermDebt;

	@JsonProperty("intangibleAsset")
	private String intangibleAsset;

	@JsonProperty("netProfit")
	private String netProfit;

	@JsonProperty("totalAssets")
	private String totalAssets;

	@JsonProperty("totalCurrentLiabilities")
	private String totalCurrentLiabilities;

	@JsonProperty("workingCapital")
	private String workingCapital;

	@JsonProperty("totalActive")
	private String totalActive;

	@JsonProperty("totalLiabilities")
	private String totalLiabilities;

	@JsonProperty("otherOperatingIncome")
	private String otherOperatingIncome;

	@JsonProperty("costOfSales")
	private String costOfSales;

	@JsonProperty("totalNonCurrentLiabilities")
	private String totalNonCurrentLiabilities;

	@JsonProperty("longTermBankDebt")
	private String longTermBankDebt;

	@JsonProperty("longTermFinancialDebt")
	private String longTermFinancialDebt;

	public String getCodeID() {
		return codeID;
	}

	public void setCodeID(String codeID) {
		this.codeID = codeID;
	}

	public String getCodeTypeEEFF() {
		return codeTypeEEFF;
	}

	public void setCodeTypeEEFF(String codeTypeEEFF) {
		this.codeTypeEEFF = codeTypeEEFF;
	}

	public String getTypeEEFF() {
		return typeEEFF;
	}

	public void setTypeEEFF(String typeEEFF) {
		this.typeEEFF = typeEEFF;
	}

	public String getDateEEFF() {
		return dateEEFF;
	}

	public void setDateEEFF(String dateEEFF) {
		this.dateEEFF = dateEEFF;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getNetSales() {
		return netSales;
	}

	public void setNetSales(String netSales) {
		this.netSales = netSales;
	}

	public String getEbitda() {
		return ebitda;
	}

	public void setEbitda(String ebitda) {
		this.ebitda = ebitda;
	}

	public String getHeritage() {
		return heritage;
	}

	public void setHeritage(String heritage) {
		this.heritage = heritage;
	}

	public String getCurrentAssets() {
		return currentAssets;
	}

	public void setCurrentAssets(String currentAssets) {
		this.currentAssets = currentAssets;
	}

	public String getCurrentPasives() {
		return currentPasives;
	}

	public void setCurrentPasives(String currentPasives) {
		this.currentPasives = currentPasives;
	}

	public String getSalesExpenses() {
		return salesExpenses;
	}

	public void setSalesExpenses(String salesExpenses) {
		this.salesExpenses = salesExpenses;
	}

	public String getAdmExpenses() {
		return admExpenses;
	}

	public void setAdmExpenses(String admExpenses) {
		this.admExpenses = admExpenses;
	}

	public String getFinancialExpenses() {
		return financialExpenses;
	}

	public void setFinancialExpenses(String financialExpenses) {
		this.financialExpenses = financialExpenses;
	}

	public String getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(String depreciation) {
		this.depreciation = depreciation;
	}

	public String getAmortization() {
		return amortization;
	}

	public void setAmortization(String amortization) {
		this.amortization = amortization;
	}

	public String getBanksCashier() {
		return banksCashier;
	}

	public void setBanksCashier(String banksCashier) {
		this.banksCashier = banksCashier;
	}

	public String getBankDebtOverdraft() {
		return bankDebtOverdraft;
	}

	public void setBankDebtOverdraft(String bankDebtOverdraft) {
		this.bankDebtOverdraft = bankDebtOverdraft;
	}

	public String getPartCteLongTermDebt() {
		return partCteLongTermDebt;
	}

	public void setPartCteLongTermDebt(String partCteLongTermDebt) {
		this.partCteLongTermDebt = partCteLongTermDebt;
	}

	public String getIntangibleAsset() {
		return intangibleAsset;
	}

	public void setIntangibleAsset(String intangibleAsset) {
		this.intangibleAsset = intangibleAsset;
	}

	public String getNetProfit() {
		return netProfit;
	}

	public void setNetProfit(String netProfit) {
		this.netProfit = netProfit;
	}

	public String getTotalAssets() {
		return totalAssets;
	}

	public void setTotalAssets(String totalAssets) {
		this.totalAssets = totalAssets;
	}

	public String getTotalCurrentLiabilities() {
		return totalCurrentLiabilities;
	}

	public void setTotalCurrentLiabilities(String totalCurrentLiabilities) {
		this.totalCurrentLiabilities = totalCurrentLiabilities;
	}

	public String getWorkingCapital() {
		return workingCapital;
	}

	public void setWorkingCapital(String workingCapital) {
		this.workingCapital = workingCapital;
	}

	public String getTotalActive() {
		return totalActive;
	}

	public void setTotalActive(String totalActive) {
		this.totalActive = totalActive;
	}

	public String getTotalLiabilities() {
		return totalLiabilities;
	}

	public void setTotalLiabilities(String totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}

	public String getOtherOperatingIncome() {
		return otherOperatingIncome;
	}

	public void setOtherOperatingIncome(String otherOperatingIncome) {
		this.otherOperatingIncome = otherOperatingIncome;
	}

	public String getCostOfSales() {
		return costOfSales;
	}

	public void setCostOfSales(String costOfSales) {
		this.costOfSales = costOfSales;
	}

	public String getTotalNonCurrentLiabilities() {
		return totalNonCurrentLiabilities;
	}

	public void setTotalNonCurrentLiabilities(String totalNonCurrentLiabilities) {
		this.totalNonCurrentLiabilities = totalNonCurrentLiabilities;
	}

	public String getLongTermBankDebt() {
		return longTermBankDebt;
	}

	public void setLongTermBankDebt(String longTermBankDebt) {
		this.longTermBankDebt = longTermBankDebt;
	}

	public String getLongTermFinancialDebt() {
		return longTermFinancialDebt;
	}

	public void setLongTermFinancialDebt(String longTermFinancialDebt) {
		this.longTermFinancialDebt = longTermFinancialDebt;
	}

}
