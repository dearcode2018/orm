/**
 * 描述: 
 * IdCardVo.java
 * @author qye.zhenge
 * 
 *  version 1.0
 */
package com.hua.vo.o2o;

import java.util.Date;

import com.hua.vo.BaseVo;

/**
 * 描述: 
 * @author qye.zhenge
 * 
 * IdCardVo
 */
public final class IdCardVo extends BaseVo
{

	 /* long */
	private static final long serialVersionUID = 1L;

	/* 身份证标题, 例如 : 中华人民共和国 - 居民身份证 */
	private String title;
	
	/* 卡id号 */
	private String cardId;
	
	/* 签发机关 (Xx市公安局) */
	private String issuingAuthority;
	
	/* 生效日期 yyyy-MM-dd */
	private Date effectiveDate;
	
	/* 失效日期 yyyy-MM-dd */
	private Date expiryDate;

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the cardId
	 */
	public String getCardId()
	{
		return cardId;
	}

	/**
	 * @param cardId the cardId to set
	 */
	public void setCardId(String cardId)
	{
		this.cardId = cardId;
	}

	/**
	 * @return the issuingAuthority
	 */
	public String getIssuingAuthority()
	{
		return issuingAuthority;
	}

	/**
	 * @param issuingAuthority the issuingAuthority to set
	 */
	public void setIssuingAuthority(String issuingAuthority)
	{
		this.issuingAuthority = issuingAuthority;
	}

	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate()
	{
		return effectiveDate;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate)
	{
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate()
	{
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate)
	{
		this.expiryDate = expiryDate;
	}
	
}
