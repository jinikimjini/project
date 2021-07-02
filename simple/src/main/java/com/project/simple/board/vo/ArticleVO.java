package com.project.simple.board.vo;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

import org.springframework.stereotype.Component;


@Component("articleVO")

public class ArticleVO {
	//notice �Խ���
	private int noticeNum;
	private Date noticeDate;
	private String noticeTitle;
	private String noticeWriter;
	private String noticeContent;
	private String noticeImg;

	//question �Խ���
	private int questionNum;
	private String questionTitle;
	private String questionContent;
	
	//inquiry �Խ���
	private String memId;
	private int inquiryNum;
	private String inquiryType;
	private Date inquiryDate;
	private String inquiryTitle;
	private String inquiryContent;
	private String inquiryFile;
	private String inquiryAnswer;
	private String inquiryReq;
	
	
	//notice �Խ���
	public ArticleVO() {
		System.out.println("ArticleVO ������");
	}
	
	public int getNoticeNum() {
		return noticeNum;
	}
	
	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}
	
	public Date getNoticeDate() {
		return noticeDate;
	}
	
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	
	public String getNoticeTitle() {
		return noticeTitle;
	}
	
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle= noticeTitle;
	}
	
	public String getNoticeWriter() {
		return noticeWriter;
	}
	
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	
	public String getNoticeContent() {
		return noticeContent;
	}
	
	public void noticeContentt(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	
	public String getNoticeImg() {
		try {
			if(noticeImg != null & noticeImg.length() !=0) {
				noticeImg = URLDecoder.decode(noticeImg, "utf-8");
			}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} 
			return noticeImg;
		}
	
	public void setNoticeImg(String noticeImg) {
		try {
			if(noticeImg != null && noticeImg.length() !=0) {
				this.noticeImg = URLEncoder.encode(noticeImg, "utf-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	//question �Խ���
	public int getQuestionNum() {
		return questionNum;
	}
	
	public void setQuestionNum(int questionNum) {
		this.questionNum = questionNum;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	
	public String getQuestionContent() {
		return questionContent;
	}
	
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	
	//inquiry �Խ���
	public String getmemId() {
		return memId;
	}
	
	public void setmemId(String memId) {
		this.memId = memId;
	}
	
	public int getInquiryNum() {
		return inquiryNum;
	}
	
	public void setInquiryNum(int inquiryNum) {
		this.inquiryNum = inquiryNum;
	}
	
	public String getInquiryType() {
		return inquiryType;
	}
	
	public void setInquiryNum(String inquiryType) {
		this.inquiryType = inquiryType;
	}
	
	public Date getInquiryDate() {
		return inquiryDate;
	}
	
	public void setInquiryDate(Date inquiryDate) {
		this.inquiryDate = inquiryDate;
	}
	
	public String getInquiryTitle() {
		return inquiryTitle;
	}
	
	public void setInquiryTitle(String inquiryTitle) {
		this.inquiryTitle = inquiryTitle;
	}
	
	public String getInquiryContent() {
		return inquiryContent;
	}
	
	public void setInquiryContent(String inquiryContent) {
		this.inquiryContent = inquiryContent;
	}
	
	public String getInquiryFile() {
		return inquiryFile;
	}
	
	public void setInquiryFile(String inquiryFile) {
		this.inquiryFile = inquiryFile;
	}
	
	public String getInquiryAnswer() {
		return inquiryAnswer;
	}
	
	public void setInquiryAnswer(String inquiryAnswer) {
		this.inquiryAnswer = inquiryAnswer;
	}
	
	public String getInquiryReq() {
		return inquiryReq;
	}
	
	public void setInquiryReq(String inquiryReq) {
		this.inquiryReq = inquiryReq;
	}


}